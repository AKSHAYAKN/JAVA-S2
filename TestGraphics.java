import Graphics.*;

public class TestGraphics {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Triangle t = new Triangle(3, 6);
        Square s = new Square(4);
        Circle c = new Circle(3);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
        System.out.println("Square Area: " + s.area());
        System.out.println("Circle Area: " + c.area());
    }
}