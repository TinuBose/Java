package Lab_Cycle_4.Arithmetic;

interface Add{
    void sum(float a,float b);
}
public class Addition implements Add{
    public void sum(float a,float b){
        System.out.print("quotient of "+a+" and "+b+" is "+(a+b));
    }
}