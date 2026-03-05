import java.util.Scanner;

class Area {

    // Area of Circle
    double area(double r) {
        return 3.14 * r * r;
    }

    // Area of Rectangle
    double area(double l, double b) {
        return l * b;
    }

    // Area of Triangle
    double area(int b, int h) {
        return 0.5 * b * h;
    }
}

public class AreaOverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + a.area(r));

        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + a.area(l, b));

        System.out.print("\nEnter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Area of Triangle = " + a.area(base, height));

        sc.close();
    }
}