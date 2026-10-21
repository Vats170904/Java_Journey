# Exercise: Check Whether a Real Number Is an Integer

## Problem Statement

Write a Java program that takes a real number as input and determines whether it is an integer.

An integer is a whole number without a fractional part. Examples include `-5`, `0`, `3`, and `100`. Numbers such as `3.14` and `-2.5` are not integers.

## Requirements

1. Read a real number using `Scanner` and `nextDouble()`.
2. Convert the `double` value into an `int` using type casting.
3. Subtract the converted integer from the original number.
4. If the difference is `0`, print `"Is an Integer"`. Otherwise, print `"Not an Integer"`.

## Sample Input and Output

**Example 1**

Input:
```text
3.0
```

Output:
```text
Is an Integer
```

**Example 2**

Input:
```text
3.12453
```

Output:
```text
Not an Integer
```

**Example 3**

Input:
```text
-5.0
```

Output:
```text
Is an Integer
```

**Example 4**

Input:
```text
-2.5
```

Output:
```text
Not an Integer
```

## Concepts Practised

- `Scanner` for user input
- `double` and `int` data types
- Type casting using `(int)`
- Arithmetic operators
- Equality operator (`==`)
- `if-else` conditional statements

## Learning Objective

Understand how type casting converts a real number into an integer and how conditional statements can be used to check whether a number has a fractional part.

## Complexity Analysis

- **Time Complexity:** O(1)
- **Space Complexity:** O(1)

## Solution

See [`IntORNot.java`](./IntORNot.java) for the Java implementation.