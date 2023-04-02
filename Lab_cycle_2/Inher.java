class employee {
    int emp_id, salary;
    String name, address;

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
        System.out.print("\nid : " + emp_id + "\nname : " + name + "\ndepartment : " + dept + "\nsub : " + sub
                + "\nsalary : " + salary + "\naddress : " + address + "\n");
    }

}

public class Inher {
    public static void main(String args[]) {
        teacher arr_obj[] = new teacher[2];
        arr_obj[0] = new teacher("cs", "java", 111, 50000, "thomas shelby", "london");
        arr_obj[1] = new teacher("science", "chemistry", 222, 50000, "Walter white", "usa");
        arr_obj[0].display();
        System.out.println("\n####################################");
        arr_obj[1].display();

    }
}
