package Lab_Cycle_4.Arithmetic;

interface Mul{
    void product(float a,float b);
}
public class Multiplication implements Mul{
    public void product(float a,float b){
        System.out.print("quotient of "+a+" and "+b+" is "+(a*b));
    }
}