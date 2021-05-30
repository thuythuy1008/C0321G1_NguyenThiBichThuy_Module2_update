package bai7_abstract_class_va_interface.bai_tap.bai_tap_1_Interface_Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {

        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();
    }

    @Override
    public void resize1(double percent) {
        this.setSide(this.getSide() * Math.sqrt(1 + percent / 100));
    }

    public static void main(String[] args) {
        Square square = new Square(2.3);
        System.out.println(square);

        square.resize1(10);
        System.out.println("After resizing: " + square);
    }
}
