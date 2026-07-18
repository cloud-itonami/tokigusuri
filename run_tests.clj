(require '[clojure.test :as t])
(def suites '[tokigusuri.methods.test-datom-emit tokigusuri.tests.test-analyze tokigusuri.tests.test-coverage tokigusuri.tests.test-kotoba tokigusuri.murakumo-test tokigusuri.repository-contract-test])
(apply require suites)
(let [{:keys [fail error] :as r} (apply t/run-tests suites)] (println (select-keys r [:test :pass :fail :error])) (when (pos? (+ fail error)) (System/exit 1)))
