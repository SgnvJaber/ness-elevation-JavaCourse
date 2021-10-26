package lesson01;

public class DataTypesNonPrimitives02 {
    public static void main(String[] args) {
        int[] array = {3, 7, 12, 14, 17, 4};
        //a)Print the first and fourth value
        System.out.println("First value:" + array[0]);
        System.out.println("Fourth value:" + array[3]);
        //b)Add the first value to the second value
        int sum = array[0] + array[1];
        System.out.println("The sum of the first and second value is:" + sum);
    }
}
