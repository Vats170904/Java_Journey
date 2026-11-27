package Concepts.Patterns;
import java.util.Scanner;
public class pat14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rw = sc.nextInt();
        for(int i =rw; i>=1 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    
}
