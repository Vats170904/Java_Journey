# Exercise: Check Whether an Integer's Magnitude Is Smaller Than 69

## Problem Statement

Write a Java program that takes an integer as input and checks whether its magnitude (absolute value) is smaller than 69.

The magnitude of an integer is its absolute value, which is always non-negative.

For example:
- The magnitude of `-50` is `50`.
- The magnitude of `68` is `68`.
- The magnitude of `-69` is `69`.

## Requirements

1. Read an integer from the user using `Scanner`.
2. Calculate its magnitude using `Math.abs()`.
3. Check whether the magnitude is strictly smaller than `69`.
4. Print an appropriate message based on the condition.

## Sample Input and Output

**Example 1**

Input:
```text
-50
```

Output:
```text
Magnitude is smaller than 69
```

**Example 2**

Input:
```text
69
```

Output:
```text
Magnitude is not smaller than 69
```

**Example 3**

Input:
```text
-100
```

Output:
```text
Magnitude is not smaller than 69
```

## Concepts Practised

- `Scanner` for user input
- `Math.abs()` for calculating absolute value
- `if-else` conditional statements
- Comparison operator (`<`)

## Learning Objective

Understand how to calculate the magnitude of an integer and use a conditional statement to check whether it is below a given threshold.

## Complexity Analysis

- **Time Complexity:** O(1)
- **Space Complexity:** O(1)

## Solution

See [`Magnitude.java`](./Magnitude.java) for the Java implementation.