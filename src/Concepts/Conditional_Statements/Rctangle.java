package Concepts.Conditional_Statements;

import java.util.Scanner;

public class Rctangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length : ");
        double l = sc.nextDouble();

        System.out.println("Enter the Breadth : ");
        double b = sc.nextDouble();

        double Per= 2*(l+b);
        double ar = l*b;
        if (ar>Per) System.out.println("Area is Greater than Perimeter");
        else if (Per>ar) System.out.println("Perimeter is Greater than Area");
        else System.out.println("Area and Perimeter are Equal");


    }
    
}
