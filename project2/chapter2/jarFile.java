package com.netcracker.homeworks.project2.chapter2;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


///////// ch. 2, num. 13\\\\\\\\\\\
/*
Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write
        a class with a main method that reads a CSV file of your choice and prints
        some of the content. There is sample code on the OpenCSV website. You
        haven’t yet learned to deal with exceptions. Just use the following header
        for the main method:
            > public static void main(String[] args) throws Exception
        The point of this exercise is not to do anything useful with CSV files, but
        to practice using a library that is delivered as a JAR file.*/


public class jarFile {
    public static void main(String[] args) throws Exception {

        CSVReader reader = new CSVReader(new FileReader("src/staff.csv"));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //Verifying the read data here
                System.out.println(Arrays.toString(nextLine));
            }

            //----> To add smth into array
/*      String csv = "src/staff.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] record = "3,David,Feezor,USA,40".split(";");
        writer.writeNext(record);
        writer.close();*/


            //----> To read by index
        /*String[] nextLine;
        while ((nextLine = reader.readNext()) != null){
            System.out.println(nextLine[0]);
        }*/

        }
    }

}
