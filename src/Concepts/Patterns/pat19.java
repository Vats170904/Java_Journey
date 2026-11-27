package Concepts.Patterns;
import java.util.Scanner;

public class pat19 {
    public static void main(String[]args){
        System.out.print("Enter an odd number : ");
        Scanner sc= new Scanner(System.in);
        int rw = sc.nextInt();
        int a = 1;
        for(int i = 1 ; i<=rw;i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
    
}
