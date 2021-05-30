package bai7_abstract_class_va_interface.bai_tap.bai_tap_1_Interface_Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength();
    }

    @Override
    public void resize1(double percent) {
        this.setWidth(this.getWidth() * Math.sqrt(1 + percent / 100));
        this.setLength((this.getWidth() * Math.sqrt(1 + percent / 100)) * this.getLength() / this.getWidth());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle.resize1(10);
        System.out.println("After resizing: " + rectangle);
    }
}
