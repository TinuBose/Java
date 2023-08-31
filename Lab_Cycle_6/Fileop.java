package Lab_Cycle_6;
import java.util.Scanner;
import java.io.*;

class CreateFile {
    public void create(String name) {
        File f = new File(name);
        try {
            boolean status = f.createNewFile();
            if (status) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: ");
        }
    }
}
class writefile{
    String msg;
    public void write(String message,String name){
        this.msg=message;
        try {
            FileWriter fw=new FileWriter(name);
            fw.write(message);
            System.out.print("\nWritten to file\n");
            fw.close();
        } catch (Exception e) {
            System.out.print("\nAn error occured");
        }
    }
}
class Readfile{
    char data[]=new char[50];
    public void read(String name){
        try {
            FileReader fr=new FileReader(name);
            fr.read(data);
            System.out.print(data);
            fr.close();
        } catch (Exception e) {
            System.out.print("\nAn error occured");
        }
    }
}
class Delfile{
    public void delete(String name){
        File f = new File(name);
        try {
            if(f.delete()){
                System.out.print("\ndeleted "+name);
            }else{
                System.out.print("\nFile not exist");
            }
        } catch (Exception e) {
            System.out.print("\nError deleting file");
        }
    }
}

public class Fileop {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String name;
        String message;
        int choice;
        CreateFile fileCreator = new CreateFile();
        writefile filewriter = new writefile();
        Readfile rf=new Readfile();
        Delfile del=new Delfile();
        System.out.print("\nEnter name of the file : ");
        name=sn.nextLine();
        fileCreator.create(name);
        System.out.print("\nEnter content to write in "+name+"\n");
        message=sn.nextLine();
        filewriter.write(message, name);
        System.out.print("content of file "+name+" is \n");
        rf.read(name);
        System.out.print("\nenter 1 to delete file or otheres to cancel : ");
        choice=sn.nextInt();
        if (choice == 1){
            del.delete(name);
            System.out.print("\nfile deleted");
        }
        


    }
}