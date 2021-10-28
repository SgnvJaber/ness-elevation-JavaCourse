package lesson04;

import java.util.ArrayList;
import java.util.List;

public class FinalFunctions {
    //Q1
    public String reverseNumber(int number) {
        if (number == 0) {
            return "0";
        }
        String reverse = "";
        while (number > 0) {
            reverse += Integer.toString(number % 10);
            number = number / 10;
        }
        return reverse;
    }

    //Q2
    public String reverseDouble(double number) {
        String reverse = "";
        String[] reverse_array = Double.toString(number).split("");
        for (int i = reverse_array.length - 1; i >= 0; i--) {
            reverse += reverse_array[i];
        }
        return reverse;
    }

    //Q3
    public void powerOfNumbers(int numbers[]) {
        for (int number : numbers) {
            if (number >= 1 && number <= 10) {
                System.out.println("The power of [" + number + "] is: [" + (number * number) + "]");
            }
        }
        System.out.println();
    }

    //Q4
    public double averageOfNumbers(int numbers[]) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    //Q5
    public double myCalculator(String[] array) {
        double result = 0;
        if (array[1] == "+") {
            result = Double.parseDouble(array[0]) + Double.parseDouble(array[2]);
        } else if (array[1] == "-") {
            result = Double.parseDouble(array[0]) - Double.parseDouble(array[2]);

        } else if (array[1] == "*") {
            result = Double.parseDouble(array[0]) * Double.parseDouble(array[2]);

        } else if (array[1] == "/") {
            result = Double.parseDouble(array[0]) / Double.parseDouble(array[2]);

        } else {
            throw new RuntimeException("Wrong Operator");
        }
        return result;
    }

    //Q6
    public void printEvenDividedByFour(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (number % 4 == 0) {
                list.add(number);
            }
        }
        for (int num : list) {
            System.out.print("["+num + "] ");
        }
        System.out.println();
    }

}
