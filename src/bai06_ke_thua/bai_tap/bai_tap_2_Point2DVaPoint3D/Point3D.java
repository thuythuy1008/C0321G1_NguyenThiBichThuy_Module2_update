package bai6_ke_thua.bai_tap.bai_tap_2_Point2DVaPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        getX();
        getY();
        this.z = z;

    }

    public float[] getXYZ() {
        float[] arr1 = {getX(), getY(), this.z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D with z of "
                + getZ()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        System.out.println(" Array: " + Arrays.toString(point3D.getXYZ()));
        Point3D point3D1 = new Point3D(3.0f, 6.0f, 2.0f);
        System.out.println(point3D1);
        System.out.print(" Array: " + Arrays.toString(point3D1.getXYZ()));
    }
}
