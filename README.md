# Hometask2

[Project 1](https://github.com/ElizbethK/Hometasks1/blob/main/README.md)





Project 2:


        --> Horstmann_C_S_Core_Java_SE_9_for_the_Impatient_2nd_Edition_2018


[Chapter 1: FUNDAMENTAL PROGRAMMING STRUCTURES](https://github.com/ElizbethK/Hometask2/tree/main/project2/chapter1)

[ex.2:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter1/Angle.java)
Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod.


[ex.6:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter1/Factorial.java)
Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
BigInteger. Compute the factorial of 1000.



[ex.8:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter1/Strings.java)
Write a program that reads a string and prints all of its nonempty
substrings.



[ex.13:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter1/Lottery.java)
Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order.



[ex.14:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter1/MSquare.java)
Write a program that reads a two-dimensional array of integers and determines whether it is a magic square (that is, whether the sum of all
rows, all columns, and the diagonals is the same). Accept lines of input
that you break up into individual integers, and stop when the user enters
a blank line. For example, with the input
16 3 2 13

5 10 11 8

9 6 7 12

4 15 14 1

(Blank line)

your program should respond affirmatively.





[Chapter 2: OBJECT-ORIENTED PROGRAMMING](https://github.com/ElizbethK/Hometask2/tree/main/project2/chapter2)

[ex.5:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter2/Point.java)
 Implement an immutable class Point that describes a point in the plane.
Provide a constructor to set it to a specific point, a no-arg constructor to
set it to the origin, and methods getX, getY, translate, and scale. The translate
method moves the point by a given amount in x- and y-direction. The
scale method scales both coordinates by a given factor. Implement these
methods so that they return new points with the results. For example,
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
should set p to a point with coordinates (2, 3.5).


[ex.9:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter2/Car.java)
Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not


[ex.13:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter2/jarFile.java)
Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write
a class with a main method that reads a CSV file of your choice and prints
some of the content. There is sample code on the OpenCSV website. You
haven’t yet learned to deal with exceptions. Just use the following header
for the main method:
public static void main(String[] args) throws Exception
The point of this exercise is not to do anything useful with CSV files, but
to practice using a library that is delivered as a JAR file.


[Chapter 3: INTERFACES AND LAMBDA EXPRESSIONS](https://github.com/ElizbethK/Hometask2/tree/main/project2/chapter3)

[ex.1:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/Measurable.java)
Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee implement Measurable. Provide
a method double average(Measurable[] objects) that computes the average
measure. Use it to compute the average salary of an array of employees.

[ex.2:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/Measurable.java)
Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with
the largest salary. Why do you need a cast?

[ex.4:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/IntSequence.java)
Implement a static of method of the IntSequence class that yields a sequence
with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
sequence with six values. Extra credit if you return an instance of an
anonymous inner class.

[ex.5:](https://github.com/ElizbethK/Hometask2/blob/main/project2/chapter3/IntSequence.java)
Add a static method with the name constant of the IntSequence class that
yields an infinite constant sequence. For example, IntSequence.constant(1)
yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
lambda expression



