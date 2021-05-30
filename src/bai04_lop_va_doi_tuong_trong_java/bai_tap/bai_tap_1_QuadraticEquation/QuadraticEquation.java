package bai4_lop_va_doi_tuong_trong_java.bai_tap.bai_tap_1_QuadraticEquation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;
    double r1;
    double r2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = (Math.pow(this.b, 2) - (4 * this.a * this.c));
    }

    public double getRoot1() {
        return r1 = (-this.b + Math.pow(delta, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return r2 = (-this.b - Math.pow(delta, 0.5)) / (2 * this.a);
    }

    public void display() {
        if (this.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + this.getRoot1() + " and" + this.getRoot2());
        } else if (this.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + this.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
