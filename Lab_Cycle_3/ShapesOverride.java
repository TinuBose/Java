import java.util.Scanner;

class Shapess{
    Scanner sn=new Scanner(System.in);
    void area(){
        System.out.println("Area of shapes");
    }
}
class Rectangles extends Shapess{
    int length,breadth;
    Rectangles(){
        System.out.print("\nEnter length and breadth  : ");
        length=sn.nextInt();
        breadth=sn.nextInt();

    }
    @Override
    void area(){
        System.out.print("\nArea of Rectangle : "+(length*breadth));
    }
}
class Circles extends Shapess{
    double radius;
    Circles(){
        System.out.print("\nEnter the Radius : ");
        radius=sn.nextDouble();
    }
    @Override
    void area(){
        System.out.print("\nArea of Circle : "+(3.14*radius*radius));
    }
}
class Squares extends Shapess{
    int side;
    Squares(){
        System.out.print("\nEnter the side : ");
        side=sn.nextInt();
    }
    @Override
    void area(){
        System.out.print("\nArea of the Square : "+side*side);
    }
}


public class ShapesOverride {
    public static void main(String args[]){
        Rectangles re=new Rectangles();
        Circles ci=new Circles();
        Squares sq=new Squares();
        re.area();
        ci.area();
        sq.area();
    }
    
}
