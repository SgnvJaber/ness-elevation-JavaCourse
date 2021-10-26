package lesson02;

public class ExceptionHandling01 {
    public static void main(String[] args) {
        int[] numbers = {3, 4,5,3};
        String na="NA";
        try {
            System.out.println("Array at index 4 is:" + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array at index 4 is:" + na);
        }
    }
}
