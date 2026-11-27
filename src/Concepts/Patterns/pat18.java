package Concepts.Patterns;
import java.util.Scanner;
public class pat18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rw = sc.nextInt();
        int mid = (rw+1)/2;

        if(rw%2!=0){
            for(int i = 1; i<= rw;i++){
                for (int j = 1; j<=rw; j++){
                    if(i ==mid || j == mid){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}