package Concepts.Conditional_Statements;

import java.util.Scanner;

public class Trianglesidecheck {
    public static void main(String[]argns){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side : ");
        int side1 = sc.nextInt();

        System.out.println("Enter the Second side : ");
        int side2 = sc.nextInt();

        System.out.println("Enter the Thirsd side : ");
        int side3 = sc.nextInt();

        if (side1+side2>side3 && side2+side3>side1 && side1+side3>side2) System.out.println("The given sides forms a Triangle");
        else System.out.println("The given sides does not form a Triangle");
    }
    
}
