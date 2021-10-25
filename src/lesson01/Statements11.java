package lesson01;

import java.util.SortedMap;

public class Statements11 {
    public static void main(String[] args) {
        int[] numbers = {15, 2, 36, 20, 7};
        if (numbers[0] > numbers[1]) {
            if (numbers[0] > numbers[2]) {
                System.out.println(numbers[0]);
            } else {
                System.out.println(numbers[2]);
            }
        } else {
            if (numbers[1] > numbers[2]) {
                System.out.println(numbers[1]);
            } else {
                System.out.println(numbers[2]);
            }
        }
        //b)find max:
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max:" + max);
        //c)sum:
        int sum = 0;
        for (int number : numbers) {
            sum += number;

        }
        System.out.println("Sum:" + sum);


    }


}
