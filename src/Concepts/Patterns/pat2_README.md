# pat2: Alphabet in every row (A, B, C, ...)

Prints the letters A to the n-th letter in every row of an n x n square.

## Input
One integer `n` (rows = columns).

## Example
Input: `4`

Output:
```
A B C D
A B C D
A B C D
A B C D
```

## How it works
`j + 64` gives the ASCII code of the j-th capital letter (A = 65), and the `(char)` cast turns it into the letter. Since the letter depends on `j` (column), every row is identical. Capital letters are 65 to 90, small letters 97 to 122.

## Concepts practised
ASCII values, type casting `(char)`

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat2.java
java Concepts.Patterns.pat2
```
