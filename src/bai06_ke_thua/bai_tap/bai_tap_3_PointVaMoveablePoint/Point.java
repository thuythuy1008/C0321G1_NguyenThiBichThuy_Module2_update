package bai6_ke_thua.bai_tap.bai_tap_3_PointVaMoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
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
        return "Point with x of "
                + getX()
                + ", and y: "
                + getY();
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        System.out.println(" Array: " + Arrays.toString(point.getXY()));
        Point point1 = new Point(3.0f, 5.0f);
        System.out.println(point1);
        System.out.print(" Array: " + Arrays.toString(point1.getXY()));
    }
}
