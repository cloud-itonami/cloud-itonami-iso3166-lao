(ns statute.facts-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            [statute.facts :as facts]))

(deftest lao-has-spec-basis
  (let [sb (facts/spec-basis "LAO")]
    (is (= 4 (count sb)))
    (is (every? #(str/starts-with? (:statute/url %) "https://") sb))
    (is (every? :statute/law-number sb))))

(deftest unknown-jurisdiction-has-no-spec-basis
  (is (nil? (facts/spec-basis "ATL")))
  (is (nil? (facts/spec-basis "ZZZ"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["LAO" "JPN" "ATL"])]
    (is (= 3 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["ATL" "JPN"] (:missing-jurisdictions c)))))

(deftest by-topic-filters
  (is (= #{"lao.investment-promotion-law-amended" "lao.decision-enterprise-registration-0023-moic-derm"}
         (set (mapv :statute/id (facts/by-topic "LAO" :corporate-governance)))))
  (is (= #{"lao.investment-promotion-law-amended" "lao.decree-controlled-business-list-03-pm"}
         (set (mapv :statute/id (facts/by-topic "LAO" :foreign-investment)))))
  (is (empty? (facts/by-topic "ATL" :foreign-investment))))

(deftest lao-labour-law-is-honestly-absent
  (is (empty? (facts/by-topic "LAO" :labor))
      "this iteration could not independently confirm Laos' Labour Law citation -- deliberately not claimed, see namespace docstring"))
