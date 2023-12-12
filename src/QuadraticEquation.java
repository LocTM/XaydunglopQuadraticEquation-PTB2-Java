import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public String solveEquation() {
        double delta = getDiscriminant();

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "The equation has two roots: " + root1 + " and " + root2;
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return "The equation has one root: " + root;
        } else {
            return "The equation has no roots";
        }
    }


}
