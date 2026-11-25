# Understanding_Patterns: Number grid (1 to columns)

Reads the number of rows and columns and prints the numbers 1 to `columns` in every row. A first look at how nested loops work.

## Input
Two integers, one after the other: rows, then columns.

## Example
Input: `4 5`

Output:
```
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
```

## How it works
The outer loop `i` runs once per row. The inner loop `j` runs once per column and prints its own value `j`. `println()` after the inner loop moves to the next line.

## Concepts practised
Nested loops, `Scanner` input

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/Understanding_Patterns.java
java Concepts.Patterns.Understanding_Patterns
```
