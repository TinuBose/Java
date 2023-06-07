import java.util.Scanner;

class shape {
    
    Scanner s = new Scanner(System.in);

    void area(int l, int b) {
       
        System.out.print("\nArea of rectangle = " + l * b);

    }

    void area(int r) {
       
        System.out.print("\nArea of circle = " + 3.1 * r * r);

    }

    void area(double a) {
       
        System.out.print("\nArea of square = " + a*a);

    }
}

public class shapes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int choice,l, b, r;
        double a;
        shape sh = new shape();
        do{
        System.out.print("\n1.Rectangale\n2.Circle\n3.Square\n4.exit\nEnter choice : ");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter length : ");
                l = s.nextInt();
                System.out.print("\nEnter breadth : ");
                b = s.nextInt();
                sh.area(l, b);
                break;
            case 2:
                System.out.print("\nEnter radius : ");
                r = s.nextInt();
                sh.area(r);
                break;
            case 3:
                System.out.print("\nEnter side : ");
                a = s.nextInt();
                sh.area(a);
                break;
            case 4:
                System.out.println("exiting.....");
                break;
            default:
                System.out.println("enter a valid choice");
        }
    }while(choice!=4);

    }
}
