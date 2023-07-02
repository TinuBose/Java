import java.util.Scanner;

class Publisher{
    String pub_name;
    Publisher(String pub_name){
        this.pub_name=pub_name;
    }

}

class Book extends Publisher{
    String book_name;
    int book_price;
    Book(String book_name,int book_price,String pub_name){
        super(pub_name);
        this.book_name=book_name;
        this.book_price=book_price;
    }

}

class Literature extends Book{
    String lit_catogary;
    Literature(String lit_catogary,String pub_name,String book_name,int book_price){
        super(book_name, book_price, pub_name);
        this.lit_catogary=lit_catogary;
    }
}

class Fiction extends Literature{
    String fic_author;
    Fiction(String lit_catogary,String pub_name,String book_name,int book_price,String fic_author){
        super(lit_catogary, pub_name, book_name, book_price);
        this.fic_author=fic_author;
        

    }

}

class ShowDetails extends Fiction{
    ShowDetails(String lit_catogary,String pub_name,String book_name,int book_price,String fic_author){
        super(lit_catogary, pub_name, book_name, book_price, fic_author);
    }
    void display(){
        System.out.println("Publisher : "+pub_name);
        System.out.println("Book : "+book_name);
        System.out.println("Catogary : "+lit_catogary);
        System.out.println("Author : "+fic_author);
        System.out.println("Price : "+book_price);
    }

} 

public class Books{
    public static void main(String args[]){
        Scanner sn =new Scanner(System.in);
     
        String publisher,book,catogary,author;
        int price; 

        System.out.println("Enter Book Details\n____________________________\n\n");
        System.out.print("\nEnter Publisher Name : ");
        publisher=sn.nextLine();
        System.out.print("\nEnter Book Name : ");
        book=sn.nextLine();
        System.out.print("\nEnter Catogary Name : ");
        catogary=sn.nextLine();
        System.out.print("\nEnter Author Name : ");
        author=sn.nextLine();
        System.out.print("\nEnter Price : ");
        price=sn.nextInt();


        ShowDetails obj=new ShowDetails(catogary, publisher, book, price, author);

        System.out.println("\n\nBook Details");
        obj.display();


    }
}