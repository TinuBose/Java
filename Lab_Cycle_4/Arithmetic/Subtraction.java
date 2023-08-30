package Lab_Cycle_4.Arithmetic;

interface Sub{
    void remaining(float a,float b);
}
public class Subtraction implements Sub{
    public void remaining(float a,float b){
        System.out.print("quotient of "+a+" and "+b+" is "+(a-b));
    }
}