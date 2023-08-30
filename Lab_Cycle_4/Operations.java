package Lab_Cycle_4;
import Lab_Cycle_4.Arithmetic.*;
import java.util.Scanner;

public class Operations {
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        Addition add=new Addition();
        Subtraction sub=new Subtraction();
        Multiplication mul=new Multiplication();
        Division div=new Division();
        System.out.print("Enter 2 numbers : ");
        int a=sn.nextInt();
        int b=sn.nextInt();
        int choice;
        do{
            System.out.print("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            System.out.print("\nEnter your choice : ");
            choice=sn.nextInt();
            switch(choice){
                case 1 : add.sum(a, b); 
                break;
                case 2 : sub.remaining(a, b);
                break;
                case 3 : mul.product(a, b);
                break;
                case 4 : div.quotient(a, b);
                break;
                case 5 : System.out.print("\nExiting.....");
                break;
                default : System.out.print("\nEnter a valid option");
            }
        }while(choice!=5);        
    }
}
