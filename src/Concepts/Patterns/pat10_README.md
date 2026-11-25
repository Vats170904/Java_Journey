# pat10: Alphabet triangle (A, AB, ABC, ...)

Prints a triangle of capital letters. Each row starts at A and runs up to the row's length.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
A
A B
A B C
A B C D
```

## How it works
The inner loop runs up to `i` and prints `(char)(j + 64)`, which is the j-th capital letter.

## Concepts practised
Dependent inner loop, ASCII values

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat10.java
java Concepts.Patterns.pat10
```
