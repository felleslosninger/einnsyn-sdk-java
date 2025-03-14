# einnsyn-sdk-java
Java client library for the eInnsyn API

## Usage
Initialize the client:
```
import no.einnsyn.sdk.EInnsynClient;
import no.einnsyn.sdk.entities.journalpost.Journalpost;
import no.einnsyn.sdk.entities.saksmappe.Saksmappe;

// Initialize the client with an optional base URL and your API key
EInnsynClient client = new EInnsynClient("https://api.einnsyn.no", "secret...");
```

Build a Saksmappe object, and save it:
```
Saksmappe saksmappeRequestBody =
  Saksmappe.builder()
    .setOffentligTittel("Saksmappetittel")
    .setOffentligTittelSensitiv("SaksmappetittelSensitiv")
    .setSakssekvensnummer(1)
    .setSaksaar(2024)
    .build();
Saksmappe saksmappeResponse =
  client
    .saksmappe()
    .add(saksmappeRequestBody);
```

Add a journalpost to the Saksmappe, using a builder function:
```
Journalpost journalpostResponse =
  client
    .saksmappe()
    .addJournalpost(
      saksmappeResponse.getId(),
      jpBuilder ->
        jpBuilder
          .setOffentligTittel("Journalposttittel 1")
          .setOffentligTittelSensitiv("JournalposttittelSensitiv 1")
          .setJournalpostnummer(1)
          .setJournaldato("2024-01-01")
          .setJournalaar(2024)
          .setJournalsekvensnummer(1)
          .setJournalposttype("testtype"));
```

Delete the saksmappe (and the journalpost):
```
Saksmappe deletedSaksmappe =
  client
    .saksmappe()
    .delete(saksmappeResponse.getId());
```

Insert a Saksmappe with Journalposts using inline builder functions:
```
Saksmappe secondSaksmappe =
  client
    .saksmappe()
    .add(
      smBuilder ->
        smBuilder
          .setOffentligTittel("Saksmappetittel")
          .setOffentligTittelSensitiv("SaksmappetittelSensitiv")
          .setSakssekvensnummer(1)
          .setSaksaar(1999)
          .addJournalpost(
            jpBuilder ->
              jpBuilder
                .setOffentligTittel("Journalposttittel 1")
                .setOffentligTittelSensitiv("JournalposttittelSensitiv 1")
                .setJournalpostnummer(1)
                .setJournaldato("1999-01-01")
                .setJournalaar(1999)
                .setJournalsekvensnummer(1)
                .setJournalposttype("testtype"))
          .addJournalpost(
            jpBuilder ->
              jpBuilder
                .setOffentligTittel("Journalposttittel 2")
                .setOffentligTittelSensitiv("JournalposttittelSensitiv 2")
                .setJournalpostnummer(1)
                .setJournaldato("1999-01-01")
                .setJournalaar(1999)
                .setJournalsekvensnummer(1)
                .setJournalposttype("testtype")));
```
