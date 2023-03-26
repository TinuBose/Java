import java.util.Scanner;

class setYear {
    Scanner s = new Scanner(System.in);
    int start;
    int end;

    setYear() {
        System.out.print("Enter start year : ");
        start = s.nextInt();
        System.out.print("Enter end year : ");
        end = s.nextInt();
    }

    void checkYear() {
        System.out.print("Leap years bw " + start + " and " + end + " are :");
        for (int i = start; i <= end; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + "\t");

            }
        }
    }
}

public class leapYear {
    public static void main(String args[]) {
        setYear obj = new setYear();
        obj.checkYear();

    }
}
