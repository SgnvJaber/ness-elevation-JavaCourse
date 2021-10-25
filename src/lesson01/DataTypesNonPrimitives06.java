package lesson01;

public class DataTypesNonPrimitives06 {
    public static void main(String[] args) {
        String BonJovi="Shot through the heart and you're to blame darling you give love a bad name";
        //Remove spaces
        System.out.println(BonJovi.replaceAll(" ",""));
        //Count words
        String[] string_to_array=BonJovi.split(" ");
        System.out.println("The number of words is:"+string_to_array.length);
        //Print the concat of the first and last word in Uppercase
        System.out.println("Word is:"+string_to_array[0]+" "+string_to_array[string_to_array.length-1]);

    }
}
