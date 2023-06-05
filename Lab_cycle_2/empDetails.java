import java.util.Scanner;

class shape {
    int l, b, r, a;
    Scanner s = new Scanner(System.in);

    void area(int l, int b) {
        System.out.print("Enter length : ");
        l = s.nextInt();
        System.out.print("\nEnter breadth : ");
        b = s.nextInt();
        System.out.print("\nArea of rectangle = " + l * b+"\n");

    }

    void area(int r) {
        System.out.print("\nEnter radius : ");
        r = s.nextInt();
        System.out.print("\nArea of circle = " + 3.1 * r * r+"\n");

    }

    void area(double a) {
        System.out.print("\nEnter side : ");
        a = s.nextDouble();
        System.out.print("\nArea of square = " + 3.1 * r * r+"\n");

    }
}

public class shapes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int choice;
        shape sh = new shape();
	do{
        System.out.print("1.Rectangale\n2.Circle\n3.Square\n4.Exit\nEnter choice : ");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                sh.area(0, 0);
                break;
            case 2:
                sh.area(0);
                break;
            case 3:
                sh.area(0.0);
	    case 4:
		System.out.println("exiting.....");
	        break;
	    default:
		System.out.println("error");
	        
        }
}while(choice!=4);

    }
}
