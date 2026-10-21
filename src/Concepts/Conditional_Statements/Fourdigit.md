# Exercise: Check Whether a Number Has Four Digits

## Problem Statement

Write a Java program that accepts an integer from the user and determines whether it is a four-digit positive number.

A number is considered a four-digit positive integer if it is greater than 999 and less than 10,000.

## Requirements

1. Read an integer using the `Scanner` class.
2. Check whether the number is greater than 999 and less than 10,000.
3. If both conditions are satisfied, print that the number has four digits.
4. Otherwise, print that it is not a four-digit number.

## Sample Input and Output

### Example 1

**Input**
```text
Enter a Number:
1234
```

**Output**
```text
1234 is a Four digit Number
```

### Example 2

**Input**
```text
Enter a Number:
456
```

**Output**
```text
456 is not a Four digit number
```

### Example 3

**Input**
```text
Enter a Number:
10000
```

**Output**
```text
10000 is not a Four digit number
```

## Concepts Practised

- Java variables and integer data types
- User input using `Scanner`
- `if-else` conditional statements
- Relational operators (`>` and `<`)
- Logical AND operator (`&&`)

## Learning Objective

Understand how to combine relational conditions using the logical AND operator to validate a number's range.

## Complexity Analysis

- Time complexity: O(1)
- Auxiliary space complexity: O(1)

## Solution

See [`Fourdigit.java`](./Fourdigit.java) for the Java implementation.