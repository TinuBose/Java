import java.util.Scanner;
public class shapes {
    
    void area(int r1){
        double Area_val = 3.14*r1*r1;
        System.out.println("\nArea of Circle of Radius "+r1+" = "+Area_val);
    }
    void area(int a1,int b1){
        int Area_val = a1*b1;
        System.out.println("\nArea of Rectangle is with dimensions "+a1+" X "+b1+" = "+Area_val);
    }
    void area(double a1){
        double Area_val = a1*a1;
        System.out.println("\nArea of square is with dimensions "+a1+" X "+a1+" = "+Area_val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Length");
        int l = sc.nextInt();
        System.out.println("Enter the Breath");
        int b = sc.nextInt();
        System.out.println("Enter the side");
        double a = sc.nextDouble();
        System.out.println("Enter the Radius");
        int r = sc.nextInt();
        shapes obj1 = new shapes();
        obj1.area(r);
        obj1.area(l,b);
        obj1.area(a);
    }

}
