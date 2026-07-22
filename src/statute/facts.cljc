(ns statute.facts
  "General-law compliance catalog for the Lao People's Democratic
  Republic (LAO) -- extends this repo's existing `marketentry.facts`
  (public-sector market-entry/foreign-investment only, narrow scope)
  with a second, orthogonal catalog of national statutes a foreign
  investor operating in this jurisdiction must generally track for
  compliance. Mirrors cloud-itonami-iso3166-jpn/-deu/-bgr/-aze/-alb/
  -arm/-atg/-ben/-btn/-caf/-cub's `statute.facts` (ADR-2607141700,
  cloud-itonami-compliance-fact-federation).

  Every entry cites an OFFICIAL government-hosted URL -- never
  fabricated. All entries below were fetched directly (curl-verified,
  2026-07-23) from official Lao government sites
  (`investlaos.gov.la` -- the Investment Promotion Department's own
  site; `moic.gov.la` -- the Ministry of Industry and Commerce's own
  site; `mof.gov.la` -- the Ministry of Finance's own site).

  - **Law on Investment Promotion (Amended)**: this is the SAME law
    `marketentry.facts` uses as its market-entry spec-basis; it is ALSO
    catalogued here as a general national-law reference per this task's
    own instructions, since a foreign investor tracks it both as a
    market-entry gate and as an ongoing compliance statute (investment
    incentives, investor rights/obligations, dispute resolution, and
    prohibitions all live inside this one law's own later chapters).
    National Assembly Resolution No.130/NA (28 June 2024), Presidential
    Decree No.124/P (12 Aug 2024), in force 1 October 2024 -- own text
    fetched and read directly as a real 61-page machine-readable PDF
    from `investlaos.gov.la`.
  - **Business/company registration**: this iteration specifically
    investigated, rather than assumed by analogy to other siblings, what
    Laos' business-registration mechanism actually is. The Investment
    Promotion Law's own text cross-references 'the Law on Enterprise'
    repeatedly (Art.34, Art.35, Art.38, Art.39, own text, read directly)
    as the governing instrument, administered by the Department of
    Enterprise Management, Ministry of Industry and Commerce (MOIC) --
    confirmed directly from `moic.gov.la`'s own Business Registration
    service page (own text, read directly: 'Register and incorporate
    enterprises. Department of Enterprise Management ...
    dem@moic.gov.la'). HONEST GAP: this iteration could NOT
    independently fetch the Law on Enterprise's OWN primary text,
    law-number, or enactment date this session -- `moic.gov.la`'s own
    'Laws & Legal Documents Repository' page returned '0 results found'
    (a client-side-rendered page with no backing documents indexed as
    of this session) and `laotradeportal.gov.la`'s legal-document search
    required client-side JavaScript this session's curl-based fetching
    did not execute. Because this catalog cannot confirm even the Law on
    Enterprise's own citation metadata, it is NOT given a `catalog`
    entry below (a law not independently confirmed has no spec-basis,
    full stop) -- instead, this catalog carries the one implementing
    instrument this iteration COULD independently confirm by name,
    number and date from an official source: the 'Decision on Enterprise
    Registration No..0023/MOIC.DERM, Dated 9.01.2019', read directly
    from `investlaos.gov.la`'s own how-to-do-business page.
  - **Controlled Business List**: 'Decree on The Endorsement of the
    [Business Activities under] the Controlled Business List and the
    Concession List of Lao PDR No.03/PM, Dated 10.01.2019' -- read
    directly from `investlaos.gov.la`'s own how-to-do-business page,
    and independently corroborated by the Investment Promotion Law's own
    Art.33 ('A business listed in the controlled list ... shall undergo
    a review and consideration by relevant sectors before being granted
    an investment license by the Ministry of Planning and Investment or
    a Provincial Administration Committee').
  - **Income Tax Law (Amended)**: the Ministry of Finance's own
    document repository (`mof.gov.la/laws&legal`, 218 documents total as
    of this session, fetched directly) lists a Presidential Decree
    titled (own text, read directly, Lao-language title) 'ລັດຖະດໍາລັດ
    ກ່ຽວກັບການປະກາດໃຊ້ກົດໝາຍວ່າດ້ວຍອາກອນລາຍໄດ້ (ສະບັບປັບປຸງ)'
    ('Presidential Decree on the Promulgation of the Law on Income Tax
    (Amended)'), listed creation date 26/06/2026 in the repository's own
    listing. HONEST GAP: this iteration could NOT download or read this
    document's own substantive PDF text this session (the repository's
    download links require client-side JavaScript this session's
    curl-based fetching did not execute) -- its existence, title and
    listed date are HIGH confidence (read directly from the ministry's
    own document list), its substantive articles are NOT read.
  - **Labour Law**: this iteration specifically searched for Laos' own
    Labour Law (Ministry of Labour and Social Welfare) and, unlike
    cloud-itonami-iso3166-cub's independently-verified Codigo de
    Trabajo, could NOT independently locate or confirm its own
    law-number, date, or text this session -- the Ministry of Labour and
    Social Welfare's own website did not resolve at any domain name this
    iteration tried, and the National Assembly's own site
    (`na.gov.la`) has a Lao-only navigation structure this iteration
    could not resolve to a specific law-repository listing within this
    session's fetch budget. The ONE thing independently confirmed is a
    bare cross-reference in the Investment Promotion Law's own text
    (Art.70 item 2, read directly): 'To import workers in accordance
    with the Law on Labor.' -- confirming existence and relevance, but
    giving no citable law-number or date. This catalog does NOT carry a
    Labour Law entry as a result -- an honestly-reported gap, the same
    discipline several siblings already established for their own
    jurisdiction's labour statute.

  A law not in this table has NO spec-basis, full stop; extend
  `catalog`, do not invent an id/url.")

(def catalog
  "iso3 -> vector of statute entries. `:statute/url` + `:statute/law-number`
  are the citation the governor requires before any compliance-fact
  proposal referencing this law can commit."
  {"LAO"
   [{:statute/id "lao.investment-promotion-law-amended"
     :statute/title "Law on Investment Promotion (Amended)"
     :statute/jurisdiction "LAO"
     :statute/kind :law
     :statute/law-number "National Assembly Resolution No.130/NA (Vientiane Capital, 28 June 2024) adopting the Law; Presidential Decree No.124/P (Vientiane Capital, 12 Aug 2024) promulgating it; own Art.101 states entry into force 1 October 2024, replacing Law No.14/NA (17 November 2016) and Law No.80/NA (4 December 2019)"
     :statute/url "https://investlaos.gov.la/wp-content/uploads/formidable/22/New_IP_Law_Amended_2024_for_Web_No62-April-2024EN-1.pdf"
     :statute/url-provenance :official-investlaos-gov-la
     :statute/enacted-date "2024-06-28"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:foreign-investment :corporate-governance :incorporation :tax}}
    {:statute/id "lao.decision-enterprise-registration-0023-moic-derm"
     :statute/title "Decision on Enterprise Registration No..0023/MOIC.DERM"
     :statute/jurisdiction "LAO"
     :statute/kind :decision
     :statute/law-number "Decision No..0023/MOIC.DERM, dated 9 January 2019 (Ministry of Industry and Commerce, Department of Enterprise Registration and Management) -- this iteration could NOT independently fetch the underlying Law on Enterprise's own primary text/law-number this session (see namespace docstring); this Decision is the implementing instrument this iteration COULD independently confirm"
     :statute/url "https://investlaos.gov.la/starting-a-business/how-to-do-business-in-laos/"
     :statute/url-provenance :official-investlaos-gov-la
     :statute/enacted-date "2019-01-09"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:corporate-governance :incorporation}}
    {:statute/id "lao.decree-controlled-business-list-03-pm"
     :statute/title "Decree on The Endorsement of the Controlled Business List and the Concession List of Lao PDR"
     :statute/jurisdiction "LAO"
     :statute/kind :decree
     :statute/law-number "Decree No.03/PM, dated 10 January 2019 (Prime Minister's Office)"
     :statute/url "https://investlaos.gov.la/starting-a-business/how-to-do-business-in-laos/"
     :statute/url-provenance :official-investlaos-gov-la
     :statute/enacted-date "2019-01-10"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:foreign-investment :sector-classification}}
    {:statute/id "lao.income-tax-law-amended-decree"
     :statute/title "Presidential Decree on the Promulgation of the Law on Income Tax (Amended)"
     :statute/jurisdiction "LAO"
     :statute/kind :decree
     :statute/law-number "Listed in the Ministry of Finance's own document repository (mof.gov.la/laws&legal) with creation date 26/06/2026; this iteration confirmed the document's title and listed date directly but did NOT download/read its own substantive PDF text this session (see namespace docstring) -- an honest gap on the underlying Law's own promulgation-decree number and the Law's own text"
     :statute/url "https://www.mof.gov.la/laws&legal"
     :statute/url-provenance :official-mof-gov-la
     :statute/enacted-date "2026-06-26"
     :statute/retrieved-at "2026-07-23"
     :statute/topic #{:tax}}]})

(defn spec-basis
  "The jurisdiction's statute vector, or nil -- nil means NO spec-basis
  for that jurisdiction yet."
  [iso3]
  (get catalog iso3))

(defn coverage
  "Honest coverage report, same shape/discipline as `marketentry.facts/coverage`:
  never report a missing jurisdiction as covered."
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-lao statute.facts Wave 0 (ADR-2607141700): "
                 (count (get catalog "LAO")) " LAO statute(s) seeded with an "
                 "official citation. Extend `statute.facts/catalog`, never "
                 "fabricate a law-id or URL.")})))

(defn by-topic
  "Statutes for `iso3` tagged with `topic` (e.g. :labor, :data-protection)."
  [iso3 topic]
  (filterv #(contains? (:statute/topic %) topic) (spec-basis iso3)))
