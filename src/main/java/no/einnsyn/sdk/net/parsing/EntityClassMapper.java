// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.net.parsing;

import no.einnsyn.sdk.entities.apikey.models.ApiKey;
import no.einnsyn.sdk.entities.arkiv.models.Arkiv;
import no.einnsyn.sdk.entities.arkivdel.models.Arkivdel;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.behandlingsprotokoll.models.Behandlingsprotokoll;
import no.einnsyn.sdk.entities.bruker.models.Bruker;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;
import no.einnsyn.sdk.entities.dokumentobjekt.models.Dokumentobjekt;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.identifikator.models.Identifikator;
import no.einnsyn.sdk.entities.innsynskrav.models.Innsynskrav;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestilling;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;
import no.einnsyn.sdk.entities.klasse.models.Klasse;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.Klassifikasjonssystem;
import no.einnsyn.sdk.entities.korrespondansepart.models.Korrespondansepart;
import no.einnsyn.sdk.entities.lagretsak.models.LagretSak;
import no.einnsyn.sdk.entities.lagretsoek.models.LagretSoek;
import no.einnsyn.sdk.entities.moetedeltaker.models.Moetedeltaker;
import no.einnsyn.sdk.entities.moetedokument.models.Moetedokument;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.moetesak.models.Moetesak;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.Moetesaksbeskrivelse;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;
import no.einnsyn.sdk.entities.skjerming.models.Skjerming;
import no.einnsyn.sdk.entities.tilbakemelding.models.Tilbakemelding;
import no.einnsyn.sdk.entities.utredning.models.Utredning;
import no.einnsyn.sdk.entities.vedtak.models.Vedtak;
import no.einnsyn.sdk.entities.votering.models.Votering;

public class EntityClassMapper {

  public static Class<? extends Base> getClassFromEntity(String entity) {
    switch (entity) {
      case "ApiKey":
        return ApiKey.class;
      case "Arkiv":
        return Arkiv.class;
      case "Arkivdel":
        return Arkivdel.class;
      case "Behandlingsprotokoll":
        return Behandlingsprotokoll.class;
      case "Bruker":
        return Bruker.class;
      case "Dokumentbeskrivelse":
        return Dokumentbeskrivelse.class;
      case "Dokumentobjekt":
        return Dokumentobjekt.class;
      case "Enhet":
        return Enhet.class;
      case "Identifikator":
        return Identifikator.class;
      case "Innsynskrav":
        return Innsynskrav.class;
      case "InnsynskravBestilling":
        return InnsynskravBestilling.class;
      case "Journalpost":
        return Journalpost.class;
      case "Klasse":
        return Klasse.class;
      case "Klassifikasjonssystem":
        return Klassifikasjonssystem.class;
      case "Korrespondansepart":
        return Korrespondansepart.class;
      case "LagretSak":
        return LagretSak.class;
      case "LagretSoek":
        return LagretSoek.class;
      case "Moetedeltaker":
        return Moetedeltaker.class;
      case "Moetedokument":
        return Moetedokument.class;
      case "Moetemappe":
        return Moetemappe.class;
      case "Moetesak":
        return Moetesak.class;
      case "Moetesaksbeskrivelse":
        return Moetesaksbeskrivelse.class;
      case "Saksmappe":
        return Saksmappe.class;
      case "Skjerming":
        return Skjerming.class;
      case "Tilbakemelding":
        return Tilbakemelding.class;
      case "Utredning":
        return Utredning.class;
      case "Vedtak":
        return Vedtak.class;
      case "Votering":
        return Votering.class;
      default:
        return null;
    }
  }
}
