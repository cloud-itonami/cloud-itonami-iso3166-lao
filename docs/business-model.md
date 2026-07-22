# Business Model — Lao People's Democratic Republic

## Offer

- Ministry of Planning and Investment (MPI) / Investment Promotion
  Department (IPD) -- administers the Law on Investment Promotion
  (Amended, National Assembly Resolution No.130/NA, 28 June 2024;
  Presidential Decree No.124/P, 12 Aug 2024; in force 1 October 2024)
  via the One-stop Investment Service Office (OISO). Statutorily-timed
  administrative track, NOT a case-by-case executive-authorization
  pipeline (unlike `cloud-itonami-iso3166-cub`): a Controlled Business
  List investment application gets a 25-working-day decision (Art.36);
  a concession-business MOU/feasibility-study application gets a
  65-working-day decision (Art.46) (see `src/marketentry/facts.cljc`)
- Department of Enterprise Management (Ministry of Industry and
  Commerce) enterprise registration -- required for both Controlled-List
  and not-listed general businesses (Law on Enterprise, cross-referenced
  in Arts.34/35/38/39); bundles Tax Identification Number issuance into
  the same certificate (investlaos.gov.la's own FAQ)
- Legislative-approval-authority gate (flagship check) -- bars a
  concession-business filing that claims the wrong legislative body
  (National Assembly vs. Provincial People's Assembly) for its own
  declared land-concession-hectares/relocated-households figures under
  Arts.49-50 of the Law on Investment Promotion (Amended). A narrow
  special case: most concessions and general investments never reach a
  legislative body at all
- market entry via enterprise registration + investment license (general
  business) or MOU/feasibility-study/concession-agreement (concession
  business), not direct competitive bidding for most sectors

## Trust Controls

- Any actual investment-license filing or enterprise-registration
  submission requires Market-Entry Compliance Governor clearance and
  always escalates to human sign-off.
- A false or fabricated regulatory-requirement claim is a HARD hold.
- `:filing/submit` never automated
