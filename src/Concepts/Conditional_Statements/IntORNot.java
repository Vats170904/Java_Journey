package Concepts.Conditional_Statements;

import java.util.Scanner;

public class IntORNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A REAL Number : ");
        double num = sc.nextDouble(); // num = 3.12453
        int num1 = (int)num; // num1 = 3
        if (num-num1 == 0) System.out.println("Is an Integar");
        else System.out.println("Not an Integar");




    }
    
}
