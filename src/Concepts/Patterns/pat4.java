package Concepts.Patterns;

import java.util.Scanner;

public class pat4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rw = sc.nextInt();
         for(int i = 1; i <= rw; i ++){
            for(int j =1; j<= rw; j++){
                System.out.print(i+ " ");  
            }
            System.out.println();
        }

    }
    
}
