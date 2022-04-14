package com.netcracker.homeworks.project1;

import java.util.Objects;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int[] getXY() {
        int[] xy = {x, y};
        return xy;

    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    //1
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x - this.x, 2) - Math.pow(y - this.y, 2) );
    }

    //2
    public double distance(MyPoint point){
        return Math.sqrt(Math.pow((point.x - this.x), 2) - Math.pow((point.y - this.y), 2) );
    }

    //3
    public double distance(){
        return Math.sqrt((Math.pow(x - 0, 2) - Math.pow(y - 0, 2) ));
    }


    @Override
    public String toString() {
        return "(" + getX()+
                "," + getY() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint point = (MyPoint) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
