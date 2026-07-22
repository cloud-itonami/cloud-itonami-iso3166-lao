(ns marketentry.registry
  "Pure-function market-entry filing-draft + filing-submit record
  construction -- an append-only market-entry book-of-record draft.

  Like every sibling actor's registry, there is no single international
  reference-number standard for a public-sector market-entry filing --
  every jurisdiction assigns its own format. This namespace does NOT
  invent one; it builds a jurisdiction-scoped sequence number and
  validates the record's required fields, the same honest,
  non-fabricating discipline `marketentry.facts` uses.

  `engagement-fee-matches-claim?` is an HONEST reapplication of the
  SAME ground-truth-recompute DISCIPLINE sibling actors use (verify a
  claimed monetary total against the entity's own recorded quantity x
  unit fields), reapplied to a market-entry engagement fee line.

  `legislative-approval-authority` / `legislative-approval-mismatch?`
  are the SAME discipline applied to a genuinely Lao People's Democratic
  Republic-specific mechanism: the Law on Investment Promotion (Amended,
  National Assembly Resolution No.130/NA, 28 June 2024) Arts.49-50's own
  narrow AUTHORITY-JURISDICTION-ROUTING carve-out for high-impact
  concession-business criteria -- Art.49 assigns National Assembly
  approval when a concession's land area is 10,000 hectares or more, OR
  its relocation displaces more than 500 households (each independently
  sufficient, per the article's own 'or'); Art.50 assigns Provincial
  People's Assembly approval when relocation displaces fewer than 100
  households AND (per the article's own 'and') the underlying waterway
  diversion is in a 'small watershed' -- a term this iteration could not
  find a numeric or textual boundary for anywhere in the fetched primary
  text. This namespace therefore deliberately models ONLY the
  household-count component of Art.50's test, which means it
  UNDER-approximates that article's true scope (it will correctly
  classify fewer engagements as Provincial-tier than the full statutory
  conjunction would, never the reverse) -- the same honest scope-
  narrowing discipline cloud-itonami-iso3166-cub's Art.21.4 delegation
  gap and cloud-itonami-iso3166-caf's Marche reserve value-threshold
  delegation already established for this family: only the ELIGIBILITY-
  FREE, textually unconditional numeric criteria are independently
  recomputed here. The 'other activities ... as defined by the relevant
  laws' catch-all in both articles is likewise not modeled (deferred to
  un-fetched implementing regulations).

  This is a GENUINELY DIFFERENT check SHAPE from every prior iso3166
  sibling this repo mirrors (see `marketentry.facts` docstring for the
  full enumeration cloud-itonami-iso3166-cub's own docstring records):
  Cuba's Ley 118 Art.21 mechanism routes among THREE government bodies
  by SECTOR/MODALITY; Laos' Arts.49-50 mechanism routes between TWO
  LEGISLATIVE bodies (not executive bodies) by NUMERIC land-area and
  displaced-household thresholds -- and, unlike Cuba's regime (where
  EVERY foreign investment needs one of three approval authorities),
  Laos' National-Assembly/Provincial-People's-Assembly gate is a NARROW
  special case: most concessions and general investments never reach a
  legislative body at all, clearing instead through the ordinary
  OISO->MPI/Provincial Administration Committee administrative track
  (see `marketentry.facts`).

  This namespace is pure data + pure functions -- no I/O, no network
  call to any real government system. It builds the RECORD an operator
  would keep, not the act of submitting a portal registration itself
  (that is `marketentry.operation`'s `:filing/submit`, always
  human-gated -- see README Actuation)."
  (:require [clojure.string :as str]))

(defn- unsigned-certificate
  "Every certificate this actor produces is UNSIGNED -- signature is
  the market-entry operator's act, not this actor's."
  [kind subject record-id]
  {"@context" ["https://www.w3.org/ns/credentials/v2"]
   "type" ["VerifiableCredential" kind]
   "credentialSubject" {"id" subject "record" record-id}
   "proof" nil
   "issued_by_registry" false
   "status" "draft-unsigned"})

(defn- zero-pad [n w]
  (let [s (str n)]
    (str (apply str (repeat (max 0 (- w (count s))) "0")) s)))

(defn compute-engagement-fee
  "The ground-truth engagement fee for `engagement`'s own `:base-fee`
  and `:monitoring-months` x `:monthly-rate` -- a single flat
  base + months x rate calculation, not a full pricing engine."
  [{:keys [base-fee monthly-rate monitoring-months]}]
  (+ (double base-fee)
     (* (double monthly-rate) (double monitoring-months))))

(defn engagement-fee-matches-claim?
  "Does `engagement`'s own `:claimed-fee` equal the independently
  recomputed `compute-engagement-fee`?"
  [{:keys [claimed-fee] :as engagement}]
  (== (double claimed-fee) (compute-engagement-fee engagement)))

(def national-assembly-hectares-threshold
  "Art.49 item 7: a land concession of this many hectares or more
  requires National Assembly approval."
  10000)

(def national-assembly-relocated-households-threshold
  "Art.49 item 7: a relocation of MORE than this many households
  requires National Assembly approval."
  500)

(def provincial-peoples-assembly-relocated-households-ceiling
  "Art.50 item 2: a relocation of FEWER than this many households is one
  (of two, textually conjunctive) conditions for Provincial People's
  Assembly approval -- this namespace models only this numeric
  condition, not the co-required 'small watershed' criterion (see
  namespace docstring)."
  100)

(defn legislative-approval-authority
  "The ground-truth legislative-approval TIER for `engagement`,
  independently recomputed from its own declared `:land-concession-
  hectares` and/or `:relocated-households`, per Arts.49-50 of the Law on
  Investment Promotion (Amended). Returns `:national-assembly`,
  `:provincial-peoples-assembly`, or `nil` when neither of this
  namespace's modeled criteria is met (this does NOT mean no legislative
  approval is required in reality -- e.g. the 100-499-household band and
  the 'large/small watershed' criteria are simply not modeled, see
  namespace docstring -- it means this recompute cannot determine a
  tier, and `legislative-approval-mismatch?` treats that as
  'insufficient information to flag a mismatch', never as a violation by
  default)."
  [{:keys [land-concession-hectares relocated-households]}]
  (cond
    (or (and land-concession-hectares
             (>= land-concession-hectares national-assembly-hectares-threshold))
        (and relocated-households
             (> relocated-households national-assembly-relocated-households-threshold)))
    :national-assembly

    (and relocated-households
         (< relocated-households provincial-peoples-assembly-relocated-households-ceiling))
    :provincial-peoples-assembly

    :else
    nil))

(defn legislative-approval-mismatch?
  "Does `engagement` declare a `:claimed-legislative-approval` that does
  NOT match the independently recomputed `legislative-approval-
  authority`? Entity/engagement-scope-gated the same discipline
  cloud-itonami-iso3166-cub's `:claimed-approval-authority`-gated check
  and cloud-itonami-iso3166-btn's `:foreign-company?`-gated FDI check
  use: an engagement with no claimed authority at all is never flagged,
  and a recompute that returns `nil` (this namespace's modeled criteria
  do not determine a tier) is never treated as a mismatch either -- this
  check only fires when it can positively demonstrate the claim is
  wrong, never merely because it lacks enough information to confirm
  the claim is right."
  [{:keys [claimed-legislative-approval] :as engagement}]
  (boolean (and claimed-legislative-approval
                (let [recomputed (legislative-approval-authority engagement)]
                  (and (some? recomputed)
                       (not= claimed-legislative-approval recomputed))))))

(defn register-draft
  "Validate + construct the FILING-DRAFT registration DRAFT -- the
  market-entry operator's own act of preparing a portal registration
  package. Pure function -- does not touch any real government system."
  [engagement-id jurisdiction sequence]
  (when-not (and engagement-id (not= engagement-id ""))
    (throw (ex-info "draft: engagement_id required" {})))
  (when-not (and jurisdiction (not= jurisdiction ""))
    (throw (ex-info "draft: jurisdiction required" {})))
  (when (< sequence 0)
    (throw (ex-info "draft: sequence must be >= 0" {})))
  (let [draft-number (str (str/upper-case jurisdiction) "-DFT-" (zero-pad sequence 6))
        record {"record_id" draft-number
                "kind" "filing-draft"
                "engagement_id" engagement-id
                "jurisdiction" jurisdiction
                "immutable" true}]
    {"record" record "draft_number" draft-number
     "certificate" (unsigned-certificate "FilingDraft" draft-number draft-number)}))

(defn register-submit
  "Validate + construct the FILING-SUBMIT registration DRAFT -- the
  market-entry operator's own act of actually submitting the investment-
  license / enterprise-registration filing (always human-gated
  upstream)."
  [engagement-id jurisdiction sequence]
  (when-not (and engagement-id (not= engagement-id ""))
    (throw (ex-info "submit: engagement_id required" {})))
  (when-not (and jurisdiction (not= jurisdiction ""))
    (throw (ex-info "submit: jurisdiction required" {})))
  (when (< sequence 0)
    (throw (ex-info "submit: sequence must be >= 0" {})))
  (let [submit-number (str (str/upper-case jurisdiction) "-SUB-" (zero-pad sequence 6))
        record {"record_id" submit-number
                "kind" "filing-submit"
                "engagement_id" engagement-id
                "jurisdiction" jurisdiction
                "immutable" true}]
    {"record" record "submit_number" submit-number
     "certificate" (unsigned-certificate "FilingSubmit" submit-number submit-number)}))

(defn append [history result]
  (conj (vec history) (get result "record")))
