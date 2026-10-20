package Concepts.Basics;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        // Input in Java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle: ");
        double radius = sc.nextDouble();
        double area = 3.141592 * radius * radius;
        System.out.println("Area of the Circle is: " + area);

       
    System.out.print("Enter the Number ");
    double number = sc.nextDouble();
    System.out.println("Square of the Number is: " + number*number);
    

    System.out.print("Enter the first Number: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter the second Number: ");
    double num2 = sc.nextDouble();
    System.out.println("Sum of the two Numbers is: " + (num1+num2));
    System.out.println("Difference of the two Numbers is: " + (num1-num2));
    System.out.println("Product of the two Numbers is: " + (num1*num2));

}


    
}
