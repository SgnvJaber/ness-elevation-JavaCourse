package lesson01;

import java.util.Locale;

public class DataTypesNonPrimitives03 {
    public static void main(String[] args) {
        //a)Print family names in Upper Case
        String[] family = {"Hani", "Raida", "Saed", "Haitam"};
        System.out.println("Father:" + family[0].toUpperCase());
        System.out.println("Mother:" + family[1].toUpperCase());
        System.out.println("Me:" + family[2].toUpperCase());
        System.out.println("Brother:" + family[3].toUpperCase());
        //b)Print name's length
        System.out.println("My Name Length is:" + family[2].length());
        //c)Concat Father and Mother Name:
        System.out.println("Father and Mother: " + family[0] + "," + family[1]);
        //d)Print each family member first letter:
        System.out.println("First letter:" + family[0].charAt(0) + "," + family[1].charAt(0) + "," + family[2].charAt(0) + "," + family[3].charAt(0));


    }
}
