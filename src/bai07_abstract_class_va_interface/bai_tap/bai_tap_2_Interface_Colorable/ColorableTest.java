package bai7_abstract_class_va_interface.bai_tap.bai_tap_2_Interface_Colorable;


import java.lang.reflect.Array;

public class ColorableTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3.0, 4.0, "black", false);
        Square square = new Square(3.0, "blue", true);
        Square square1 = new Square(2.0, "yellow", false);
        double[] colorableTest = new double[3];

        System.out.println("Array: ");
        colorableTest[0] = rectangle.getArea();
        colorableTest[1] = square.getArea();
        colorableTest[2] = square1.getArea();
        for (double colorable : colorableTest) {
            System.out.println(colorable);
        }

        Colorable[] colorables = {rectangle, square, square1};
        for (Colorable colorable1 : colorables) {
            if (colorable1 instanceof Colorable) {
                colorable1.howToColor();
            }
        }
    }
}
