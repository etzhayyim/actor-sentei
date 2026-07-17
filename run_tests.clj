(require '[clojure.test :as t])

(doseq [ns-sym '[sentei.methods.test-prune
                  sentei.murakumo-test
                  sentei.repository-contract-test]]
  (require ns-sym))

(let [result (apply t/run-tests
                    '[sentei.methods.test-prune
                      sentei.murakumo-test
                      sentei.repository-contract-test])]
  (System/exit (if (zero? (+ (:fail result) (:error result))) 0 1)))
