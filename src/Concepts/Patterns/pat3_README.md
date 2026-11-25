# pat3: Alphabet in every row (A, B, C, ...)

Prints the letters A, B, C, ... in every row of an n x n square. It has the same code and output as `pat2`, without the ASCII comments.

## Input
One integer `n`.

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
The letter is `(char)(j + 64)`, so it depends only on the column and repeats on each row.

## Concepts practised
ASCII values, type casting `(char)`

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat3.java
java Concepts.Patterns.pat3
```
