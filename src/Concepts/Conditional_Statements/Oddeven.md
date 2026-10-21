# Exercise: Check Whether a Number Is Even, Odd, or Divisible by 5

## Problem Statement

Write a Java program that performs two checks:

1. Determines whether an integer is even or odd.
2. Determines whether another integer is divisible by 5.

An integer is **even** if it is divisible by 2 without a remainder. Otherwise, it is odd.

An integer is **divisible by 5** if the remainder after dividing it by 5 is zero.

## Requirements

1. Read an integer from the user using `Scanner` and `nextInt()`.
2. Use the modulus operator (`%`) to check whether the first number is even or odd.
3. Read a second integer from the user.
4. Check whether the second number is divisible by 5 using the modulus operator.
5. Print the appropriate result for each check.

## Sample Input and Output

**Example 1: Even number and divisible by 5**

Input:
```text
Enter a Number:
10
Enter a Number:
25
```

Output:
```text
Even
Divisible by 5
```

**Example 2: Odd number and not divisible by 5**

Input:
```text
Enter a Number:
7
Enter a Number:
12
```

Output:
```text
Odd
Not
```

**Example 3: Odd number and divisible by 5**

Input:
```text
Enter a Number:
15
Enter a Number:
35
```

Output:
```text
Odd
Divisible by 5
```

## Concepts Practised

- `Scanner` for user input
- `int` data type
- Modulus operator (`%`)
- `if-else` conditional statements
- Equality operator (`==`)
- Checking divisibility using remainders

## Learning Objective

Understand how the modulus operator can be used with conditional statements to determine whether a number is even, odd, or divisible by a given number.

## Complexity Analysis

- **Time Complexity:** O(1)
- **Space Complexity:** O(1)

## Solution

See [`Oddeven.java`](./Oddeven.java) for the Java implementation.