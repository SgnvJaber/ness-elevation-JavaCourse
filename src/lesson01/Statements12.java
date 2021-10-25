package lesson01;

public class Statements12 {
    public static void main(String[] args) {
        int number = 11;
        int divider = number - 1;
        boolean isPrime = true;
        while (divider > 1) {
            if (number % divider == 0) {
                isPrime = false;
                break;
            }
            divider--;
        }
        if (isPrime == true)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

    }
}
