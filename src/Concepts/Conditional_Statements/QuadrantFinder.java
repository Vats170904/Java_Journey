package Concepts.Conditional_Statements;

import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X coordinate : ");
        int x= sc.nextInt();

        System.out.println("Enter the Y Coordinate : ");
        int y = sc.nextInt();

        if (x == 0&& y ==0) System.out.println("The Point is at Origin.");
        else if (x>0&&y>0) System.out.println("The Point is in First Quadrant");
        else if (x<0&&y>0) System.out.println("The Point lies in Second Quadrant");
        else if (x<0&&y<0) System.out.println("The Point lies in Third Quadrant");
        else if (x>0&&y<0) System.out.println("The Point lies in Fourth Quadrant");
        else if (x ==0 && y!=0)System.out.println("The point lies on Y axis");
        else if(x!=0 && y == 0)System.out.println("The Point lies on X axis");
       }
    
}
