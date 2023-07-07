import java.util.Scanner;
interface shapes_{
    Scanner sn=new Scanner(System.in);
    void area();
    void perimeter();
}
class Rectangle11 implements shapes_{
    int l, b;
    Rectangle11(){
        System.out.print("\nEnter length and breadth : ");
        l=sn.nextInt();
        b=sn.nextInt();
    }
    public void area(){
        System.out.print("Area of Rectangle : "+(l*b)+"\n");
    }
    public void perimeter(){
        System.out.print("\nPerimeter of Rectangle : "+(2*(l+b))+"\n\n");
    }
}
class Circle11 implements shapes_{
    double r;
    Circle11(){
        System.out.print("\nEnter radius : ");
        r=sn.nextDouble();
    }
    public void area(){
        System.out.print("Area of circle : "+(3.14*r*r));
    }
    public void perimeter(){
        System.out.print("\nPerimeter of circle : "+(2*3.14*r)+"\n\n");
    }
}


public class ShapeInterface {
    public static void main(String args[]){
        Rectangle11 re=new Rectangle11();
        Circle11 ci=new Circle11();
        System.out.println("\n\n----------Rectangle-----------\n");
        re.area();
        re.perimeter();
        System.out.println("------------Circle-------------\n");
        ci.area();
        ci.perimeter();
    }
}
