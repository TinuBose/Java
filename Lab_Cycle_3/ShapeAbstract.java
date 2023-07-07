import java.util.Scanner;
abstract class shape__{
    final double pi=3.14;
    Scanner sn=new Scanner(System.in);
    abstract void findArea();

}
class Rectangle__ extends shape__{
    int l,b;
    Rectangle__(){
        System.out.print("Enter length and breadth : ");
        l=sn.nextInt();
        b=sn.nextInt();
    }
    void findArea(){
        System.out.print("\nArea of Rectangle : "+(l*b));
    }
}
class Circle__ extends shape__{
    double r;
    Circle__(){
        System.out.print("Enter radius : ");
        r=sn.nextDouble();
    }
    void findArea(){
        System.out.print("\nArea of Circle : "+(pi*r*r));
    }
}
class Square__ extends shape__{
    int a;
    Square__(){
        System.out.print("Enter side : ");
        a=sn.nextInt();
    }
    void findArea(){
        System.out.print("\nArea of the Square : "+(a*a)+"\n\n");
    }
}

public class ShapeAbstract {
    public static void main(String args[]){
        System.out.println("Area of Shapes");
        Rectangle__ re=new Rectangle__();
        Circle__ ci=new Circle__();
        Square__ sq=new Square__();
        System.out.println("\n_____________RECTANGLE______________");
        re.findArea();
        System.out.println("\n\n_____________CIRCLE______________");
        ci.findArea();
        System.out.println("\n\n_____________SQUARE______________");
        sq.findArea();
    }   
}
