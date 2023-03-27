import java.util.Scanner;

class mark {
    int m;
    int a[];
    int sum = 0;
    float per = 0;
    Scanner s = new Scanner(System.in);

    mark() {
        System.out.print("enter the number of subjects : ");
        m = s.nextInt();
        a = new int[m];
    }

    void operation() {
        System.out.println("\nenter mark of " + m + " subjects out of 100 :");
        for (int i = 0; i < m; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.print("\ntotal marks obtained : " + sum);
        per = (sum / m * 100) / 100;
        System.out.print("\npercentage : " + per + "%");
    }

}

public class student {
    public static void main(String args[]) {
        mark m = new mark();
        m.operation();
    }

}
