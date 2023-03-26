
class cpu {
    double price;
    String name;

    cpu(double p, String nam) {
        price = p;
        name = nam;
    }

    class processor {
        int no_of_cores;
        String manufacturer;

        processor(int cores, String man) {
            no_of_cores = cores;
            manufacturer = man;
        }

    }

    static class ram {

        String memmory;
        String manufacturer;

        ram(String mem, String man) {
            memmory = mem;
            manufacturer = man;
        }
    }
}

public class cpuInfo {
    public static void main(String args[]) {
        cpu c = new cpu(15000, "intel i7");
        cpu.processor p = c.new processor(8, "intel");
        cpu.ram r = new cpu.ram("8gb", "crucial");
        System.out.println("Processor name = " + c.name + "\nProcessor Price : " + c.price);
        System.out.println("Processor cores = " + p.no_of_cores + "\nProcessor Manufaturer name : " + p.manufacturer);
        System.out.println("Ram capacity : " + r.memmory + "\nRam Manufaturer : " + r.manufacturer);

    }
}
