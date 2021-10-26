package lesson02;

public class FizzBuzz {
    /*
    Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    For numbers which are multiples of both three and five return 'FizzBuzz'.
    For numbers that are neither, return the input number.
    */

    public static String fizzBuzz(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(i);
        }

    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));

    }


}
