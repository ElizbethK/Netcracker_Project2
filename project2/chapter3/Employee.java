package com.netcracker.homeworks.project2.chapter3;


//---------- ch. 3, num. 1, 2 -----------\\
/* ex. 1
Provide an interface Measurable with a method double getMeasure() that measures
        an object in some way. Make Employee implement Measurable. Provide
        a method double average(Measurable[] objects) that computes the average
        measure. Use it to compute the average salary of an array of employees.
   ex. 2
   Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with
the largest salary. Why do you need a cast?
*/


public class Employee implements Measurable {
   private String name;
   private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    ////////////----- ex.1 -------\\\\\\\\\\\\\

    public double calculateAvgSalary(Measurable[] objects){
        int sum = 0;
        for(int i = 0; i < objects.length; i++){
            sum += objects[i].getMeasure();
        }
        return sum / objects.length;
    }


    ////////////----- ex.2 -------\\\\\\\\\\\\\

    public Measurable largest(Measurable[] objects){
        Employee maxEmployee = (Employee)objects[0];
        for(int i = 1; i < objects.length; i++){
           if(objects[i].getMeasure() > objects[i - 1].getMeasure()){
               maxEmployee = (Employee)objects[i];
           } else{
               maxEmployee = (Employee)objects[i - 1];
           }
        } return maxEmployee;
    }

    @Override
    public String toString() {
        return name + " has the largest salary = " +
                salary;
    }
}








