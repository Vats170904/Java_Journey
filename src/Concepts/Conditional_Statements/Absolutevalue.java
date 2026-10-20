package Concepts.Conditional_Statements;

import java.util.Scanner;

public class Absolutevalue {
    public static void main(String[]args){
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter an Integar");
        int numbz = sb.nextInt();

        if (numbz<0) System.out.println(-numbz);
        else System.out.println(numbz);

        // OR WE CAN DO ONE MORE THING

        if(numbz<0) numbz = -numbz;
        System.out.println(numbz);
    }
}
