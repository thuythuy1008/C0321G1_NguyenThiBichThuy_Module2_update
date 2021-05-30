package bai6_ke_thua.bai_tap.bai_tap_1_CircleVaCylinder;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1() {

    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "A Circle with color of "
                + getColor()
                + ", Radius is: "
                + getRadius()
                + " and Area is: "
                + getArea();
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1(3, "Pink");
        System.out.println(circle);
    }
}
