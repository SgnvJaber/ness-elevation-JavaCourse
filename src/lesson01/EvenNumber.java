package lesson01;


public class EvenNumber {
    //The program will print the number if it is an even number,
    //otherwise it will print "-1";
    public static void main(String[] args) {
        int number = 3;
        int value = number % 2 == 0 ? number : -1;
        System.out.println("value: " + value);
    }
}
