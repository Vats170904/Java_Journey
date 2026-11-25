# pat8: Number triangle (1, 12, 123, ...)

Prints a triangle in which each row counts from 1 up to the row number.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
1
1 2
1 2 3
1 2 3 4
```

## How it works
The inner loop runs up to `i` and prints `j`, the column number, so every row starts from 1.

## Concepts practised
Dependent inner loop, printing the column index

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat8.java
java Concepts.Patterns.pat8
```
