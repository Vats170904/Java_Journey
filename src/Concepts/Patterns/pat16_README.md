# pat16: Descending numbers triangle

Prints rows of numbers that count down from `n`. Each row stops one number earlier than the row before.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
4 3 2 1
4 3 2
4 3
4
```

## How it works
The outer loop `i` goes up from 1 to `n`. The inner loop counts down from `n` to `i` (`j--` while `j >= i`), so row 1 prints `n` down to 1, row 2 prints `n` down to 2, and so on.

## Concepts practised
Decrementing inner loop with a changing end value

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat16.java
java Concepts.Patterns.pat16
```
