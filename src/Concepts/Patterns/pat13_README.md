# pat13: Inverted right triangle of stars

Prints a triangle that starts with `n` stars and loses one star on every row.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
* * * *
* * *
* *
*
```

## How it works
The outer loop counts down from `n` to 1 (`i--`), and the inner loop prints `i` stars, so the rows get shorter.

## Concepts practised
Decrementing loops, inverted patterns

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat13.java
java Concepts.Patterns.pat13
```
