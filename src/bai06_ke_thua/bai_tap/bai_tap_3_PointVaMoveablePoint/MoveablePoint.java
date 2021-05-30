package bai6_ke_thua.bai_tap.bai_tap_3_PointVaMoveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y) {
        getX();
        getY();
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    public MoveablePoint move() {
        this.setX(getX() + this.xSpeed);
        this.setY(getY() + this.ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint with xSpeed of "
                + getXSpeed()
                + ", and ySpeed: "
                + getYSpeed()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        System.out.println(" Array: " + Arrays.toString(moveablePoint.getSpeed()));
        MoveablePoint moveablePoint1 = new MoveablePoint(2.0f, 6.0f);
        System.out.println(moveablePoint1);
        System.out.print(" Array: " + Arrays.toString(moveablePoint1.getSpeed()));
    }
}
