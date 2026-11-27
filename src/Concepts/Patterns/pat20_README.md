# pat20: Triangle of 1s and 0s (checkerboard style)

Prints a triangle of 1s and 0s in which the values alternate like a checkerboard. Every row starts and ends with 1. The number of rows is fixed at 5 in the code (`rw = 5`).

## Input
None. Change `rw` in the code to change the size.

## Example
Input: (none, `rw` is 5)

Output:
```
1
01
101
0101
10101
```

## How it works
The inner loop runs up to `i`. A cell prints `1` if `i == j` or if `(i + j) % 2 == 0`, otherwise `0`. The check `i == j` is not strictly needed, because when `i == j` the sum `i + j` is already even. Note that numbers are printed without spaces.

## Concepts practised
`if`/`else if`/`else` in loops, odd/even check with modulus `%`

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat20.java
java Concepts.Patterns.pat20
```
