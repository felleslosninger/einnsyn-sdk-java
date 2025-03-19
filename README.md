# <img src="https://einnsyn.no/8ebf89f8e40d3eb75183.svg" width="180px" alt="eInnsyn"/>
Java SDK for the eInnsyn API

This repository contains the Java SDK for the eInnsyn API, which allows developers to interact with the eInnsyn service programmatically.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
  - [Initialize the Client](#initialize-the-client)
  - [Build and Save a Saksmappe](#build-and-save-a-saksmappe)
  - [Add a Journalpost to a Saksmappe](#add-a-journalpost-to-a-saksmappe)
  - [Delete a Saksmappe](#delete-a-saksmappe)
  - [Get a Saksmappe](#get-a-saksmappe)
  - [Get a Saksmappe with expanded Journalposts](#get-a-saksmappe-with-expanded-journalposts)
  - [Iterate over paginated lists](#iterate-over-paginated-lists)
  - [Search](#search)
- [License](#license)
- [References](#references)

## Installation

To use the SDK, add the following dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>no.einnsyn</groupId>
  <artifactId>sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Usage

### Initialize the Client

```java
import no.einnsyn.sdk.EInnsynClient;

// Initialize the client with an optional base URL and your API key
EInnsynClient client = new EInnsynClient("https://api.einnsyn.no", "secret...");

// Advanced initialization
EInnsynClient advancedClient = new EInnsynClient(b -> b
    .baseUrl("http://localhost:8080")
    .actingAs("enh_...")
    .appInfo("My eInnsyn App")
    .apiKey("https://api.test.einnsyn.no/api/v1")
    // .username("eInnsynUser@example.com")
    // .password(password)
    // .jwt(jwt)
);
```

### Build and Save a Saksmappe
Using pre-built objects:
```java
// Add Arkiv
ArkivRequest arkivRequest = ArkivRequest.builder().tittel("Arkiv title").build();
Arkiv arkiv = client.arkiv().add(arkivRequest);

// Add Arkivdel
ArkivdelRequest arkivdelRequest = ArkivdelRequest.builder().tittel("Arkivdel title").build();
Arkivdel arkivdel = client.arkiv().addArkivdel(arkiv.getId(), arkivdelRequest);

// Create JournalpostRequest
JournalpostRequest journalpostRequest =
    JournalpostRequest.builder()
        .offentligTittel("Journalpost title")
        .offentligTittelSensitiv("Journalpost title with sensitive info")
        .journalaar(2025)
        .journaldato("2025-01-01")
        .journalpostnummer(1)
        .journalsekvensnummer(1)
        .journalposttype(JournalposttypeEnum.INNGAAENDE_DOKUMENT)
        .build();

// Create SaksmappeReqeust
SaksmappeRequest saksmappeRequest =
    SaksmappeRequest.builder()
        .offentligTittel("Saksmappe title")
        .offentligTittelSensitiv("Saksmappe title with sensitive info")
        .sakssekvensnummer(1)
        .saksaar(2024)
        .addJournalpost(journalpostRequest)
        .build();
Saksmappe saksmappe = client.arkivdel().addSaksmappe(arkivdel.getId(), saksmappeRequest);
System.out.println(saksmappe);
// Example output:
// {
//   "entity": "Saksmappe",
//   "id": "sm_...",
//   "offentligTittel": "Saksmappe title",
//   "offentligTittelSensitiv": "Saksmappe title with sensitive info",
//   "sakssekvensnummer": 1,
//   "saksaar": 2025,
//   "journalpost": [{
//     "entity": "Journalpost",
//     "id": "jp_..",
//     "offentligTittel": "Journalpost title",
//     "offentligTittelSensitiv": "Journalpost title with sensitive info",
//     "journalaar": 2025,
//     "journaldato": "2025-01-01",
//     "journalpostnummer": 1,
//     "journalsekvensnummer": 1,
//     "journalposttype": "inngående",
//   }],
// }
```

Using lambda-functions:
```java
// Add Arkiv
Arkiv arkiv = client.arkiv().add(builder -> builder.tittel("Arkiv title"));

// Add Arkivdel
Arkivdel arkivdel = client.arkiv().addArkivdel(arkiv.getId(), builder -> builder.tittel("Arkivdel title"));

// Add Saksmappe with journalpost
Saksmappe saksmappe = client.arkivdel().addSaksmappe(arkivdel.getId(), builder -> builder
    .offentligTittel("Saksmappe title")
    .offentligTittelSensitiv("Saksmappe title with sensitive info")
    .sakssekvensnummer(1)
    .saksaar(2024)
    .addJournalpost(jpbuilder -> jpbuilder
        .offentligTittel("Journalpost title")
        .offentligTittelSensitiv("Journalpost title with sensitive info")
        .journalaar(2025)
        .journaldato("2025-01-01")
        .journalpostnummer(1)
        .journalsekvensnummer(1)
        .journalposttype(JournalposttypeEnum.INNGAAENDE_DOKUMENT)));
System.out.println(saksmappe);
// Example output:
// {
//   "entity": "Saksmappe",
//   "id": "sm_...",
//   "offentligTittel": "Saksmappe title",
//   "offentligTittelSensitiv": "Saksmappe title with sensitive info",
//   "sakssekvensnummer": 1,
//   "saksaar": 2025,
//   "journalpost": [{
//     "entity": "Journalpost",
//     "id": "jp_..",
//     "offentligTittel": "Journalpost title",
//     "offentligTittelSensitiv": "Journalpost title with sensitive info",
//     "journalaar": 2025,
//     "journaldato": "2025-01-01",
//     "journalpostnummer": 1,
//     "journalsekvensnummer": 1,
//     "journalposttype": "inngående",
//   }],
// }
```

### Add a Journalpost to the Saksmappe

```java
Journalpost journalpost = client.saksmappe().addJournalpost(
    saksmappe.getId(),
    jpBuilder -> jpBuilder
        .offentligTittel("Journalpost title")
        .offentligTittelSensitiv("Journalpost title with sensitive info")
        .journalpostnummer(1)
        .journaldato("2025-01-01")
        .journalaar(2025)
        .journalsekvensnummer(1)
        .journalposttype(JournalposttypeEnum.INNGAAENDE_DOKUMENT));
System.out.println(journalpost);
// Example output:
// {
//   "entity": "Journalpost",
//   "id": "jp_...",
//   "offentligTittel": "Journalpost title",
//   "offentligTittelSensitiv": "Journalpost title with sensitive info",
//   "journalpostnummer": 1,
//   "journaldato": "2025-01-01",
//   "journalaar": 2025,
//   "journalsekvensnummer: 1,
//   "journalposttype": "inngående"
// }
```

### Delete a Saksmappe

```java
Saksmappe deletedSaksmappe = client.saksmappe().delete(saksmappeResponse.getId());
```

### Get a Saksmappe

```java
Saksmappe saksmappe = client.saksmappe().get(saksmappeId);
System.out.println(saksmappe);
// Example output:
// {
//   "entity": "Saksmappe",
//   "id": "sm_...",
//   "offentligTittel": "Saksmappe title",
//   "offentligTittelSensitiv": "Saksmappe title with sensitive info",
//   "sakssekvensnummer": 1,
//   "saksaar": 2025,
//   "journalpost": ["jp_..."],
// }
```

### Get a Saksmappe with expanded Journalposts

```java
Saksmappe saksmappe = client.saksmappe().getWithExpandedJournalposts(saksmappeId);
System.out.println(saksmappe);
// Example output:
// {
//   "entity": "Saksmappe",
//   "id": "sm_...",
//   "offentligTittel": "Saksmappe title",
//   "offentligTittelSensitiv": "Saksmappe title with sensitive info",
//   "sakssekvensnummer": 1,
//   "saksaar": 2025,
//   "journalpost": [{
//     "entity": "Journalpost",
//     "id": "jp_...",
//     "offentligTittel": "Journalpost title",
//     "offentligTittelSensitiv": "Journalpost title with sensitive info",
//     "journalaar": 2025,
//     "journaldato": "2025-01-01",
//     "journalpostnummer": 1,
//     "journalsekvensnummer": 1,
//     "journalposttype": "inngående",
//   }],
// }
```

### Iterate over paginated lists

```java
PaginatedList<Saksmappe> saksmappeList= client.saksmappe().list();
Iterator<Saksmappe> saksmappeIterator = saksmappeList.iterator();
while (saksmappeIterator.hasNext()) {
  Saksmappe saksmappe = saksmappeIterator.next();
  System.out.println(saksmappe);
}
```

### Search

```java
PaginatedList<Base> searchResultList = client.search().search(b -> b
  .query("Search query")
  .publisertDatoAfter("2025-01-01")
);
Iterator<Base> searchIterator = searchResultList.iterator();
while (searchIterator.hasNext()) {
  // Search results can be one of Saksmappe, Journalpost, Moetemappe, Moetesak
  Base searchResult = searchIterator.next();
  if (searchResult instanceof Saksmappe saksmappe) {
    // Handle Saksmappe
  } else if (searchResult instanceof Journalpost journalpost) {
    // Handle Journalpost
  } else if (searchResult instanceof Moetemappe moetemappe) {
    // Handle Moetemappe
  } else if (searchResult instanceof Moetesak moetesak) {
    // Handle Moetesak
  }
}
```

## License

This project is licensed under the BSD 3-Clause License. See the [LICENSE](LICENSE) file for details.

## References

- [eInnsyn API Specification](https://github.com/felleslosninger/einnsyn-api-spec/)
- [eInnsyn Backend](https://github.com/felleslosninger/einnsyn-backend/)
