# pat15: Inverted number triangle (1234, 123, 12, 1)

Prints an upside-down triangle in which every row counts from 1 up to the row's length. The first row is the longest.

## Input
One integer `n`.

## Example
Input: `4`

Output:
```
1 2 3 4
1 2 3
1 2
1
```

## How it works
The outer loop counts down from `n` to 1. The inner loop prints `j` from 1 to `i`, so each row starts at 1 and gets shorter as `i` falls.

## Concepts practised
Decrementing outer loop, printing the column index

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat15.java
java Concepts.Patterns.pat15
```
