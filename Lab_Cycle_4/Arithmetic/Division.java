package Lab_Cycle_4.Arithmetic;

interface Div{
    void quotient(float a,float b);
}
public class Division implements Div{
    public void quotient(float a,float b){
        System.out.print("quotient of "+a+" and "+b+" is "+(a/b));
    }
}