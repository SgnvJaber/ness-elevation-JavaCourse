package lesson01;

import java.util.Locale;

public class DataTypesNonPrimitives01 {
    public static void main(String[] args) {
        //a)Define three variables
        String first_name = "Saed ";
        String second_name = "Jaber";
        int age = 25;
        //b)Cast age (int) to string
        String age_to_string = Integer.toString(age);
        System.out.println(age_to_string);
        //c)Concat first_name and last_name
        String full_name = first_name.concat(second_name);
        System.out.println("Full Name:" + full_name);
        //d)Print Upper case
        System.out.println("Upper Case:" + full_name.toUpperCase());
        //e)Print Lower case
        System.out.println("Lower Case:" + full_name.toLowerCase());
        //f)compare age_to_string with full_name
        boolean is_equal = age_to_string.equals(full_name);
        System.out.println(is_equal);

    }


}
