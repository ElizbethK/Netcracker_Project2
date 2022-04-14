
package com.netcracker.homeworks.project2.chapter2;

//---------- ch. 2, num. 9-----------//

/*
Implement a class Car that models a car traveling along the x-axis, consuming
        gas as it moves. Provide methods to drive by a given number of
        miles, to add a given number of gallons to the gas tank, and to get the
        current distance from the origin and fuel level. Specify the fuel efficiency
        (in miles/gallons) in the constructor. Should this be an immutable class?
*/


public class Car {
    private double distance;
    private double fuelEfficiency;
    private double fuelLevel;   //gallons


    public Car(double distance, double fuelEfficiency, double fuelLevel) {
        this.distance = distance;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = fuelLevel;
    }

    public Car(double fuelEfficiency, double fuelLevel) {
        this.distance = 0;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = fuelLevel;
    }

    public void Drive(double miles) {
        this.distance = this.distance + miles;
        fuelLevel = Math.max(0, fuelLevel - miles / fuelEfficiency);

    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void addFuelLevel(double gallons) {
        this.fuelLevel = this.fuelLevel + gallons;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return"Car{" +
                "distance=" + distance +
                ", fuelLevel=" + fuelLevel +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';

    }
}
