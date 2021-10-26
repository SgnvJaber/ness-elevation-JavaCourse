package lesson01;

public class DataTypesNonPrimitives05 {
    public static void main(String[] args) {
        //Print last 3 values from String array
        String[] array = {"Java", "is", "a", "general", "purpose", "computer", "programming", "language"};
        int len = array.length;
        System.out.println(array[len - 1] + "," + array[len - 2] + "," + array[len - 3]);
        //Print last 3 values from String
        String title = "Java is a general purpose computer programming language";
        String[] split_string = title.split(" ");
        len = split_string.length;
        System.out.println(split_string[len - 1] + "," + split_string[len - 2] + "," + split_string[len - 3]);

    }
}
