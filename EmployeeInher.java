import java.util.Scanner;

class employee {
    int emp_id, salary;
    String name, address;
    Scanner sn = new Scanner(System.in);

    employee(int emp_id, int salary, String name, String address) {
        this.emp_id = emp_id;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

}

class teacher extends employee {
    String dept, sub;

    teacher(String dept, String sub, int emp_id, int salary, String name, String address) {
        super(emp_id, salary, name, address);
        this.dept = dept;
        this.sub = sub;
    }
    void display() {
        System.out.print("\nID : " + emp_id + "\nName : " + name + "\nDepartment : " + dept + "\nSub : " + sub
                + "\nSalary : " + salary + "\nAddress : " + address + "\n");
    }

}

public class EmployeeInher {
    public static void main(String args[]) {
        int num,emp_id,salary;
        String name,address,dept,sub;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter number of Teachers : ");
        num = sn.nextInt();
        teacher arr_obj[] = new teacher[num];
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Teacher " + (i + 1) + "\n_______");
            System.out.print("\nEnter employee ID : ");
        emp_id = sn.nextInt();
        System.out.print("Enter employee Name : ");
        name = sn.next();
        System.out.print("Enter employee Salary : ");
        salary = sn.nextInt();
        sn.nextLine();
        System.out.print("Enter employee Address : ");
        address = sn.nextLine();
        System.out.print("Enter employee Deprtment : ");
        dept = sn.next();
        System.out.print("Enter employee Subject : ");
        sub = sn.next();
            arr_obj[i] = new teacher(dept, sub, emp_id, salary, name, address);
           
        }
        for (int i = 0; i < num; i++) {
            System.out.println("\nTeacher " + (i + 1) + "\n_______");
            arr_obj[i].display();
        }

    }
}
