(ns culture.facts
  "Country-level regional-culture catalog for Laos (LAO) -- national
  dishes, protected products, beverages, crafts, festivals and heritage
  sites, per ADR-2607171400 addendum 2 (cloud-itonami-municipality-
  culture-catalog Wave 1, in com-junkawasaki/root). Sibling namespace to
  `marketentry.facts` / `statute.facts` (ADR-2607141700); city-level
  counterparts live in the cloud-itonami-municipality-* repos.

  Catalog is keyed by UPPERCASE ISO3 (mirrors `statute.facts`); entries
  carry no :culture/municipality (that attribute is city-level only).

  Every entry cites a source URL that was actually fetched and read on
  :culture/retrieved-at -- never fabricated. Summaries state only what the
  cited source confirms. An item not in this table has NO spec-basis, full
  stop; extend `catalog`, do not invent an id/url.")

(def catalog
  "iso3 -> vector of culture entries."
  {"LAO"
   [{:culture/id "lao.dish.larb"
     :culture/name "Larb"
     :culture/name-local "ລາບ"
     :culture/country "LAO"
     :culture/kind :dish
     :culture/summary "Minced meat salad from Lao cuisine, seasoned with lime juice, fish sauce, roasted ground rice and fresh herbs; the article states larb originated in Laos and is the national dish of Laos."
     :culture/url "https://en.wikipedia.org/wiki/Larb"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.dish.sticky-rice"
     :culture/name "Sticky rice"
     :culture/name-local "ເຂົ້າໜຽວ"
     :culture/country "LAO"
     :culture/kind :dish
     :culture/summary "Glutinous rice, described in the article as the national dish of Laos, with Laos having the highest per-capita consumption of it in the world at roughly 171 kg per person annually."
     :culture/url "https://en.wikipedia.org/wiki/Sticky_rice"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.dish.sai-oua"
     :culture/name "Sai oua"
     :culture/country "LAO"
     :culture/kind :dish
     :culture/summary "Seasoned pork sausage that originated in Luang Prabang, Laos, and is widely enjoyed across Laos, Myanmar and Thailand."
     :culture/url "https://en.wikipedia.org/wiki/Sai_oua"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.dish.or-lam"
     :culture/name "Or lam"
     :culture/country "LAO"
     :culture/kind :dish
     :culture/summary "Mildly spicy, slightly numbing Laotian stew originating from Luang Prabang, Laos, with a peppery broth made from lemongrass, chilies, and various meats and vegetables."
     :culture/url "https://en.wikipedia.org/wiki/Or_lam"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.beverage.beerlao"
     :culture/name "Beerlao"
     :culture/country "LAO"
     :culture/kind :beverage
     :culture/summary "Range of beers produced by the Lao Brewery Company based in Vientiane, Laos, brewed with locally grown jasmine rice and imported ingredients from Europe."
     :culture/url "https://en.wikipedia.org/wiki/Beerlao"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.beverage.lao-lao"
     :culture/name "Lao-Lao"
     :culture/country "LAO"
     :culture/kind :beverage
     :culture/summary "Laotian rice whisky produced in Laos that serves as a staple spirit in the country alongside Beerlao."
     :culture/url "https://en.wikipedia.org/wiki/Lao-Lao"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.festival.lao-new-year"
     :culture/name "Lao New Year"
     :culture/name-local "Pi Mai Lao"
     :culture/country "LAO"
     :culture/kind :festival
     :culture/summary "Traditional celebration known in Laos as Pi Mai, celebrated annually from 13-14 April to 15-16 April with water rituals, sand stupas, animal liberation and cultural festivities."
     :culture/url "https://en.wikipedia.org/wiki/Lao_New_Year"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.heritage.luang-prabang"
     :culture/name "Town of Luang Prabang"
     :culture/country "LAO"
     :culture/kind :heritage
     :culture/summary "City in Laos designated a UNESCO World Heritage Site in 1995, recognized for blending Lao architecture, European colonial buildings, and over 30 Buddhist temples."
     :culture/url "https://en.wikipedia.org/wiki/Town_of_Luang_Prabang"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.heritage.vat-phou"
     :culture/name "Vat Phou"
     :culture/name-local "ວັດພູຈໍາປາສັກ"
     :culture/country "LAO"
     :culture/kind :heritage
     :culture/summary "Ruined Khmer-Hindu temple complex in southern Laos, designated a UNESCO World Heritage Site in 2001 for its cultural significance spanning from prehistoric times through the Angkorian period."
     :culture/url "https://en.wikipedia.org/wiki/Vat_Phou"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}
    {:culture/id "lao.heritage.plain-of-jars"
     :culture/name "Plain of Jars"
     :culture/country "LAO"
     :culture/kind :heritage
     :culture/summary "UNESCO World Heritage Site in Laos, inscribed in 2019, consisting of thousands of stone jars scattered across upland valleys, part of an Iron Age burial landscape dating to approximately 1240-660 BC."
     :culture/url "https://en.wikipedia.org/wiki/Plain_of_Jars"
     :culture/url-provenance :wikipedia-en
     :culture/retrieved-at "2026-07-17"}]})

(defn spec-basis [iso3] (get catalog iso3))

(defn coverage
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-lao culture catalog "
                 "(ADR-2607171400 addendum 2, Wave 1): " (count (get catalog "LAO"))
                 " LAO entries, each with a fetched-and-read citation. "
                 "Extend `culture.facts/catalog`, never fabricate an id/url.")})))

(defn by-kind [iso3 kind]
  (filterv #(= (:culture/kind %) kind) (spec-basis iso3)))
