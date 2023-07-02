import java.util.Scanner;

class Publisher {
    String pub_name;

    Publisher(String pub_name) {
        this.pub_name = pub_name;
    }
}

class Book extends Publisher {
    String book_name;
    int book_price;

    Book(String book_name, int book_price, String pub_name) {
        super(pub_name);
        this.book_name = book_name;
        this.book_price = book_price;
    }
}

class Literature extends Book {
    String lit_category;

    Literature(String lit_category, String pub_name, String book_name, int book_price) {
        super(book_name, book_price, pub_name);
        this.lit_category = lit_category;
    }
}

class Fiction extends Literature {
    String fic_author;

    Fiction(String lit_category, String pub_name, String book_name, int book_price, String fic_author) {
        super(lit_category, pub_name, book_name, book_price);
        this.fic_author = fic_author;
    }
}

class ShowDetails extends Fiction {
    ShowDetails(String lit_category, String pub_name, String book_name, int book_price, String fic_author) {
        super(lit_category, pub_name, book_name, book_price, fic_author);
    }

    void display() {
        System.out.println("\nPublisher: " + pub_name);
        System.out.println("Book: " + book_name);
        System.out.println("Category: " + lit_category);
        System.out.println("Author: " + fic_author);
        System.out.println("Price: " + book_price);
    }
}

public class Books {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        String publisher, book, category, author;
        int price;
        int num;

        System.out.print("How many books: ");
        num = sn.nextInt();
        sn.nextLine();  // Consume the newline character

        ShowDetails arr_obj[] = new ShowDetails[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter " + (i + 1) + " Book Details\n____________________________\n\n");
            System.out.print("Enter Publisher Name: ");
            publisher = sn.nextLine();
            System.out.print("Enter Book Name: ");
            book = sn.nextLine();
            System.out.print("Enter Category Name: ");
            category = sn.nextLine();
            System.out.print("Enter Author Name: ");
            author = sn.nextLine();
            System.out.print("Enter Price: ");
            price = sn.nextInt();
            sn.nextLine();  // Consume the newline character

            arr_obj[i] = new ShowDetails(category, publisher, book, price, author);
        }

        System.out.println("\nBook Details\n____________________________\n\n");

        for (int i = 0; i < num; i++) {
            System.out.println("Book " + (i + 1) + "\n___________________");
            arr_obj[i].display();
        }
    }
}
