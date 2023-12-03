(defproject advent-of-code-2023 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot advent-of-code-2023.day1.exercise1-example
  :aliases {"d1e1"  ["run" "-m" "advent-of-code-2023.day1.exercise1"]
            "d1e1e" ["test" ":only" "advent-of-code-2023.day1.exercise1-test"]
            "d1e2"  ["run" "-m" "advent-of-code-2023.day1.exercise2"]
            "d1e2e" ["test" ":only" "advent-of-code-2023.day1.exercise2-test"]
            "d2e1"  ["run" "-m" "advent-of-code-2023.day2.exercise1"]
            "d2e1e" ["test" ":only" "advent-of-code-2023.day2.exercise1-test"]
            "d2e2"  ["run" "-m" "advent-of-code-2023.day2.exercise2"]
            "d2e2e" ["test" ":only" "advent-of-code-2023.day2.exercise2-test"]
            "d3e1"  ["run" "-m" "advent-of-code-2023.day3.exercise1"]
            "d3e1e" ["test" ":only" "advent-of-code-2023.day3.exercise1-test"]}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
