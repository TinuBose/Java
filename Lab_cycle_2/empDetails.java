import java.util.Scanner;

class Employee {
    Scanner sn = new Scanner(System.in);
    int e_num;
    String e_name;
    int salary;

    Employee() {
        // Default constructor
    }

    Employee(int e_num, String e_name, int salary) {
        this.e_num = e_num;
        this.e_name = e_name;
        this.salary = salary;
    }

    void setDetails() {
        System.out.print("\nEnter employee number: ");
        e_num = sn.nextInt();
        System.out.print("Enter employee name: ");
        e_name = sn.next();
        System.out.print("Enter employee salary: ");
        salary = sn.nextInt();
    }

    void display() {
        System.out.print("\nEmployee no: " + e_num + "\nEmployee name: " + e_name + "\nSalary:    "    + salary + "\n");

    }
}

public class empDetails {
    public static void main(String args[]) {
        int num;
        int search;
        int flag = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("How much Employees : ");
        num=sn.nextInt();

        Employee arr_obj[] = new Employee[num];

        for (int i = 0; i<num; i++) {
            System.out.println("\nEmployee " + (i + 1) + "\n_______");

            arr_obj[i] = new Employee();
            arr_obj[i].setDetails();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("\nEmployee " + (i + 1) + "\n_______");
            arr_obj[i].display();

        }
        System.out.print("\nEnter employee number to search: ");
        search = sn.nextInt();
        for (int i = 0; i < num; i++) {
            if (arr_obj[i].e_num == search) {
                arr_obj[i].display();
                System.out.println("\nValid");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.print("Invalid employee number!!!!");
        }
    }
}
