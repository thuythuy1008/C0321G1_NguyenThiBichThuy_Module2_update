package bai6_ke_thua.bai_tap.bai_tap_1_CircleVaCylinder;

public class Cylinder extends Circle1 {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    private Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (height * Math.PI * getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "A Cylinder with height="
                + getHeight()
                + ", and Volume is: "
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, "Yellow", 6);
        System.out.println(cylinder);
    }
}
