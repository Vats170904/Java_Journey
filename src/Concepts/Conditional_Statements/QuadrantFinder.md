# Quadrant Finder in Java

## Description
This Java program determines the position of a point in the Cartesian coordinate system based on its X and Y coordinates entered by the user.

It identifies whether the point lies in one of the four quadrants, at the origin, or on either the X-axis or Y-axis.

## Concepts Used
- Java basics
- User input using `Scanner`
- Integer data type (`int`)
- Conditional statements (`if`, `else if`)
- Logical AND operator (`&&`)
- Comparison operators (`==`, `!=`, `>`, `<`)

## How It Works
The program takes two integer inputs:
- **X-coordinate (`x`)**
- **Y-coordinate (`y`)**

It then evaluates the coordinates using conditional statements to determine the point's location.

## Conditions and Output

| Condition | Position |
|---|---|
| `x == 0 && y == 0` | Origin |
| `x > 0 && y > 0` | First Quadrant |
| `x < 0 && y > 0` | Second Quadrant |
| `x < 0 && y < 0` | Third Quadrant |
| `x > 0 && y < 0` | Fourth Quadrant |
| `x == 0 && y != 0` | Y-axis |
| `x != 0 && y == 0` | X-axis |

## Example Output

### Example 1: First Quadrant

```text
Enter the X coordinate :
3
Enter the Y Coordinate :
4
The Point is in First Quadrant
```

### Example 2: Second Quadrant

```text
Enter the X coordinate :
-3
Enter the Y Coordinate :
4
The Point lies in Second Quadrant
```

### Example 3: Origin

```text
Enter the X coordinate :
0
Enter the Y Coordinate :
0
The Point is at Origin.
```

### Example 4: X-axis

```text
Enter the X coordinate :
5
Enter the Y Coordinate :
0
The Point lies on X axis
```

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed
- A terminal or Java IDE such as Visual Studio Code

### Compile the Program
From the project root directory, run:

```bash
javac -d out src/Concepts/Conditional_Statements/QuadrantFinder.java
```

### Run the Program

```bash
java -cp out Concepts.Conditional_Statements.QuadrantFinder
```

**Note:** These commands assume your source file is located at `src/Concepts/Conditional_Statements/QuadrantFinder.java` and the package declaration is `Concepts.Conditional_Statements`.

## Learning Objective
The purpose of this program is to practise conditional logic, logical operators, and coordinate-based decision-making in Java.

## Possible Improvements
- Close the `Scanner` after taking input.
- Add input validation.
- Extend the program to handle decimal coordinates using the `double` data type.
