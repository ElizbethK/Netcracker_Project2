package com.netcracker.homeworks.project2;

import com.netcracker.homeworks.project2.chapter1.*;
import com.netcracker.homeworks.project2.chapter2.Car;
import com.netcracker.homeworks.project2.chapter2.Point;
import com.netcracker.homeworks.project2.chapter3.Employee;
import com.netcracker.homeworks.project2.chapter3.IntSequence;
import com.netcracker.homeworks.project2.chapter3.Measurable;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("---------- ch. 1, num. 2-----------");

       Angle angle = new Angle(30);
       angle.calculateAngle();

        ///////////////////////////////////////////////////////////////////////////////
        //System.out.println("---------- ch. 1, num. 6-----------");
        // in Factorial.java

        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("---------- ch. 1, num. 8-----------");
        Strings str = new Strings("Never give up");
        System.out.println("Original string: " + str.getStr());
        System.out.println("Nonempty substrings: ");
        str.getSubstr();

        /////////////////////////////////////////////////////////////////////////////////
       //System.out.println("---------- ch. 1, num. 13-----------");
        //in Lottery.java

        /////////////////////////////////////////////////////////////////////////////////
        System.out.println("---------- ch. 1, num. 14-----------");
        MSquare square = new MSquare();
        square.kindOfSquare();

        /////////////////////////////////////////////////////////////////////////////////
        System.out.println("---------- ch. 2, num. 5-----------");
        Point p = new Point(3,4).translate(1,3).scale(0.5);
        System.out.println("New coordinates: ");
        System.out.println("x = " + p.getX()+ ", y = " + p.getY());

        /////////////////////////////////////////////////////////////////////////////////
        System.out.println("---------- ch. 2, num. 9-----------");
        Car car = new Car(5,3);
        car.Drive(20);
        System.out.println(car);
        car.addFuelLevel(10);
        car.Drive(30);
        System.out.println(car);

        /////////////////////////////////////////////////////////////////////////////////
        System.out.println("---------- ch. 3, num. 1, num. 2 -----------");
        Employee employee1 = new Employee("Nick", 30);
        Employee employee2 = new Employee("Jack", 60);
        Employee employee3 = new Employee("July", 90);

        Measurable[] employees = {employee1, employee2, employee3};

        System.out.println(employee1.calculateAvgSalary(employees));
        System.out.println(employee1.largest(employees));

        /////////////////////////////////////////////////////////////////////////////////
        System.out.println("---------- ch. 3, num. 4, num. 5-----------");
        IntSequence sequence1 = IntSequence.of(1,4,6,8,4,2);
        while (sequence1.hasNext()){
            System.out.println(sequence1.next());
        }
    }
}
