package Concepts.Patterns;
import java.util.Scanner;
public class Understanding_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rw = sc.nextInt();
        int cl = sc.nextInt();

        for (int i =1 ; i <=rw; i++){
            for (int j =1; j<=cl;j++){
               System.out.print(j + " ");
            
          
            }
            System.out.println();
        }
    }
}