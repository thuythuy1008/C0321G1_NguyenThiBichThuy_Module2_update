package bai6_ke_thua.bai_tap.bai_tap_4_ShapeVaTriangle;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("blue", false);
        System.out.println(shape1);
    }
}

