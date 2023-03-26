import java.util.Scanner;

class setNumbers {
    Scanner s = new Scanner(System.in);
    int real;
    int imaginary;

    setNumbers() {
        System.out.print("\nEnter real part : ");
        real = s.nextInt();
        System.out.print("\nEnter imaginary part : ");

        imaginary = s.nextInt();

    }

    void showNumbers() {
        System.out.println(real + "+" + imaginary + "i");
    }

    void addition(setNumbers n1, setNumbers n2) {
        real = n1.real + n2.real;
        imaginary = n1.imaginary + n2.imaginary;
        System.out.print("sum = " + real + "+i" + imaginary);

    }
}

class complexAddition {
    public static void main(String args[]) {
        System.out.print("Enter first complex number : ");
        setNumbers n1 = new setNumbers();
        n1.showNumbers();

        System.out.print("Enter second complex number : ");
        setNumbers n2 = new setNumbers();
        n2.showNumbers();

        n1.addition(n1, n2);

    }

}
