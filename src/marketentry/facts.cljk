(ns marketentry.facts
  "Per-jurisdiction public-sector market-entry regulatory catalog -- the
  G2-style spec-basis table the Market-Entry Compliance Governor checks
  every `:jurisdiction/assess` proposal against ('did the advisor cite an
  OFFICIAL public source for this jurisdiction's requirements, or did it
  invent one?').

  This iteration investigated whether the Lao People's Democratic
  Republic's (LAO) real FDI/market-entry regime resembles
  cloud-itonami-iso3166-cub's centrally-planned, case-by-case
  EXECUTIVE-AUTHORIZATION-only pipeline (no self-service portal at all),
  rather than assuming it by analogy. It does NOT: Laos runs a
  statutorily-timed One-stop Investment Service (OISO) administrative
  track with defined working-day counts for most investments -- much
  closer in SHAPE to the 'normal market economy' portal-plus-registry
  pattern most other iso3166 siblings model. What IS genuinely
  Cuba-like -- a narrow, textual AUTHORITY-JURISDICTION-ROUTING carve-out
  between two DIFFERENT government bodies -- exists only for a small set
  of high-impact concession-business criteria (Arts.49-50), and grounds
  this vertical's flagship check. Every claim below cites a source this
  iteration actually fetched (curl) and read (pdftotext / raw HTML) on
  2026-07-23:

  - **The primary source is the Law on Investment Promotion (Amended)**,
    fetched as a real, machine-readable 61-page PDF directly from
    `investlaos.gov.la` (the Investment Promotion Department's own
    site, 'Laws & Regulations' listing shows exactly one entry,
    'Investment Promotion Law (2024)') and read in full via
    `pdftotext -layout`. Its own text: National Assembly's own
    Resolution ('National Assembly No.130/NA, Vientiane Capital, date:
    28 June 2024 ... Article 1 To adopt the Law on Investment Promotion
    (Amended)'), Presidential Decree on promulgation ('President
    No.124/P, Vientiane Capital, date: 12 Aug 2024 ... Article 1 To
    promulgate the Law on Investment Promotion (Amended)'), and its own
    Final Provisions: 'Article 101 (Amended) Entry into Force. This Law
    shall enter into force on 1 October 2024 ... This Law shall replace
    the Law on Investment Promotion No.14/NA, dated 17 November 2016,
    and the Law on Amending Article 12 of the Law on Investment
    Promotion (Amended 2016) No.80/NA, dated 4 December 2019.' NOTE: the
    PDF's own cover page states verbatim 'Unofficial translation / Law /
    On Investment Promotion (Amended) / 2025' -- this catalog cites the
    English translation's own article numbers/text as published on the
    Investment Promotion Department's official site, but the
    authoritative legal text is the Lao-language original, which this
    iteration did not separately fetch. The PDF's own filename
    ('New_IP_Law_Amended_2024_for_Web_No62-April-2024EN-1.pdf') contains
    an unexplained 'No62-April-2024' fragment that does not match either
    the Resolution number (No.130/NA) or the Decree number (No.124/P)
    read from the document's own body text -- flagged here rather than
    silently resolved, likely an internal MPI document/upload reference
    rather than a third citation.
  - **There IS a One-stop Investment Service, and it IS a genuine
    administrative (not case-by-case-authorization) track**, confirmed
    directly from the Law's own Part VII: 'Article 76 (Amended) One-stop
    Investment Service Office. The One-stop Investment Service Office is
    a State agency established for the purpose of investment facilitation
    and service in Lao PDR. The One-stop Investment Service Office is
    abbreviated as \"OISO\". There are two levels of OISO namely: 1. The
    Central One-stop Investment Service Office, abbreviated as C.OISO;
    and 2. The Provincial One-stop Investment Service Office,
    abbreviated as P.OISO.' 'Article 77 (Amended) ... The Central OISO
    is the Investment Promotion Department that acts as the central
    coordinating body in collaborating with the one-stop investment
    service coordinating committees of relevant ministries and State
    agencies, such as the Ministry of Industry and Commerce, the Ministry
    of Finance, ... the Ministry of Labor and Social Welfare, ...'
    'Article 78 ... The Provincial OISO is the Provincial Planning and
    Investment Department ...'. NOTE: `investlaos.gov.la`'s OWN static
    pages ('starting-a-business/one-stop-service/', 'about-us/
    investment-promotion-department/', 'starting-a-business/faqs/', all
    fetched directly) still describe the OLDER 'OSSO'/'COSSO'/'POSSO'
    naming ('on 25 April 2018, Ministry of Planning and Investment has
    established an One-Stop Service in line with the Investment
    Promotion Law (Amended 2016)') and cite 'the Law on Investment
    Promotion Revised 2016' and 'Decree ... No.05/PM dated 05/01/2018' --
    this catalog trusts the CURRENT primary law text's own Art.76-79
    OISO/C.OISO/P.OISO naming (in force since 1 October 2024, per
    Art.101) over the site's own stale FAQ/about-us pages, and flags the
    inconsistency rather than silently picking one.
  - **General-business investment procedure and the Controlled Business
    List** -- own text, read directly: 'Article 32 Types of General
    Businesses. Types of general businesses are as follows: 1. Business
    listed in the controlled list; 2. Business not listed in the
    controlled list.' 'Article 33 (Amended) ... A business listed in the
    controlled list is a type of business activity that has impacts on
    the national security, public order, and the natural and social
    environments. ... such a business shall undergo a review and
    consideration by relevant sectors before being granted an investment
    license by the Ministry of Planning and Investment or a Provincial
    Administration Committee in accordance with the delegated management
    authority.' 'Article 34 (Amended) ... A business not listed in the
    controlled list is a business activity that is open for an
    investment, in which a business registration and business operating
    license can be pursued in accordance with the Law on Enterprise and
    other relevant laws.' The implementing decree for this list was
    independently confirmed by name/number/date on the SAME official
    site's own 'how-to-do-business-in-laos' page (own text, read
    directly): 'Decree on The Endorsement of the [Business Activities
    under] the Controlled Business List and the Concession List of Lao
    PDR No.03/PM, Dated 10.01.2019'. Article 36 gives a concrete,
    directly-verified statutory timeframe: 'An investor applicant is to
    receive an investment license within twenty-five (25) working days
    from the date the concerned One-stop Investment Service Office
    receives a complete investment application.'
  - **Business/company registration runs through 'the Law on Enterprise'**
    -- cross-referenced repeatedly in the primary law's own text
    (Art.34: 'in accordance with the Law on Enterprise'; Art.35, Art.38,
    Art.39 likewise) and administered by the Department of Enterprise
    Management, Ministry of Industry and Commerce (MOIC) -- confirmed
    directly from `moic.gov.la`'s own 'Business Registration' service
    page (own text, read directly): 'Register and incorporate
    enterprises. Department of Enterprise Management ... dem@moic.gov.la
    ... 5th Floor, Industry Building.' The implementing enterprise-
    registration procedure instrument was independently confirmed by
    name/number/date from `investlaos.gov.la`'s own how-to-do-business
    page (own text, read directly): 'Decision on Enterprise Registration
    No..0023/MOIC.DERM, Dated 9.01.2019' ('DERM' = Department of
    Enterprise Registration and Management -- an older name for the same
    office `moic.gov.la`'s current site calls 'Department of Enterprise
    Management'; this iteration notes the naming drift rather than
    silently picking one). HONEST GAP: this iteration could NOT
    independently fetch the Law on Enterprise's OWN primary text or even
    its own law-number/date this session -- `moic.gov.la`'s own 'Laws &
    Legal Documents Repository' page returned '0 results found' (a
    client-side-rendered Next.js page with no backing documents indexed
    as of this session), and `laotradeportal.gov.la`'s legal-document
    search form (`DocumentSearch[title]=Enterprise`, tried both with and
    without an `X-Requested-With: XMLHttpRequest` header) returned no
    document rows to this session's curl-based fetch (its results grid
    appears to require client-side JavaScript this session's tooling did
    not execute). This catalog names the Law on Enterprise's EXISTENCE
    and its administering department (HIGH confidence, read directly)
    without asserting its own law-number, date, or substantive content
    (NOT read) -- the same honest-gap discipline
    cloud-itonami-iso3166-cub used for Decreto-Ley No.304/2012.
  - **Tax Identification Number (TIN) issuance is BUNDLED into the
    enterprise registration certificate itself, NOT a separate
    Ministry-of-Finance registration step** (a genuinely different
    mechanism from Cuba's separate ONAT NIT registry) -- confirmed
    directly from `investlaos.gov.la`'s own FAQ page (own text, read
    directly): 'Enterprise registration certificate includes the
    investment approval, promotion policy and tax identity number.' The
    Ministry of Finance's own document repository (`mof.gov.la`,
    218 documents total as of this session, fetched directly) lists a
    separate, broader general tax-compliance instrument by title and
    date only (own text, read directly, Lao-language title): a
    Presidential Decree 'ລັດຖະດໍາລັດ ກ່ຽວກັບການປະກາດໃຊ້ກົດໝາຍວ່າດ້ວຍ
    ອາກອນລາຍໄດ້ (ສະບັບປັບປຸງ)' ('Presidential Decree on the Promulgation
    of the Law on Income Tax (Amended)'), dated 26/06/2026 in the
    repository's own listing -- this iteration could NOT download or
    read this document's own substantive PDF text this session (the
    site's download links require client-side JavaScript this session's
    curl-based fetch did not execute); its existence, title and listed
    date are HIGH confidence (read directly from the ministry's own
    document list), its substantive content is NOT read (honest gap).
  - **This iteration specifically searched for Laos' Labour Law
    (Ministry of Labour and Social Welfare) and could NOT independently
    locate or confirm its own law-number/date/text this session** --
    the Ministry of Labour and Social Welfare's own website could not be
    resolved at any DNS name this iteration tried; `na.gov.la` (the
    National Assembly's own site) has a Lao-only navigation structure
    this iteration could not resolve to a specific law-repository
    listing within this session's fetch budget; `mof.gov.la` and
    `moic.gov.la` do not administer labour law. The ONE thing this
    iteration DID confirm directly is a bare cross-reference in the
    Investment Promotion Law's own text (Art.70, Rights of Investors to
    Employment, item 2, read directly): 'To import workers in accordance
    with the Law on Labor.' -- confirming the law's EXISTENCE and
    relevance, but giving no law-number or date. `statute.facts`
    (this repo) does NOT carry a Labour Law entry as a result -- an
    honestly-reported gap, not a fabricated citation, the same
    discipline cloud-itonami-iso3166-caf and others used when they could
    not verify their own jurisdiction's labour statute.
  - **`:approval-authority`-equivalent fields ground this vertical's
    FLAGSHIP check** (see `marketentry.governor` / `marketentry.registry`)
    -- own text, read directly, Art.49 (Amended) 'Approval Right of the
    National Assembly': 'The National Assembly has the approval right in
    relation to a concession business as follows: ... 7. Activities
    involving a natural waterway diversion in a large watershed, a
    relocation of more than five hundred households, or a land
    concession with an area of ten thousand hectares or more, and other
    activities that may cause severe environmental, natural, and social
    impacts as defined by the relevant laws; ...'. Art.50 (Amended)
    'Approval Right of the Provincial People's Assembly': 'The
    Provincial People's Assembly has the approval right in relation to a
    concession business as follows: ... 2. Activities involving a
    natural waterway diversion in a small watershed and a relocation of
    fewer than one hundred households, as well as other activities that
    may cause severe environmental, natural, and social impacts as
    defined by relevant laws; ...'. This is a GENUINELY different check
    SHAPE from every check this repo's docstring-writer has read about
    in cloud-itonami-iso3166-cub/-caf/-btn/-est: it is an
    AUTHORITY-JURISDICTION ROUTING classification between TWO DIFFERENT
    LEGISLATIVE BODIES (National Assembly vs. Provincial People's
    Assembly), grep-verified absent (as any function name resembling
    'legislative-approval'/'national-assembly'/'relocated-households'/
    'land-concession-hectares'/'watershed') across all 87 iso3166-sibling
    `governor.cljc`/`registry.cljc` files present in this workspace's
    shared `orgs/cloud-itonami/` checkout as of this session (that
    checkout is itself known to lag `origin/main` for at least one
    sibling -- this session's own fresh clone of cloud-itonami-iso3166-cub
    has a `src/marketentry/` tree the shared checkout's copy of the same
    repo entirely lacks -- so this is a good-faith, not exhaustive,
    fleet-wide check). It is narrower in scope than Cuba's mechanism in
    an important way this catalog states plainly: MOST Lao concession
    and general-business investments NEVER reach a legislative body at
    all -- they clear entirely through the OISO->MPI/Provincial
    Administration Committee administrative track (Arts.35-36, 45-46).
    Arts.49-50 are a NARROW special-case gate limited to specific
    high-impact criteria. This iteration models ONLY the clean,
    unconditional NUMERIC criteria stated in Art.49 item 7 (land
    concession area >= 10,000 hectares; relocation of more than 500
    households -- each independently sufficient, per the article's own
    'or') and the household-count component of Art.50 item 2 (relocation
    of fewer than 100 households). It deliberately does NOT model: (a)
    the 'large watershed' / 'small watershed' distinction (no numeric or
    textual boundary is given anywhere in the fetched text for what
    counts as 'large' vs 'small'), noting that Art.50 item 2's own
    household-count criterion is textually CONJUNCTIVE with the
    watershed-diversion criterion ('and'), so this catalog's household-
    count-only recompute UNDER-approximates Art.50's true scope --
    it flags FEWER cases as Provincial-tier than the full statutory text
    would, never more; and (b) the 'other activities that may cause
    severe environmental, natural, and social impacts as defined by the
    relevant laws' catch-all in both articles (deferred to un-fetched
    implementing regulations). This is the same honest scope-narrowing
    discipline cloud-itonami-iso3166-cub's Art.21.4 delegation gap and
    cloud-itonami-iso3166-caf's Marche reserve value-threshold delegation
    already established for this family: only the ELIGIBILITY-FREE,
    textually unconditional numeric criteria are independently
    recomputed here.
  - **A second real, verified, genuinely-different mechanism this
    iteration deliberately did NOT build the flagship on**: Art.52
    (Amended) 'Registered Capital required for Concession Business' sets
    a FOUR-TIER value-threshold-with-floor formula (own text, read
    directly): '1. An investment project with value less than USD
    50,000,000 (fifty million), the registered capital shall be at least
    30% of the total investment; 2. ... from USD 50,000,000 ... to USD
    100,000,000 ..., the registered capital shall be at least 20% ...,
    but no less than USD 15,000,000 (fifteen million); 3. ... from USD
    100,000,000 ... to USD 500,000,000 ..., at least 5% ..., but no less
    than USD 20,000,000 (twenty million); 4. ... over USD 500,000,000
    ..., at least 2% ..., but no less than USD 25,000,000 (twenty-five
    million).' A real, independently-recomputable percentage-of-value-OR-
    floor-amount formula -- documented here as a verified fact this
    catalog does not fabricate a check around, set aside in favor of the
    genuinely more novel authority-jurisdiction-routing shape above
    (a plain tiered-value-threshold shape already has fleet precedent,
    per cloud-itonami-iso3166-cub's own docstring enumeration of prior
    siblings' check shapes).
  - Coverage is reported HONESTLY (see `coverage`): a jurisdiction not
    in this table has NO spec-basis, full stop -- the advisor must not
    fabricate one, and the governor holds if it tries.")

(def catalog
  "iso3 -> requirement map. `:required-evidence` mirrors the generic
  intake/portal-registration/filing evidence set; `:legal-basis` /
  `:owner-authority` / `:provenance` are the G2 citation the governor
  requires before any `:jurisdiction/assess` proposal can commit. LAO
  deliberately carries NO `:rep-owner-authority` -- this iteration did
  not locate a verifiable Lao analogue to CAF's/Benin's representative-
  exclusion-extension provision (a real mechanism may exist; this
  iteration simply did not locate and confirm one at a specific
  article number). `:approval-authority-owner-authority` /
  `:approval-authority-legal-basis` / `:approval-authority-criteria` /
  `:approval-authority-provenance` ground this vertical's flagship
  governor check (`legislative-approval-authority`/
  `legislative-approval-mismatch?` in `marketentry.registry`)."
  {"LAO" {:name "Lao People's Democratic Republic"
          :owner-authority "Ministry of Planning and Investment (MPI) -- Investment Promotion Department (IPD), which Art.77 of the Law on Investment Promotion (Amended) designates the Central One-stop Investment Service Office (C.OISO); the Provincial Planning and Investment Department is the Provincial OISO (Art.78) for provincial-level filings; overall policy oversight sits with the Committee for Investment Promotion and Management (independently cross-confirmed by name on both investlaos.gov.la's own site identity and laotradeportal.gov.la's own Issuing-Agency taxonomy, which separately lists 'Committee For Investment Promotion And Management (CIPM)')"
          :legal-basis "Law on Investment Promotion (Amended), adopted by National Assembly Resolution No.130/NA (Vientiane Capital, 28 June 2024), promulgated by Presidential Decree No.124/P (Vientiane Capital, 12 Aug 2024), in force from 1 October 2024 (Art.101) -- replacing the Law on Investment Promotion No.14/NA (dated 17 November 2016) and the Law Amending Article 12 of the Law on Investment Promotion (Amended 2016) No.80/NA (dated 4 December 2019). Investment procedure runs via Arts.32-39 (general business: Controlled Business List vs. not-listed) and Arts.41-50 (concession business), through the One-stop Investment Service Office (Arts.76-79)."
          :national-spec "A statutorily-timed One-stop Investment Service (OISO) administrative track, NOT a case-by-case executive-authorization pipeline (unlike cloud-itonami-iso3166-cub's Ley 118 shape) and NOT a self-service e-procurement portal either: for business listed in the Controlled Business List (Decree No.03/PM, 10 Jan 2019), an investor first registers an enterprise (Law on Enterprise), then applies for an investment license via the Central or Provincial OISO, reviewed and proposed to MPI or the Provincial Administration Committee, with a statutory 25-working-day decision timeframe (Art.36). For business NOT on the Controlled List, enterprise registration under the Law on Enterprise suffices (Art.34/38), with an optional investment-promotion certificate for promoted sectors. Concession businesses (land concession, SEZ development, mining, energy, aviation/telecom, PPP) follow a separate MOU/feasibility-study/concession-agreement track (Arts.41-48) with its own 65-working-day MOU-approval timeframe, ultimately signed by the Government or Provincial Administration Committee -- EXCEPT for the narrow set of high-impact criteria Arts.49-50 route to the National Assembly or Provincial People's Assembly instead (this vertical's flagship check)."
          :provenance "https://investlaos.gov.la/wp-content/uploads/formidable/22/New_IP_Law_Amended_2024_for_Web_No62-April-2024EN-1.pdf ; https://investlaos.gov.la/resources/laws-regulations/ ; https://investlaos.gov.la/starting-a-business/investment-types/general-investments/ ; https://investlaos.gov.la/starting-a-business/how-to-do-business-in-laos/"
          :required-evidence ["Investment License or Investment Promotion Certificate record (Ministry of Planning and Investment / Provincial Administration Committee, via the Central or Provincial One-stop Investment Service Office, per Arts.35/38/76-79)"
                              "Enterprise Registration Certificate record (Department of Enterprise Management, Ministry of Industry and Commerce, per the Law on Enterprise and Decision on Enterprise Registration No..0023/MOIC.DERM dated 9 January 2019) -- this same certificate bundles the Tax Identification Number"
                              "For a Controlled Business List activity: sector-authority review clearance (Decree No.03/PM dated 10 January 2019, Art.33)"
                              "For a concession business: feasibility-study approval certificate, environmental and social impact assessment approval certificate, environment and social management plan approval certificate, and concession land area certificate (Art.46 item 2)"
                              "Authorized-representative confirmation record"]
          :corporate-number-owner-authority "Department of Enterprise Management, Ministry of Industry and Commerce (MOIC) -- issues the Enterprise Registration Certificate, which itself 'includes the investment approval, promotion policy and tax identity number' per investlaos.gov.la's own FAQ page (own text, read directly); there is no separate Ministry-of-Finance TIN registry step analogous to cloud-itonami-iso3166-cub's ONAT"
          :corporate-number-legal-basis "investlaos.gov.la's own FAQ (own text, read directly): 'Enterprise registration certificate includes the investment approval, promotion policy and tax identity number.' A broader general tax-compliance instrument exists separately -- the Ministry of Finance's own document repository (218 documents, fetched directly) lists a Presidential Decree on the Promulgation of the Law on Income Tax (Amended), dated 26/06/2026 in the repository's own listing -- but this iteration did NOT independently fetch/read that document's own substantive PDF text this session (download links require client-side JavaScript this session's tooling did not execute); its existence/title/date are HIGH confidence, its content is an honest gap."
          :corporate-number-provenance "https://investlaos.gov.la/starting-a-business/faqs/ ; https://www.mof.gov.la/laws&legal"
          :approval-authority-owner-authority "National Assembly (higher tier, per Art.49) / Provincial People's Assembly (per Art.50) -- the Ministry of Planning and Investment or Provincial Administration Committee routes a qualifying concession's MOU/agreement to whichever legislative body Arts.49-50 assign; MOST concessions never reach either body (see `national-spec`)"
          :approval-authority-legal-basis "Law on Investment Promotion (Amended), Art.49 (own text, read directly): '[Art.49] The National Assembly has the approval right in relation to a concession business as follows: ... 7. Activities involving a natural waterway diversion in a large watershed, a relocation of more than five hundred households, or a land concession with an area of ten thousand hectares or more, and other activities that may cause severe environmental, natural, and social impacts as defined by the relevant laws; ...'. Art.50 (own text, read directly): '[Art.50] The Provincial People's Assembly has the approval right in relation to a concession business as follows: ... 2. Activities involving a natural waterway diversion in a small watershed and a relocation of fewer than one hundred households, as well as other activities that may cause severe environmental, natural, and social impacts as defined by relevant laws; ...'."
          :approval-authority-criteria {:national-assembly-hectares-threshold 10000
                                        :national-assembly-relocated-households-threshold 500
                                        :provincial-peoples-assembly-relocated-households-ceiling 100}
          :approval-authority-provenance "https://investlaos.gov.la/wp-content/uploads/formidable/22/New_IP_Law_Amended_2024_for_Web_No62-April-2024EN-1.pdf"}
   "USA" {:name "United States"
          :owner-authority "U.S. General Services Administration (GSA) / SAM.gov"
          :legal-basis "Federal Acquisition Regulation (FAR); System for Award Management"
          :national-spec "SAM.gov entity registration + NAICS self-certification"
          :provenance "https://sam.gov/"
          :required-evidence ["EIN record"
                              "SAM.gov registration record"
                              "State business registration record"
                              "Authorized-representative record"]}
   "DEU" {:name "Germany"
          :owner-authority "Beschaffungsamt des BMI / e-Vergabe platforms"
          :legal-basis "Gesetz gegen Wettbewerbsbeschrankungen (GWB) / VgV"
          :national-spec "e-Vergabe supplier registration under EU procurement directives"
          :provenance "https://www.evergabe-online.de/"
          :required-evidence ["Handelsregister extract"
                              "e-Vergabe registration record"
                              "USt-IdNr record"
                              "Authorized-representative record"]}})

(defn spec-basis
  "The jurisdiction's requirement map, or nil -- nil means NO spec-basis,
  and the governor must hold any proposal that tries to assess or file
  on it."
  [iso3]
  (get catalog iso3))

(defn coverage
  "Honest coverage report: how many of the requested jurisdictions actually
  have a spec-basis entry. Never report a missing jurisdiction as covered."
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-lao R0: " (count catalog)
                 " jurisdictions seeded with an official spec-basis. "
                 "This is a starting catalog for market-entry navigation, "
                 "not a survey of all ~194 jurisdictions -- extend "
                 "`marketentry.facts/catalog`, never fabricate a "
                 "jurisdiction's requirements.")})))

(defn required-evidence-satisfied?
  "Does `submitted` (a set/coll of evidence keywords or strings) satisfy
  every evidence item listed for `iso3`? Missing spec-basis -> never
  satisfied."
  [iso3 submitted]
  (when-let [{:keys [required-evidence]} (spec-basis iso3)]
    (let [need (count required-evidence)
          have (count (filter (set submitted) required-evidence))]
      (= need have))))

(defn evidence-checklist [iso3]
  (:required-evidence (spec-basis iso3) []))

(defn rep-spec-basis
  "The jurisdiction's representative-related requirement map, or nil when
  this catalog has no such regime. For LAO this is deliberately nil --
  see the `catalog` docstring's honest-scope-narrowing note (this
  iteration did not locate and confirm a Lao representative-exclusion-
  extension provision at a specific article number)."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:rep-owner-authority sb)
      (select-keys sb [:rep-owner-authority :rep-legal-basis :rep-provenance]))))

(defn corporate-number-spec-basis
  "The jurisdiction's corporate-number / tax-id regime, or nil."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:corporate-number-owner-authority sb)
      (select-keys sb [:corporate-number-owner-authority
                       :corporate-number-legal-basis
                       :corporate-number-provenance]))))

(defn approval-authority-spec-basis
  "The jurisdiction's legislative-approval-authority-tier regime, or nil.
  For LAO this is real and current -- the flagship check this vertical
  adds is grounded here (Arts.49-50, National Assembly / Provincial
  People's Assembly)."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:approval-authority-owner-authority sb)
      (select-keys sb [:approval-authority-owner-authority
                       :approval-authority-legal-basis
                       :approval-authority-criteria
                       :approval-authority-provenance]))))
