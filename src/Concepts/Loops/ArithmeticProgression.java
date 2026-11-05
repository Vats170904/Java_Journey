package Concepts.Loops;

import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frist term of the AP ");
        int a = sc.nextInt();
        System.out.println("Enter the Common difference of the AP ");
        int d = sc.nextInt();
        System.out.println("Enter the Number of Terms of the AP");
        int c = sc.nextInt();
        int S1 = 0;
        for (int i = 0;i <c;i++){
            System.out.print(a+ " ");
            S1 += a;
            a = a+d;
            
            
        }
        System.out.println();
        System.out.println("Sum of the AP is: " + S1);

    }
    
}
