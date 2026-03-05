import java.util.Scanner;

class Publisher {
    String pname;

    void readPublisher(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        pname = sc.nextLine();
    }

    void displayPublisher() {
        System.out.println("Publisher: " + pname);
    }
}

class Book extends Publisher {
    int bookId;
    String title;
    double price;

    void readBook(Scanner sc) {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();
        sc.nextLine();

        readPublisher(sc);
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        displayPublisher();
    }
}

class Literature extends Book {
    void displayLiterature() {
        System.out.println("\nCategory: Literature");
        displayBook();
    }
}

class Fiction extends Book {
    void displayFiction() {
        System.out.println("\nCategory: Fiction");
        displayBook();
    }
}

public class BookCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Literature l = new Literature();
        Fiction f = new Fiction();

        System.out.println("Enter Literature Book Details");
        l.readBook(sc);

        System.out.println("\nEnter Fiction Book Details");
        f.readBook(sc);

        System.out.println("\n--- Book Details ---");
        l.displayLiterature();
        f.displayFiction();

        sc.close();
    }
}