# pat7: Right triangle of stars

Prints a right-angled triangle of stars. Row `i` has `i` stars.

## Input
One integer `n` (number of rows).

## Example
Input: `4`

Output:
```
*
* *
* * *
* * * *
```

## How it works
The inner loop runs `j <= i` instead of up to a fixed number, so each row is one star longer than the previous one.

## Concepts practised
Dependent inner loop

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat7.java
java Concepts.Patterns.pat7
```
