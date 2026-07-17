#!/usr/bin/env bb
;; sentei self-publish — thin wrapper delegating to the SHARED kototama organism runtime.
(require '[babashka.process :refer [shell]])
(def root (-> *file* (java.io.File.) .getAbsoluteFile .getParentFile .getParentFile))
(def kototama-root
  (or (System/getenv "KOTOTAMA_ROOT")
      (str root "/../../kotoba-lang/kototama")))
(def runtime (str kototama-root "/lib/actor/publish.bb"))
(when-not (.isFile (java.io.File. runtime))
  (throw (ex-info "kototama actor publisher is not available"
                  {:expected runtime :override "KOTOTAMA_ROOT"})))
(apply shell "bb" runtime "--actor" (str root) *command-line-args*)
