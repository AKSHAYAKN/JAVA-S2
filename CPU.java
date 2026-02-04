public class CPU {
    int price;

    CPU(int price) {
        this.price = price;
    }

    class Processor {
        int noOfManufacturers;

        Processor(int n) {
            noOfManufacturers = n;
        }

        void display() {
            System.out.println("Number of processor manufacturers: " + noOfManufacturers);
        }
    }

   
    class RAM {
        int memory;

        RAM(int m) {
            memory = m;
        }

        void display() {
            System.out.println("RAM size: " + memory + "GB");
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(50000);

        CPU.Processor processor = cpu.new Processor(5);
        CPU.RAM ram = cpu.new RAM(16);

        System.out.println("CPU Price: " + cpu.price);
        processor.display();
        ram.display();
    }
}
