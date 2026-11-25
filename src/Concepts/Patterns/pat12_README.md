# pat12: Alternating numbers and letters triangle

Prints a triangle in which odd rows are numbers (1, 2, 3, ...) and even rows are capital letters (A, B, C, ...).

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
1
A B
1 2 3
A B C D
```

## How it works
If `i % 2 != 0` (odd row) the program prints the column number `j`. Otherwise it prints the letter `(char)(j + 64)`.

## Concepts practised
Conditions inside a triangle pattern, mixing `int` and `char` output

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat12.java
java Concepts.Patterns.pat12
```
