// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk;

import no.einnsyn.sdk.common.authinfo.AuthInfoOperations;
import no.einnsyn.sdk.common.search.SearchOperations;
import no.einnsyn.sdk.common.statistics.StatisticsOperations;
import no.einnsyn.sdk.entities.apikey.ApiKeyOperations;
import no.einnsyn.sdk.entities.arkiv.ArkivOperations;
import no.einnsyn.sdk.entities.arkivdel.ArkivdelOperations;
import no.einnsyn.sdk.entities.behandlingsprotokoll.BehandlingsprotokollOperations;
import no.einnsyn.sdk.entities.bruker.BrukerOperations;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.DokumentbeskrivelseOperations;
import no.einnsyn.sdk.entities.dokumentobjekt.DokumentobjektOperations;
import no.einnsyn.sdk.entities.enhet.EnhetOperations;
import no.einnsyn.sdk.entities.identifikator.IdentifikatorOperations;
import no.einnsyn.sdk.entities.innsynskrav.InnsynskravOperations;
import no.einnsyn.sdk.entities.innsynskravbestilling.InnsynskravBestillingOperations;
import no.einnsyn.sdk.entities.journalpost.JournalpostOperations;
import no.einnsyn.sdk.entities.klasse.KlasseOperations;
import no.einnsyn.sdk.entities.klassifikasjonssystem.KlassifikasjonssystemOperations;
import no.einnsyn.sdk.entities.korrespondansepart.KorrespondansepartOperations;
import no.einnsyn.sdk.entities.lagretsak.LagretSakOperations;
import no.einnsyn.sdk.entities.lagretsoek.LagretSoekOperations;
import no.einnsyn.sdk.entities.moetedeltaker.MoetedeltakerOperations;
import no.einnsyn.sdk.entities.moetedokument.MoetedokumentOperations;
import no.einnsyn.sdk.entities.moetemappe.MoetemappeOperations;
import no.einnsyn.sdk.entities.moetesak.MoetesakOperations;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.MoetesaksbeskrivelseOperations;
import no.einnsyn.sdk.entities.saksmappe.SaksmappeOperations;
import no.einnsyn.sdk.entities.skjerming.SkjermingOperations;
import no.einnsyn.sdk.entities.tilbakemelding.TilbakemeldingOperations;
import no.einnsyn.sdk.entities.utredning.UtredningOperations;
import no.einnsyn.sdk.entities.vedtak.VedtakOperations;
import no.einnsyn.sdk.entities.votering.VoteringOperations;
import no.einnsyn.sdk.net.ApiRequester;

public class EInnsynClientBase {
  private final ApiRequester requester;

  public EInnsynClientBase(ApiRequester requester) {
    this.requester = requester;
  }

  public ApiKeyOperations apikey() {
    return new ApiKeyOperations(this.requester);
  }

  public ArkivOperations arkiv() {
    return new ArkivOperations(this.requester);
  }

  public ArkivdelOperations arkivdel() {
    return new ArkivdelOperations(this.requester);
  }

  public BehandlingsprotokollOperations behandlingsprotokoll() {
    return new BehandlingsprotokollOperations(this.requester);
  }

  public DokumentbeskrivelseOperations dokumentbeskrivelse() {
    return new DokumentbeskrivelseOperations(this.requester);
  }

  public DokumentobjektOperations dokumentobjekt() {
    return new DokumentobjektOperations(this.requester);
  }

  public EnhetOperations enhet() {
    return new EnhetOperations(this.requester);
  }

  public IdentifikatorOperations identifikator() {
    return new IdentifikatorOperations(this.requester);
  }

  public JournalpostOperations journalpost() {
    return new JournalpostOperations(this.requester);
  }

  public KlasseOperations klasse() {
    return new KlasseOperations(this.requester);
  }

  public KlassifikasjonssystemOperations klassifikasjonssystem() {
    return new KlassifikasjonssystemOperations(this.requester);
  }

  public KorrespondansepartOperations korrespondansepart() {
    return new KorrespondansepartOperations(this.requester);
  }

  public MoetedeltakerOperations moetedeltaker() {
    return new MoetedeltakerOperations(this.requester);
  }

  public MoetedokumentOperations moetedokument() {
    return new MoetedokumentOperations(this.requester);
  }

  public MoetemappeOperations moetemappe() {
    return new MoetemappeOperations(this.requester);
  }

  public MoetesakOperations moetesak() {
    return new MoetesakOperations(this.requester);
  }

  public MoetesaksbeskrivelseOperations moetesaksbeskrivelse() {
    return new MoetesaksbeskrivelseOperations(this.requester);
  }

  public SaksmappeOperations saksmappe() {
    return new SaksmappeOperations(this.requester);
  }

  public SkjermingOperations skjerming() {
    return new SkjermingOperations(this.requester);
  }

  public UtredningOperations utredning() {
    return new UtredningOperations(this.requester);
  }

  public VedtakOperations vedtak() {
    return new VedtakOperations(this.requester);
  }

  public VoteringOperations votering() {
    return new VoteringOperations(this.requester);
  }

  public BrukerOperations bruker() {
    return new BrukerOperations(this.requester);
  }

  public InnsynskravOperations innsynskrav() {
    return new InnsynskravOperations(this.requester);
  }

  public InnsynskravBestillingOperations innsynskravbestilling() {
    return new InnsynskravBestillingOperations(this.requester);
  }

  public LagretSakOperations lagretsak() {
    return new LagretSakOperations(this.requester);
  }

  public LagretSoekOperations lagretsoek() {
    return new LagretSoekOperations(this.requester);
  }

  public TilbakemeldingOperations tilbakemelding() {
    return new TilbakemeldingOperations(this.requester);
  }

  public SearchOperations search() {
    return new SearchOperations(this.requester);
  }

  public StatisticsOperations statistics() {
    return new StatisticsOperations(this.requester);
  }

  public AuthInfoOperations authinfo() {
    return new AuthInfoOperations(this.requester);
  }
}
