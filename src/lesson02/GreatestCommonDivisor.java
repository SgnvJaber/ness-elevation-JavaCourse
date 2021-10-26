package lesson02;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //Variables
        int first_number = 12;
        int second_number = 18;
        int divisor = 1;
        int min = first_number < second_number ? first_number : second_number;
        //Loop
        int i = 1;
        while (i <= min) {
            //if both numbers are divided by i,then update divisor's value;
            if (first_number % i == 0 && second_number % i == 0) {
                divisor = i;
            }
            i++;
        }
        System.out.println("Greatest Divisor:" + divisor);
    }
}
