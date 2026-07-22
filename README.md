# cloud-itonami-iso3166-lao

Open ISO 3166 Blueprint for **LAO**: Lao People's Democratic Republic.

- Ministry of Planning and Investment (MPI) / Investment Promotion
  Department (IPD) -- administers the Law on Investment Promotion
  (Amended, National Assembly Resolution No.130/NA, 28 June 2024) via
  the One-stop Investment Service Office (OISO): a statutorily-timed
  administrative track (25 working days for a Controlled Business List
  investment license), NOT a case-by-case executive-authorization
  pipeline
- Department of Enterprise Management (Ministry of Industry and
  Commerce) business/enterprise registration -- also bundles Tax
  Identification Number issuance into the same certificate

AGPL-3.0-or-later.

## Market-entry / statute catalogs

Governed public-sector market-entry compliance actor, same architecture
as `cloud-itonami-iso3166-btn`/`-caf`/`-cub`, investigated for Laos'
genuinely different market-entry surface (verified 2026-07-23, see the
namespace docstrings for the full research trail, including facts this
iteration could NOT verify -- the Law on Enterprise's own primary
citation, Laos' Labour Law citation, and the Law on Income Tax
(Amended)'s substantive text):

- `src/marketentry/{facts,governor,phase,sim,operation,registry,store,
  marketentryllm}.cljc` -- the actor. `facts.cljc` cites the Law on
  Investment Promotion (Amended) (National Assembly Resolution
  No.130/NA, 28 June 2024; Presidential Decree No.124/P, 12 Aug 2024;
  in force 1 October 2024, replacing Law No.14/NA of 2016), fetched and
  read as a real 61-page machine-readable PDF from
  `investlaos.gov.la`. This iteration specifically investigated whether
  Laos' regime resembles `cloud-itonami-iso3166-cub`'s centrally-planned,
  case-by-case executive-authorization pipeline and found it does NOT --
  Laos runs a statutorily-timed One-stop Investment Service (OISO)
  administrative track much closer to the shape most other iso3166
  siblings model. What IS genuinely Cuba-like -- a narrow, textual
  AUTHORITY-JURISDICTION-ROUTING carve-out between two DIFFERENT
  legislative bodies -- exists only for a small set of high-impact
  concession-business criteria (Arts.49-50: land concessions of 10,000
  hectares or more, or relocations of more than 500 households, route to
  the National Assembly; relocations of fewer than 100 households route
  to the Provincial People's Assembly). `governor.cljc`'s flagship check
  independently recomputes which of these two legislative bodies has
  jurisdiction over a filing's own declared land-area/relocated-household
  figures -- an AUTHORITY-JURISDICTION ROUTING check between two
  LEGISLATIVE bodies, grep-verified absent fleet-wide, a genuinely
  different shape from every other iso3166 sibling.
- `src/statute/facts.cljc` -- general-law catalog: the Law on Investment
  Promotion (Amended) itself (also catalogued here as an ongoing
  compliance statute), the Decision on Enterprise Registration
  No..0023/MOIC.DERM (9 January 2019), the Controlled Business List
  Decree No.03/PM (10 January 2019), and the Ministry of Finance's own
  listing (title/date only) of a Presidential Decree on the Promulgation
  of the Law on Income Tax (Amended). This catalog deliberately carries
  NO Labour Law entry and NO Law on Enterprise entry -- honestly-reported
  gaps this iteration could not independently confirm this session (see
  namespace docstring), not fabricated citations.

Every citation is curl/pdftotext-verified against an official source
(`investlaos.gov.la`, `moic.gov.la`, `mof.gov.la`); one internal
inconsistency found in the source material itself (`investlaos.gov.la`'s
own static FAQ/about-us/one-stop-service pages still describe the
pre-2024-amendment 'OSSO'/'COSSO'/'POSSO' naming and cite the superseded
2016 law, while the current law's own text (Arts.76-79, in force since
1 October 2024) uses 'OISO'/'C.OISO'/'P.OISO') is flagged explicitly in
the namespace docstrings rather than silently resolved.

## Culture catalog

Alongside the market-entry / statute catalogs, this repo carries a
**country-level regional-culture catalog** (ADR-2607171400 addendum 2,
`cloud-itonami-municipality-culture-catalog` Wave 1, in
`com-junkawasaki/root`) — national dishes, protected products, beverages,
crafts, festivals and heritage sites for Laos:

- `src/culture/facts.cljc` — the catalog, source of truth (keyed by
  uppercase ISO3, mirroring `statute.facts`).
- `schema/culture.edn` — DataScript schema.
- `data/culture-tx.edn` — derived DataScript tx-data (regenerated from
  the catalog, never hand-edited).

City-level counterparts live in the `cloud-itonami-municipality-*` repos.
Same provenance discipline as the compliance catalogs: every entry cites a
source URL that was actually fetched and read on `:culture/retrieved-at`;
summaries state only what the cited source confirms. An item not in
`culture.facts/catalog` has no spec-basis — never fabricate one.
