package Concepts.Conditional_Statements;

import java.util.Scanner;

public class Divisiblity{
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    
    int num = sc.nextInt();
    if ( num%5 == 0 && num%3 == 0) System.out.println(num+" is Divisible by both 5 and 3");

    //

    else if (num%3 == 0) System.out.println(num+" is Divisible by 3 ");

    else if(num %5 == 0 )System.out.println(num+" is Divisible by 5");
    else System.out.println("Not Divisible by 5 or 3");
    }
}
