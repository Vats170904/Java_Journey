package Concepts.Patterns;

import java.util.Scanner;

public class pat12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rw = sc.nextInt();
        for(int i = 1; i<= rw; i++){
            for (int j =1; j<=i;j++){
                if (i%2!=0){
                    System.out.print(j+ " " );
                } else {
                    System.out.print((char)(j+64)+ " " );
                }
            }
            System.out.println();
        }

    }
    
}
