(ns sentei.repository-contract-test
  (:require [clojure.edn :as edn]
            [clojure.test :refer [deftest is]]
            [clojure.java.io :as io]))

(deftest canonical-repository-shape
  (doseq [path ["manifest.edn" "identity.edn" "dependencies.edn"
                "repository-contracts.edn" "actor.edn" "schema.edn"
                "data/pruning-ontology.kotoba.edn"
                "lex/com.etzhayyim.sentei.prune.edn"]]
    (is (some? (edn/read-string (slurp path))) path))
  (is (not (.exists (io/file "manifest.jsonld"))))
  (is (not (.exists (io/file "run_tests.sh"))))
  (is (= "com.etzhayyim.sentei.prune"
         (get (edn/read-string (slurp "lex/com.etzhayyim.sentei.prune.edn")) "id"))))
