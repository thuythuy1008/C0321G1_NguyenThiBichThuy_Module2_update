package bai7_abstract_class_va_interface.bai_tap.bai_tap_1_Interface_Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius();
    }

    @Override
    public void resize1(double percent) {
        this.setRadius(this.getRadius() * Math.sqrt(1 + percent / 100));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle);

        circle.resize1(10);
        System.out.println("After resizing: " + circle);
    }


}
