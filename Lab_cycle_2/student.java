import java.util.Scanner;

class Mark {
    int m;
    int[] a;
    int sum = 0;
    float per = 0;
    Scanner s = new Scanner(System.in);

    Mark() {
        System.out.print("Enter the number of subjects: ");
        m = s.nextInt();
        a = new int[m];
    }

    void operation() {
        System.out.println("\nEnter marks of " + m + " subjects out of 100:");
        for (int i = 0; i < m; i++) {
            a[i] = s.nextInt();
            if (a[i] > 100 || a[i] < 0) {
                System.out.print("Enter correct mark for subject " + (i + 1) + ": ");
                a[i] = s.nextInt();
            }
            sum = sum + a[i];
        }

        System.out.println("\nTotal marks obtained: " + sum);
        per = (float) sum / (m * 100) * 100;
        System.out.println("Percentage: " + per + "%");
    }
}

public class student {
    public static void main(String args[]) {
        Mark m = new Mark();
        m.operation();
    }
}
