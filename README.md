# Scala foldLeft Immutability Misunderstanding

This repository demonstrates a common misunderstanding when using `foldLeft` in Scala, specifically regarding immutability.  The example code attempts to build a list by modifying the accumulator within `foldLeft`. While this example works,  the approach is not generally correct, and can lead to unexpected behavior with other data structures.