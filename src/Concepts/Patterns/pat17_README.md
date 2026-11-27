# pat17: Hollow square

Prints a square of stars with only the border filled in and an empty inside.

## Input
One integer `n` (side length).

## Example
Input: `5`

Output:
```
 *  *  *  *  *
 *           *
 *           *
 *           *
 *  *  *  *  *
```

## How it works
A cell prints ` * ` when it is on the first or last row (`i == 1 || i == n`) or on the first or last column (`j == 1 || j == n`). All other cells print three spaces. Using 3 characters for both cases keeps the columns lined up.

## Concepts practised
Conditions with `||`, hollow patterns, spacing

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat17.java
java Concepts.Patterns.pat17
```
