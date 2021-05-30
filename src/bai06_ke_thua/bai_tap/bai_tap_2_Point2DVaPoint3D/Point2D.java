package bai6_ke_thua.bai_tap.bai_tap_2_Point2DVaPoint3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D with x of "
                + getX()
                + ", and y: "
                + getY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        System.out.println(" Array: " + Arrays.toString(point2D.getXY()));
        Point2D point2D1 = new Point2D(4.0f, 1.0f);
        System.out.println(point2D1);
        System.out.print(" Array: " + Arrays.toString(point2D1.getXY()));
    }
}
