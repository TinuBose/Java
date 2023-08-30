package Lab_Cycle_4;

import java.util.Scanner;

class exhandle{
    String user="admin";
    String pass="123";
    void validate(String username,String password){
        
          if(!username.equals(user) || !password.equals(pass)){
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.print("invalid...");
            }
          }else{
            System.out.print("Logged in...");
          }
}
}
public class validation {
    public static void main(String ars[]){
        Scanner sn=new Scanner(System.in);
        System.out.print("\nEnter username : ");
        String username=sn.nextLine();
        System.out.print("\nEnter password : ");
        String password=sn.nextLine();
        exhandle ex=new exhandle();
        ex.validate(username, password);
        
    }
}
