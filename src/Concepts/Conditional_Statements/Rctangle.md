# Rectangle Area vs Perimeter

## Description
This Java program calculates the area and perimeter of a rectangle based on the length and breadth entered by the user. It then compares the two values using conditional statements and displays the result.

## Concepts Used
- Java basics
- User input using `Scanner`
- `double` data type
- Arithmetic operators (`*`, `+`)
- Conditional statements (`if`, `else if`, `else`)
- Comparison operators (`>`)
  
## Formula
- **Area:** `length × breadth`
- **Perimeter:** `2 × (length + breadth)`

## Source Code
The program asks the user to enter the length and breadth of a rectangle, calculates its area and perimeter, and compares the results.

## Example Output

```text
Enter the Length:
5
Enter the Breadth:
4
Area is Greater than Perimeter
```

**Calculation:**
- Area = 5 × 4 = 20
- Perimeter = 2 × (5 + 4) = 18

Since the area value is greater than the perimeter value, the program displays the corresponding message.

## How to Run

1. Make sure the Java Development Kit (JDK) is installed.
2. Save the source code in a file named `Rctangle.java`.
3. Open a terminal in the directory containing the file.
4. Compile the program:

   ```bash
   javac Rctangle.java
   ```

5. Run the program:

   ```bash
   java Rctangle
   ```

**Note:** If your project uses the package `Concepts.Conditional_Statements`, run the commands from the appropriate source directory or compile and run it using your IDE's package configuration.

## Learning Objective
The objective of this program is to practise taking user input, performing arithmetic calculations, and using `if-else` conditional statements to compare two values.

## Future Improvements
- Validate that the length and breadth are positive.
- Display the calculated area and perimeter.
- Format the output for better readability.
