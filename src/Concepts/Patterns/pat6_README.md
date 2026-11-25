# pat6: Alternating lower and upper case rows

Prints one letter per row, repeated across the row. Odd rows use a small letter and even rows use a capital letter.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
a a a a
B B B B
c c c c
D D D D
```

## How it works
If `i % 2 == 0` the row is even and prints `(char)(i + 64)` (capital). Otherwise it prints `(char)(i + 96)` (small, since a = 97). The letter is always the row's own letter, only the case alternates.

## Concepts practised
`if`/`else` inside loops, modulus `%`, ASCII values

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat6.java
java Concepts.Patterns.pat6
```
