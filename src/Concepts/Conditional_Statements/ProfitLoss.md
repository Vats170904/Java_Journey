# Exercise: Calculate Profit or Loss

## Problem Statement

Write a Java program that takes the cost price and selling price of a product as input and determines whether the transaction results in a profit, a loss, or neither.

- **Cost Price (CP):** The price at which a product is purchased.
- **Selling Price (SP):** The price at which a product is sold.
- **Profit:** Occurs when the selling price is greater than the cost price.
- **Loss:** Occurs when the cost price is greater than the selling price.
- **No Profit, No Loss:** Occurs when both prices are equal.

## Requirements

1. Read the cost price using `Scanner` and `nextDouble()`.
2. Read the selling price using `Scanner` and `nextDouble()`.
3. If the selling price is greater than the cost price, calculate the profit.
4. If the cost price is greater than the selling price, calculate the loss.
5. If both prices are equal, print `"No Profit no Loss"`.

## Sample Input and Output

**Example 1: Profit**

Input:
```text
Enter the Cost Price
100.0
Enter the Selling Price:
150.0
```

Output:
```text
Profit by 50.0
```

**Example 2: Loss**

Input:
```text
Enter the Cost Price
200.0
Enter the Selling Price:
150.0
```

Output:
```text
Loss by 50.0
```

**Example 3: No Profit, No Loss**

Input:
```text
Enter the Cost Price
100.0
Enter the Selling Price:
100.0
```

Output:
```text
No Profit no Loss
```

## Concepts Practised

- `Scanner` for user input
- `double` data type
- Arithmetic subtraction
- Relational operators (`>` )
- `if-else if-else` conditional statements

## Learning Objective

Understand how to compare two numerical values and use conditional statements to calculate profit or loss.

## Complexity Analysis

- **Time Complexity:** O(1)
- **Space Complexity:** O(1)

## Solution

See [`ProfitLoss.java`](./ProfitLoss.java) for the Java implementation.