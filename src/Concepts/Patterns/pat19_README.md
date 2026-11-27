# pat19: Floyd's triangle (running numbers)

Prints a triangle of consecutive numbers. Row `i` holds `i` numbers and the counting carries on from one row to the next without restarting.

## Input
One integer `n` (number of rows). The prompt says "odd number", but the code works for any `n`.

## Example
Input: `5`

Output:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

## How it works
A counter `a` starts at 1 and lives outside both loops. The inner loop prints `a` and then does `a++`, so the number keeps growing across rows. This is why the counter is declared before the loops and not inside them.

## Concepts practised
A counter variable outside the loops, dependent inner loop

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat19.java
java Concepts.Patterns.pat19
```
