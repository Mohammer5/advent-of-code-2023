# advent-of-code-2023

This is my attempt at solving the Advent of Code 2023 puzzles with clojure and
leiningen. These two are the only two requirements to run the code (plus their
dependencies).

Each puzzle can be run with the following command `lein d[n]e[m]` where `n` is
the day and `m` is the exercise. The first day has to exercises, so the
following two commands work:

```
lein d1e1 # puzzle for day 1 exercise 1
lein d1e2 # puzzle for day 1 exercise 2
```

The examples were implemented with tests. They can be run with the same
commands for running an actual exercise with an additional `e` at the end of
the command:

```sh
lein d1e1e # example for day 1 exercise 1
lein d1e2e # example for day 1 exercise 2
lein d2e1e # example for day 2 exercise 1
lein d2e2e # example for day 2 exercise 2
```
