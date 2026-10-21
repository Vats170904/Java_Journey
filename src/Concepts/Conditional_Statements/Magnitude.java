package Concepts.Conditional_Statements;

import java.util.Scanner;


public class Magnitude {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num>0){
            if (num>69)System.out.println(num+" Magnitude is Greater than 69");
            else System.out.println(num+" Magnitude is less than 69");

        }
        else if (num<0){
            if (-num>69)System.out.println(" Magnitude is Greater than 69");
            else System.out.println(" Magnitude is less than 69");
        }


    }
    
}
