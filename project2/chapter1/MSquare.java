package com.netcracker.homeworks.project2.chapter1;

import java.util.Arrays;
import java.util.Scanner;

///////// ch. 1, num. 14\\\\\\\\\\\
/*Write a program that reads a two-dimensional array of integers and determines
        whether it is a magic square (that is, whether the sum of all
        rows, all columns, and the diagonals is the same). Accept lines of input
        that you break up into individual integers, and stop when the user enters
        a blank line. For example, with the input your program should respond affirmatively.*/

public class MSquare {
    ///////////////////////////////////////Creating an array////////////////////////////////////////
    private int[][] array;

    public MSquare(){
    }

    public void kindOfSquare() {
        Scanner input = new Scanner(System.in);
        int k = 0;
        int l = 0;
        do {
            System.out.println("Enter the number of rows, please: ");
            k = input.nextInt();
            System.out.println("Enter the number of columns, please: ");
            l = input.nextInt();
            if (k == l) {
                array = new int[k][l];
            } else {
                System.out.println("It`s not a square! Try it again, please!");
            }
        } while (!(k == l));

        System.out.print("Please, enter " + array.length * array[0].length +
                " numbers, using *Enter* for each number ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        isMagic(array);
    }


    /////////////////////////////////////////Is It Magic?////////////////////////////////////////////
    public int sumCol(int i) {
        int sumOfCol = 0;

        for (int m = 0; m < array.length; m++) {
            sumOfCol += array[m][i];
        }
        System.out.println(" column sum = " + sumOfCol);
        return sumOfCol;
    }

    public int sumRows(int i) {
        int sumOfRow = 0;
        for (int m = 0; m < array.length; m++) {
            // sumOfCol += array[m][i];
            sumOfRow += array[i][m];
        }
        System.out.println(" row sum = " + sumOfRow);
        return sumOfRow;
    }

    public void isMagic(int[][] array) {
        int count = 0;
        for (int i = 0, n = 1; i < array.length; i++, n++) {
            System.out.println(n + " row: ");
            if (sumRows(i) == sumCol(i))
                count++;
        }
        if (count == array.length) {
            diag();
        } else {
            System.out.println("---> This square is not magic");
        }
    }

    public void diag() {
        int leftSumOfD = 0;
        int rightSumOfD = 0;

        for (int i = 0, r = array.length - 1; i < array.length; i++, r--) {
            leftSumOfD += array[i][i];
            rightSumOfD += array[i][r];
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Left diagonal sum = " + leftSumOfD);
        System.out.println("Right diagonal sum = " + rightSumOfD);
        System.out.println("-----------------------------------------------------");

        System.out.println((leftSumOfD == rightSumOfD) ? "---> This square is magic!" : "---> This square is not magic");

    }
}
