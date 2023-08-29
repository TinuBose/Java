import java.util.*;

public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to perform the Arithmetic operations: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c;
        do {
            System.out.println("Enter the choice\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("The sum of " + a + " and " + b + " is " + add(a, b));
                    break;
                case 2:
                    System.out.println("The difference of " + a + " and " + b + " is " + subtract(a, b));
                    break;
                case 3:
                    System.out.println("The product of " + a + " and " + b + " is " + multiply(a, b));
                    break;
                case 4:
                    System.out.println("The quotient of " + a + " and " + b + " is " + divide(a, b));
                    break;
                case 5:
                    System.out.println("Exiting...!!!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (c != 0);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}

