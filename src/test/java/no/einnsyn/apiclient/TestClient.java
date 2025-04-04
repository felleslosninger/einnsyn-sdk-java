package no.einnsyn.apiclient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;
import no.einnsyn.sdk.EInnsynClient;
import no.einnsyn.sdk.common.exceptions.models.NotFoundException;
import no.einnsyn.sdk.common.exceptions.models.ValidationException;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.arkiv.ArkivOperations;
import no.einnsyn.sdk.entities.arkiv.models.Arkiv;
import no.einnsyn.sdk.entities.arkivdel.ArkivdelOperations;
import no.einnsyn.sdk.entities.arkivdel.models.Arkivdel;
import no.einnsyn.sdk.entities.arkivdel.models.SortOrderEnum;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;
import no.einnsyn.sdk.entities.journalpost.models.JournalposttypeEnum;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;
import no.einnsyn.sdk.entities.saksmappe.models.SaksmappeRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestClient {

  static String baseUrl = System.getProperty("baseUrl");
  static EInnsynClient client =
      new EInnsynClient(baseUrl != null ? baseUrl : "http://localhost:8080", "secret_changeme");
  static Arkiv arkiv;
  static Arkivdel arkivdel;

  @BeforeAll
  static void setUp() throws Exception {
    ArkivOperations arkivOperations = client.arkiv();
    arkiv = arkivOperations.add(builder -> builder.tittel("ParentArkivdel"));
    assertNotNull(arkiv);
    arkivdel = arkivOperations.addArkivdel(arkiv.getId(), (builder -> builder.tittel("Arkivdel")));
    assertNotNull(arkivdel);
  }

  @Test
  void initializeClient() throws Exception {
    assertNotNull(client);

    SaksmappeRequest.Builder saksmappeBuilder =
        new SaksmappeRequest.Builder()
            .offentligTittel("TEST")
            .saksaar(2024)
            .offentligTittelSensitiv("fooSensitiv");

    // Insert saksmappe with missing property
    assertThrows(
        ValidationException.class,
        () -> {
          client.arkivdel().addSaksmappe(arkivdel.getId(), saksmappeBuilder.build());
        });

    // Insert saksmappe
    saksmappeBuilder.sakssekvensnummer(19);
    Saksmappe saksmappeResponse =
        client.arkivdel().addSaksmappe(arkivdel.getId(), saksmappeBuilder.build());
    assertNotNull(saksmappeResponse);
    assertNotNull(saksmappeResponse.getId());

    PaginatedList<Saksmappe> saksmappeResultList =
        client.arkivdel().listSaksmappe(arkivdel.getId());
    assertNotNull(saksmappeResultList);

    // Get saksmappe
    Saksmappe saksmappe = client.saksmappe().get(saksmappeResponse.getId());
    assertNotNull(saksmappe);

    // Delete saksmappe
    Saksmappe saksmappeDELETE = client.saksmappe().delete(saksmappe.getId());
    assertNotNull(saksmappeDELETE);
    assertEquals(Boolean.TRUE, saksmappeDELETE.getDeleted());

    // Get saksmappe
    assertThrows(
        NotFoundException.class,
        () -> {
          client.saksmappe().get(saksmappeResponse.getId());
        });
  }

  @Test
  void testExpandableField() throws Exception {
    SaksmappeRequest saksmappeRequest =
        new SaksmappeRequest.Builder()
            .offentligTittel("TEST")
            .saksaar(1999)
            .offentligTittelSensitiv("TEST2")
            .sakssekvensnummer(1)
            .addJournalpost(
                jpbuilder ->
                    jpbuilder
                        .offentligTittel("TEST3")
                        .offentligTittelSensitiv("TEST 5")
                        .journalaar(1999)
                        .journaldato("1999-01-01")
                        .journalpostnummer(1)
                        .journalsekvensnummer(1)
                        .journalposttype(JournalposttypeEnum.INNGAAENDE_DOKUMENT))
            .build();
    Saksmappe saksmappeResponse =
        client.arkivdel().addSaksmappe(arkivdel.getId(), saksmappeRequest);
    assertNotNull(saksmappeResponse);
    assertNotNull(saksmappeResponse.getId());

    Saksmappe saksmappeGET = client.saksmappe().get(saksmappeResponse.getId());
    assertNotNull(saksmappeGET);

    // Delete saksmappe
    Saksmappe saksmappeDELETE = client.saksmappe().delete(saksmappeResponse.getId());
    assertNotNull(saksmappeDELETE);
    assertEquals(Boolean.TRUE, saksmappeDELETE.getDeleted());
  }

  @Test
  void testExpandableFieldJournalpost() throws Exception {
    SaksmappeRequest saksmappeRequest =
        new SaksmappeRequest.Builder()
            .offentligTittel("TEST")
            .saksaar(1999)
            .offentligTittelSensitiv("TEST2")
            .sakssekvensnummer(1)
            .addJournalpost(
                jpbuilder ->
                    jpbuilder
                        .offentligTittel("TEST3")
                        .offentligTittelSensitiv("TEST 5")
                        .journalaar(1999)
                        .journaldato("1999-01-01")
                        .journalpostnummer(1)
                        .journalsekvensnummer(1)
                        .journalposttype(JournalposttypeEnum.INNGAAENDE_DOKUMENT))
            .build();
    Saksmappe saksmappeResponse =
        client.arkivdel().addSaksmappe(arkivdel.getId(), saksmappeRequest);
    assertNotNull(saksmappeResponse);
    assertNotNull(saksmappeResponse.getId());

    Saksmappe saksmappe = client.saksmappe().get(saksmappeResponse.getId());
    assertNotNull(saksmappe);

    PaginatedList<Journalpost> journalpostList =
        client.saksmappe().listJournalpost(saksmappe.getId());
    assertEquals(1, journalpostList.getItems().size());
    Journalpost journalpostField = journalpostList.getItems().get(0);
    assertNotNull(journalpostField.getId());

    // Expand arkiv
    ExpandableField<Enhet> journalenhet = saksmappe.getJournalenhet();
    assertNull(journalenhet.getExpanded());
    journalenhet.expand();
    assertNotNull(journalenhet.getExpanded());

    // Delete saksmappe
    Saksmappe saksmappeDELETE = client.saksmappe().delete(saksmappeResponse.getId());
    assertNotNull(saksmappeDELETE);
    assertEquals(Boolean.TRUE, saksmappeDELETE.getDeleted());
  }

  @Test
  void createAndGet() throws Exception {
    ArkivOperations arkivOperations = client.arkiv();
    Arkiv arkiv = arkivOperations.add(builder -> builder.tittel("TestArkiv"));
    assertNotNull(arkiv);
    assertNotNull(arkiv.getId());

    Arkivdel arkivdel =
        arkivOperations.addArkivdel(arkiv.getId(), builder -> builder.tittel("TestArkivdel"));
    assertNotNull(arkivdel);
    assertNotNull(arkivdel.getId());

    // Create Saksmappe
    ArkivdelOperations arkivdelOperations = client.arkivdel();
    arkivdelOperations.addSaksmappe(
        arkivdel.getId(),
        builder ->
            builder
                .offentligTittel("Testmappe")
                .offentligTittelSensitiv("Sensitiv saksmappe")
                .saksaar(1900)
                .sakssekvensnummer(1));

    // Get Saksmappe list
    PaginatedList<Saksmappe> saksmappeList = arkivdelOperations.listSaksmappe(arkivdel.getId());
    assertNotNull(saksmappeList);
    assertNotNull(saksmappeList.getItems());
    assertEquals(1, saksmappeList.getItems().size());

    // Delete arkiv
    arkiv = arkivOperations.delete(arkiv.getId());
  }

  @Test
  void testPaginatedList() throws Exception {
    ArkivOperations arkivOperations = client.arkiv();
    Arkiv arkiv = arkivOperations.add(builder -> builder.tittel("TestArkiv"));
    assertNotNull(arkiv);
    assertNotNull(arkiv.getId());

    Arkivdel arkivdel =
        arkivOperations.addArkivdel(arkiv.getId(), builder -> builder.tittel("TestArkivdel"));
    assertNotNull(arkivdel);
    assertNotNull(arkivdel.getId());

    // Create three Saksmappe
    ArkivdelOperations arkivdelOperations = client.arkivdel();
    Saksmappe sm1 =
        arkivdelOperations.addSaksmappe(
            arkivdel.getId(),
            builder ->
                builder
                    .offentligTittel("sm1")
                    .offentligTittelSensitiv("Sensitiv saksmappe")
                    .saksaar(1900)
                    .sakssekvensnummer(1));

    Saksmappe sm2 =
        arkivdelOperations.addSaksmappe(
            arkivdel.getId(),
            builder ->
                builder
                    .offentligTittel("sm2")
                    .offentligTittelSensitiv("Sensitiv saksmappe")
                    .saksaar(1900)
                    .sakssekvensnummer(2));

    Saksmappe sm3 =
        arkivdelOperations.addSaksmappe(
            arkivdel.getId(),
            builder ->
                builder
                    .offentligTittel("sm3")
                    .offentligTittelSensitiv("Sensitiv saksmappe")
                    .saksaar(1900)
                    .sakssekvensnummer(3));

    // Get Saksmappe list
    PaginatedList<Saksmappe> saksmappeList =
        arkivdelOperations.listSaksmappe(
            arkivdel.getId(), b -> b.limit(1).sortOrder(SortOrderEnum.ASC));
    assertNotNull(saksmappeList);
    assertNotNull(saksmappeList.getItems());
    assertEquals(1, saksmappeList.getItems().size());

    Iterator<Saksmappe> saksmappeIterator = saksmappeList.iterator();
    assertTrue(saksmappeIterator.hasNext());
    Saksmappe iteratedSm1 = saksmappeIterator.next();
    assertEquals(sm1.getId(), iteratedSm1.getId());
    assertEquals(sm1.getOffentligTittel(), iteratedSm1.getOffentligTittel());
    assertTrue(saksmappeIterator.hasNext());
    Saksmappe iteratedSm2 = saksmappeIterator.next();
    assertEquals(sm2.getId(), iteratedSm2.getId());
    assertEquals(sm2.getOffentligTittel(), iteratedSm2.getOffentligTittel());
    assertTrue(saksmappeIterator.hasNext());
    Saksmappe iteratedSm3 = saksmappeIterator.next();
    assertEquals(sm3.getId(), iteratedSm3.getId());
    assertEquals(sm3.getOffentligTittel(), iteratedSm3.getOffentligTittel());
    assertFalse(saksmappeIterator.hasNext());

    // Delete arkiv
    arkiv = arkivOperations.delete(arkiv.getId());
  }
}
