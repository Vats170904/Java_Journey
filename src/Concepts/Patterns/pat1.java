package Concepts.Patterns;
import java.util.Scanner;

public class pat1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int rw = sc.nextInt();
        System.out.println("Enter the Number of Columns : ");
        int cl = sc.nextInt();

        for(int i = 1;i<=rw;i++){  // Kitni lines hogi
            for(int j = 1;j<=cl;j++){ // haar line mai kitne print honge
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
