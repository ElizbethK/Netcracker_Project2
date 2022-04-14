package com.netcracker.homeworks.project2.chapter1;

import java.util.ArrayList;
import java.util.Collections;

///////// ch. 1, num. 13\\\\\\\\\\
/*Write a program that prints a lottery combination, picking six distinct
        numbers between 1 and 49. To pick six distinct numbers, start with an
        array list filled with 1...49. Pick a random index and remove the element.
        Repeat six times. Print the result in sorted order.*/

public class Lottery {
    public static void main(String[] args) {
        getCombination();
    }

    public static void getCombination() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList <Integer> combination = new ArrayList<>();

        for (int i = 1; i < 50; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < 7; i++) {
            int j = (int) (1 + Math.random() * 49);
            combination.add(j);
           numbers.remove(numbers.indexOf(j));
        }
        Collections.sort(combination);

        String s = "";

        System.out.print("Your lottery combination is: ");
        for (int i : combination) {
            System.out.print(i + " ");
            s = Integer.toString(i);
        }
        System.out.println(s);
    }
}
