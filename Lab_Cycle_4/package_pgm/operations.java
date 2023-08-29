import Arithmetic.*;
import java.util.*;

public class operations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to perform the Arithmetic operations: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n;
        do {
            System.out.println("Enter the choice\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.println("Enter choice\n");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                Addition add=new Addition();
                System.out.println("The sum of " + a + " and " + b + " is " + add.addition(a, b));
                break;
            case 2:
                Subtraction sub=new Subtraction();
                System.out.println("The difference of " + a + " and " + b + " is " + sub.subtract(a, b));
                break;
            case 3:
            Multiplication mul=new Multiplication();
                System.out.println("The product of " + a + " and " + b + " is " + mul.multiply(a, b));
                break;
            case 4:
                Division div=new Division();
                System.out.println("The quotient of " + a + " and " + b + " is " + div.divide(a, b));
                break;
            case 5:
                System.out.println("Exiting...!!!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        }while(n!=5);
    }
}