# pat14: Inverted triangle of repeated numbers

Prints an upside-down triangle. Row `i` contains the number `i` repeated `i` times, starting from `n` and counting down to 1.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
4 4 4 4
3 3 3
2 2
1
```

## How it works
The outer loop counts down from `n` to 1 (`i--`). The inner loop runs `j <= i` and prints `i`, so the first row is the longest and the numbers shrink with the rows.

## Concepts practised
Decrementing outer loop, dependent inner loop

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat14.java
java Concepts.Patterns.pat14
```
