package com.netcracker.homeworks.project2.chapter1;


///////// ch. 1, num. 2\\\\\\\\\\
/*Write a program that reads an integer angle (which may be positive or
        negative) and normalizes it to a value between 0 and 359 degrees. Try
        it first with the % operator, then with floorMod.*/

public class Angle {
    private int angle;

    public Angle(int angle) {
        this.angle = angle;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }


    public void calculateAngle(){
        System.out.println((this.angle % 360 + 360) % 360);
        System.out.println((Math.floorMod(this.angle, 360)));
    }

}
