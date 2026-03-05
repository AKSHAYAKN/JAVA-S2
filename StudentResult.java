import java.util.Scanner;

class Student {
    int roll;
    int marks;

    void readStudent(Scanner sc) {
        System.out.print("Enter Roll Number:");
        roll = sc.nextInt();

        System.out.print("Enter Academic Marks:");
        marks = sc.nextInt();
    }
}

class Sports {
    int score;

    void readSports(Scanner sc) {
        System.out.print("Enter Sports Score:");
        score = sc.nextInt();
    }
}

class Result extends Student {
    Sports sp = new Sports();

    void display() {
        System.out.println("\n --- Result ---");
        System.out.println("Roll Number:" +roll);
        System.out.println("Academic Marks:" + marks);
        System.out.println("Sports Score:" + sp.score);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.readStudent(sc);
        r.sp.readSports(sc);

        r.display();

        sc.close();
    }
           
}
