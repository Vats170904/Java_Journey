package Concepts.Conditional_Statements;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Cost Price ");
        double cp = sc.nextDouble(); //CostPrice

        System.out.println("Enter the Selling Price : ");
        double sp = sc.nextDouble(); // SellingPrice

        if (sp>cp) System.out.println("Profit by " + (sp-cp));

        else if (cp>sp) System.out.println("Loss by " + (cp-sp));

        else System.out.println("No Profit no Loss");

    }
    
}

