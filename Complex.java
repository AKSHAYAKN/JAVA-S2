import java.util.Scanner;

public class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex no: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex no: ");
        int i1 = sc.nextInt();

        System.out.print("Enter real part of the second complex no: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex no: ");
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);

        System.out.print("Sum = ");
        sum.display();

        sc.close();
    }
}
