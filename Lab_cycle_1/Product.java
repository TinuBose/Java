class ProductDetails {
    char pcode;
    String pname;
    int pprice;

    ProductDetails(char code, String name, int price) {
        pcode = code;
        pname = name;
        pprice = price;
    }

}

class Price {
    void priceCheck(ProductDetails p1, ProductDetails p2, ProductDetails p3) {
        if (p1.pprice < p2.pprice && p1.pprice < p3.pprice) {
            System.out.println(p1.pname + " has lowest price ");
        } else if (p2.pprice < p1.pprice && p2.pprice < p3.pprice) {
            System.out.println(p2.pname + " has lowest price ");
        } else if (p3.pprice < p1.pprice && p3.pprice < p2.pprice) {
            System.out.println(p3.pname + " has lowest price ");
        } else {
            System.out.println("products having same price");

        }
    }
}

public class Product {
    public static void main(String args[]) {
        ProductDetails p1 = new ProductDetails('A', "phone", 20000);
        ProductDetails p2 = new ProductDetails('B', "tv", 50000);
        ProductDetails p3 = new ProductDetails('C', "watch", 10000);
        Price p = new Price();
        p.priceCheck(p1, p2, p3);
    }
}
