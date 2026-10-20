package Concepts.Conditional_Statements;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
        

        // Check if the number is divisible by 5

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter a Number : ");

        int num1 = sc1.nextInt();

        if (num1%5 == 0) System.out.println("Divisible by 5");
        
        else System.out.println("Not");

    }
    
}
