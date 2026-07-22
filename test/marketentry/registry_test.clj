(ns marketentry.registry-test
  (:require [clojure.test :refer [deftest is testing]]
            [marketentry.registry :as registry]))

(deftest engagement-fee-recompute
  (let [e {:base-fee 500000 :monthly-rate 30000 :monitoring-months 12 :claimed-fee 860000.0}]
    (is (== 860000.0 (registry/compute-engagement-fee e)))
    (is (true? (registry/engagement-fee-matches-claim? e))))
  (let [bad {:base-fee 500000 :monthly-rate 30000 :monitoring-months 12 :claimed-fee 999000.0}]
    (is (false? (registry/engagement-fee-matches-claim? bad)))))

(deftest register-draft-and-submit
  (let [d (registry/register-draft "eng-1" "LAO" 0)
        s (registry/register-submit "eng-1" "LAO" 0)]
    (is (= "LAO-DFT-000000" (get d "draft_number")))
    (is (= "LAO-SUB-000000" (get s "submit_number")))
    (is (nil? (get-in d ["certificate" "proof"])))
    (is (= "draft-unsigned" (get-in s ["certificate" "status"])))))

(deftest register-requires-ids
  (is (thrown? Exception (registry/register-draft "" "LAO" 0)))
  (is (thrown? Exception (registry/register-submit "eng-1" "" 0))))

(deftest legislative-approval-national-assembly-hectares-threshold
  (testing "a land concession of 10,000 hectares or more routes to the National Assembly (Art.49 item 7)"
    (is (= :national-assembly
           (registry/legislative-approval-authority {:land-concession-hectares 10000})))
    (is (= :national-assembly
           (registry/legislative-approval-authority {:land-concession-hectares 15000})))
    (is (not= :national-assembly
              (registry/legislative-approval-authority {:land-concession-hectares 9999})))))

(deftest legislative-approval-national-assembly-households-threshold
  (testing "a relocation of MORE than 500 households routes to the National Assembly (Art.49 item 7)"
    (is (= :national-assembly
           (registry/legislative-approval-authority {:relocated-households 501})))
    (is (not= :national-assembly
              (registry/legislative-approval-authority {:relocated-households 500})))))

(deftest legislative-approval-provincial-peoples-assembly-households-ceiling
  (testing "a relocation of FEWER than 100 households (and no National-Assembly trigger) routes to the Provincial People's Assembly (Art.50 item 2's household-count component)"
    (is (= :provincial-peoples-assembly
           (registry/legislative-approval-authority {:relocated-households 50})))
    (is (= :provincial-peoples-assembly
           (registry/legislative-approval-authority {:land-concession-hectares 20 :relocated-households 0})))))

(deftest legislative-approval-gap-band-is-honestly-indeterminate
  (testing "100-500 households, or no data at all, is NOT modeled -- returns nil rather than guessing"
    (is (nil? (registry/legislative-approval-authority {:relocated-households 250})))
    (is (nil? (registry/legislative-approval-authority {})))
    (is (nil? (registry/legislative-approval-authority {:land-concession-hectares 20})))))

(deftest legislative-approval-mismatch-is-entity-scope-gated
  (testing "an engagement with no claimed authority at all is never flagged"
    (is (false? (registry/legislative-approval-mismatch? {:land-concession-hectares 15000}))))
  (testing "a claimed authority that does NOT match the independently recomputed tier -> mismatch"
    (is (true? (registry/legislative-approval-mismatch?
                {:land-concession-hectares 12000 :relocated-households 50
                 :claimed-legislative-approval :provincial-peoples-assembly}))))
  (testing "a claimed authority that DOES match -> not flagged"
    (is (false? (registry/legislative-approval-mismatch?
                 {:land-concession-hectares 12000 :relocated-households 50
                  :claimed-legislative-approval :national-assembly})))
    (is (false? (registry/legislative-approval-mismatch?
                 {:relocated-households 50
                  :claimed-legislative-approval :provincial-peoples-assembly}))))
  (testing "an indeterminate recompute (gap band) is never treated as a mismatch, even if a claim is present"
    (is (false? (registry/legislative-approval-mismatch?
                 {:relocated-households 250
                  :claimed-legislative-approval :national-assembly})))))
