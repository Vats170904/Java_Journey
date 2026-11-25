# pat5: Row letter repeated

Prints the same capital letter across a whole row: A in row 1, B in row 2, and so on.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
A A A A
B B B B
C C C C
D D D D
```

## How it works
`(char)(i + 64)` converts the row number to a capital letter. Because it uses `i`, not `j`, the letter stays the same across the row.

## Concepts practised
ASCII values, type casting `(char)`

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat5.java
java Concepts.Patterns.pat5
```
