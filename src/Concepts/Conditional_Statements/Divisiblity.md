# Exercise: Check Divisibility by 3 and 5

## Problem Statement

Write a Java program that accepts an integer from the user and determines whether it is divisible by 3, by 5, by both 3 and 5, or by neither.

A number is divisible by another number if the remainder after division is zero.

## Requirements

1. Read an integer using the `Scanner` class.
2. Check whether the number is divisible by both 3 and 5.
3. If not, check whether it is divisible by 3.
4. If neither condition is satisfied, check whether it is divisible by 5.
5. If none of these conditions is satisfied, print that the number is not divisible by 3 or 5.

## Sample Input and Output

### Example 1: Divisible by both

**Input**
```text
Enter a Number:
15
```

**Output**
```text
15 is Divisible by both 5 and 3
```

### Example 2: Divisible by 3 only

**Input**
```text
Enter a Number:
9
```

**Output**
```text
9 is Divisible by 3
```

### Example 3: Divisible by 5 only

**Input**
```text
Enter a Number:
20
```

**Output**
```text
20 is Divisible by 5
```

### Example 4: Divisible by neither

**Input**
```text
Enter a Number:
7
```

**Output**
```text
Not Divisible by 5 or 3
```

## Concepts Practised

- Java variables and integer data types
- User input using `Scanner`
- `if`, `else if`, and `else` statements
- Modulus operator (`%`)
- Relational and equality operators
- Logical AND operator (`&&`)
- Order of conditional checks

## Learning Objective

Understand how to use the modulus operator to test divisibility and how to structure multiple conditional branches so that the most specific condition is checked first.

## Complexity Analysis

- Time complexity: O(1)
- Auxiliary space complexity: O(1)

## Solution

See [`Divisiblity.java`](./Divisiblity.java) for the Java implementation.