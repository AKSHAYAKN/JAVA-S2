import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esalary;

    void readData(Scanner sc) {

        System.out.print("Enter Employee Number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Enter a valid number.");
            sc.next();
        }
        eno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Enter a valid salary.");
            sc.next();
        }
        esalary = sc.nextDouble();
    }

    void displayData() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esalary);
    }
}

public class EmployeeArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].readData(sc);
        }

        System.out.print("\nEnter employee number to search: ");
        int searchEno = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eno == searchEno) {
                System.out.println("\nEmployee Found:");
                emp[i].displayData();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}