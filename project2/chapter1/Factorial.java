package com.netcracker.homeworks.project2.chapter1;

import java.math.BigInteger;
import java.util.Scanner;

///////// ch. 1, num. 6\\\\\\\\\\\

/*
Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
        BigInteger. Compute the factorial of 1000.*/



public class Factorial {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
         int n = input.nextInt();
        System.out.print("factorial = ");
        System.out.println(calculateFactorial(n));
    }


    public static BigInteger calculateFactorial(int n) {
        BigInteger result;

        if (n == 0) {
            return BigInteger.valueOf(1);
        } else {
            result = BigInteger.valueOf(n).multiply(calculateFactorial(n-1));
        } return result;
    }
}
