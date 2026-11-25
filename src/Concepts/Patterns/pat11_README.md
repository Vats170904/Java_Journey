# pat11: Alternating case alphabet triangle

Prints an alphabet triangle in which odd rows use small letters and even rows use capital letters.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
a
A B
a b c
A B C D
```

## How it works
Each row runs from 1 to `i`. `i % 2 == 0` selects capitals with `(char)(j + 64)`, otherwise small letters with `(char)(j + 96)`.

## Concepts practised
Conditions inside a triangle pattern, modulus `%`

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat11.java
java Concepts.Patterns.pat11
```
