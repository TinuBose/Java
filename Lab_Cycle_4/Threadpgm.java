package Lab_Cycle_4;

import java.util.Scanner;

class multable extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n" + i + " * " + 5 + " = " + (i * 5));
        }
    }
}

class primeno extends Thread {
    int is_prime;

    public void run(int num) {
        for (int i = 2; i <= num; i++) {
            is_prime = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    is_prime = 0;
                    break;
                }
            }
            if (is_prime == 1) {
                System.out.print("\n" + i);
            }
        }
    }
}

public class Threadpgm {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int num;
        multable mul = new multable();
        mul.run();
        ;
        System.out.print("\nenter the number : ");
        num = sn.nextInt();
        primeno pr = new primeno();
        pr.run(num);

    }
}
