package Arithmetic;

public class Division implements Operation {
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return a / b;
    }
}