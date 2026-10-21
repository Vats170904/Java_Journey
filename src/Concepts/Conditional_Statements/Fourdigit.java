package Concepts.Conditional_Statements;
import java.util.Scanner;


public class Fourdigit {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num> 999 && num< 10000) System.out.println(num + " is a Four digit Number ");
        else System.out.println(num + " is not a Four digit number ");

        if (num%10000)


    }
    
}
