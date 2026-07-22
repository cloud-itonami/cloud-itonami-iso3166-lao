(ns marketentry.facts-test
  (:require [clojure.test :refer [deftest is testing]]
            [marketentry.facts :as facts]))

(deftest lao-has-spec-basis
  (let [sb (facts/spec-basis "LAO")]
    (is (some? sb))
    (is (string? (:provenance sb)))
    (is (seq (:required-evidence sb)))
    (is (some? (facts/corporate-number-spec-basis "LAO")))
    (is (some? (facts/approval-authority-spec-basis "LAO")))))

(deftest lao-rep-spec-basis-is-honestly-absent
  (testing "no verifiable Lao representative-exclusion-extension provision was located -- deliberately not claimed"
    (is (nil? (facts/rep-spec-basis "LAO")))))

(deftest unknown-jurisdiction-has-no-spec-basis
  (is (nil? (facts/spec-basis "ATL")))
  (is (nil? (facts/spec-basis "ZZZ"))))

(deftest required-evidence-satisfied
  (let [sb (facts/spec-basis "LAO")
        all (:required-evidence sb)]
    (is (true? (facts/required-evidence-satisfied? "LAO" all)))
    (is (not (facts/required-evidence-satisfied? "LAO" (take 1 all))))
    (is (nil? (facts/required-evidence-satisfied? "ATL" all)))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["LAO" "USA" "ATL"])]
    (is (= 3 (:requested c)))
    (is (= 2 (:covered c)))
    (is (= ["ATL"] (:missing-jurisdictions c)))))

(deftest approval-authority-spec-basis-criteria
  (let [aa (facts/approval-authority-spec-basis "LAO")]
    (is (= 10000 (get-in aa [:approval-authority-criteria :national-assembly-hectares-threshold])))
    (is (= 500 (get-in aa [:approval-authority-criteria :national-assembly-relocated-households-threshold])))
    (is (= 100 (get-in aa [:approval-authority-criteria :provincial-peoples-assembly-relocated-households-ceiling])))))
