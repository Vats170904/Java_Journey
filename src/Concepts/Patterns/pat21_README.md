# pat21: Floyd's triangle (fixed size)

Prints Floyd's triangle with 5 rows. It is the same pattern as `pat19`, but with no keyboard input: the number of rows is fixed at 5 in the code (`rw = 5`).

## Input
None. Change `rw` in the code to change the size.

## Example
Input: (none, `rw` is 5)

Output:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

## How it works
A counter `a` starts at 1 outside the loops and increases by one after every print, so the numbers continue from row to row.

## Concepts practised
A counter variable outside the loops, hard-coded values vs `Scanner` input

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat21.java
java Concepts.Patterns.pat21
```
