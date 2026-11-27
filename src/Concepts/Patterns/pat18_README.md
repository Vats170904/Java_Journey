# pat18: Plus sign

Prints a plus (`+`) made of stars, with one vertical line and one horizontal line crossing in the middle. It only prints for odd `n`.

## Input
One integer `n`. It must be odd, otherwise the program prints nothing.

## Example
Input: `5`

Output:
```
       *
       *
 *  *  *  *  *
       *
       *
```

## How it works
`mid = (n + 1) / 2` is the middle row and column. A cell prints ` * ` when its row or its column equals `mid`, and spaces otherwise. The `if (rw % 2 != 0)` check skips even numbers, because they have no single middle line.

## Concepts practised
Finding the middle with integer division, conditions with `||`, odd/even check

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat18.java
java Concepts.Patterns.pat18
```
