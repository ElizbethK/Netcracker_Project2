package com.netcracker.homeworks.project2.chapter2;

///////// ch. 2, num. 5\\\\\\\\\\\
/*
Implement an immutable class Point that describes a point in the plane.
        Provide a constructor to set it to a specific point, a no-arg constructor to
        set it to the origin, and methods getX, getY, translate, and scale. The translate
        method moves the point by a given amount in x- and y-direction. The
        scale method scales both coordinates by a given factor. Implement these
        methods so that they return new points with the results. For example,
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        should set p to a point with coordinates (2, 3.5).*/

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x1, double y1) {
        return new Point(getX() + x1, getY() + y1);
    }

    public Point scale(double s) {
        return new Point(getX() * s, getY() * s);
    }
}












