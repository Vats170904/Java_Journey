# pat9: Triangle of repeated row numbers

Prints a triangle in which row `i` contains the number `i`, repeated `i` times.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
1
2 2
3 3 3
4 4 4 4
```

## How it works
The inner loop runs up to `i` and prints `i` (the row number), not `j`.

## Concepts practised
Dependent inner loop, printing the row index

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat9.java
java Concepts.Patterns.pat9
```
