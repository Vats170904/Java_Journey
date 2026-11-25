package Concepts.Patterns;
import java.util.Scanner;

public class pat2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rw = sc.nextInt();
         for(int i = 1; i <= rw; i ++){
            for(int j =1; j<= rw; j++){
                System.out.print((char)(j+64) +" ");  //65 jo hai ASCII mai A ki Value hai 90 Capital Z ki
            }                                         // 97 jo hai small a ki value hai to 122 small z ki
            System.out.println();
        }
    }
}

