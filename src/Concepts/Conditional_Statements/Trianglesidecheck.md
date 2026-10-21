# Exercise: Check Whether Three Sides Form a Triangle

## Problem Statement

Write a Java program that takes three integers representing the sides of a triangle and determines whether they can form a valid triangle.

Three sides form a triangle if the sum of any two sides is strictly greater than the third side.

## Requirements

1. Read three side lengths from the user using `Scanner` and `nextInt()`.
2. Check all three triangle inequalities:
   - The sum of the first and second sides must be greater than the third side.
   - The sum of the second and third sides must be greater than the first side.
   - The sum of the first and third sides must be greater than the second side.
3. Use the logical AND operator (`&&`) to ensure all three conditions are true.
4. Print whether the given sides form a triangle.

## Sample Input and Output

**Example 1: Valid triangle**

Input:
```text
Enter the first side:
3
Enter the Second side:
4
Enter the Thirsd side:
5
```

Output:
```text
The given sides forms a Triangle
```

**Example 2: Invalid triangle**

Input:
```text
Enter the first side:
2
Enter the Second side:
3
Enter the Thirsd side:
6
```

Output:
```text
The given sides does not form a Triangle
```

**Example 3: Equal sides**

Input:
```text
5
5
5
```

Output:
```text
The given sides forms a Triangle
```

## Concepts Practised

- `Scanner` for user input
- `int` data type
- `if-else` conditional statements
- Relational operator (`>`)
- Logical AND operator (`&&`)
- Triangle inequality theorem

## Learning Objective

Understand how to combine multiple conditions using logical operators to solve a mathematical problem in Java.

## Complexity Analysis

- **Time Complexity:** O(1)
- **Space Complexity:** O(1)

## Solution

See [`Trianglesidecheck.java`](./Trianglesidecheck.java) for the Java implementation.