package com.netcracker.homeworks.project2.chapter1;
import java.util.ArrayList;

///////// ch. 1, num. 8\\\\\\\\\\
/*Write a program that reads a string and prints all of its nonempty
        substrings.*/


public class Strings {
    private String str;
    ArrayList<String> strings = new ArrayList<>();


    public Strings(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void getSubstr() {
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ") || i == str.length()-1) {
                strings.add(str.substring(j, i+1));
                j = i + 1;
            } else {
                continue;
            }
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
