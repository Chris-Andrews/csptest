(ns csptest.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [csptest.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'csptest.core-test))
    0
    1))
