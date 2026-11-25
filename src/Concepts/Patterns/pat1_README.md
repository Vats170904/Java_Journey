# pat1: Rectangle of stars

Prints a rectangle of `*` with the number of rows and columns you enter.

## Input
Rows, then columns (the program prompts for each).

## Example
Input: `3 5`

Output:
```
* * * * *
* * * * *
* * * * *
```

## How it works
The outer loop sets the number of lines. The inner loop sets how many stars go on each line. Both counts are independent, so the shape can be any rectangle.

## Concepts practised
Nested loops, rows vs columns

## Run it
The file declares `package Concepts.Patterns;`, so compile and run it from the `src` folder:
```
cd src
javac Concepts/Patterns/pat1.java
java Concepts.Patterns.pat1
```
