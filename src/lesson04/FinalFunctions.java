package lesson04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
            System.out.print("[" + num + "] ");
        }
        System.out.println();
    }

    //Q7
    public void printMiddle(int[] numbers) {
        if (numbers.length % 2 == 0) {
            System.out.println("Middle Numbers are : [" + numbers[(numbers.length - 1) / 2] + "]," + "[" + numbers[numbers.length / 2] + "]");
        } else {
            System.out.println("Middle Number is [" + numbers[numbers.length / 2] + "]");
        }
    }

    //Q8
    public void printSongLyrics(String song) {
        System.out.println("Random Sorted Lyrics");
        int rand;
        Random ran = new Random();
        //Convert String into array
        String[] lyric = song.split(" ");
        for (int i = 1; i < lyric.length; i++) {
            //generate random number/
            rand = ran.nextInt(lyric.length);
            System.out.print(lyric[rand] + " ");
        }
        System.out.println();
    }

    //Q9A
    public void printLongestString(String[] words) {
        String maxString = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxString.length()) {
                maxString = words[i];
            }
        }
        System.out.println("Largest Word: " + maxString);
    }

    //Q9B
    public String[] containsString(String[] words, String keyword) {
        String[] matching_words = new String[words.length];
        int spot = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(keyword)) {
                matching_words[spot++] = words[i];
            }
        }
        return matching_words;
    }

    //Q10
    public void printHighestScore(String[][] data) {
        String[][] slot = {{"0"}, {""}};
        for (int i = 0; i < data[0].length; i++) {
            if (Integer.parseInt(data[0][i]) > Integer.parseInt(slot[0][0])) {
                slot[0][0] = data[0][i];
                slot[1][0] = data[1][i];
            }
        }
        System.out.println(slot[1][0] + " has the highest score: [" + slot[0][0] + "]");
    }

    //Q11
    public void printSecondMaximumNumber(int[] numbers) {
        int max = 0;
        int previous_max = 0;
        for (int number : numbers) {
            if (number > max) {
                previous_max = max;
                max = number;
            }
        }
        System.out.println("Max is: " + max + " Second Max is: " + previous_max);
    }

    //Q12
    public boolean areEqual(int[] numbers, int[] other_numbers) {
        if (numbers.length != other_numbers.length) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != other_numbers[i]) {
                return false;
            }
        }

        return true;
    }

    //Q13
    private boolean isPrimeNumber(int number) {
        int divider = number - 1;
        boolean isPrime = true;
        while (divider > 1) {
            if (number % divider == 0) {
                isPrime = false;
                break;
            }
            divider--;
        }
        return isPrime;


    }

    public void printPrimeNumbers(int[] numbers) {
        for (int num : numbers) {
            if (isPrimeNumber(num)) {
                System.out.print("[" + num + "] ");
            }

        }
        System.out.println();
    }

    //Q14
    public String numberToWords(int number) {
        String words = "";

        if (number == 0) {
            return "Zero";
        }
        if (number < 0) {
            words += "Minus ";
            number = -number;
        }
        String[] ones = {"Zero", "One", "Two", "Three", "four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",};
        String[] twenties = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String hundred = "Hundred";
        List<Integer> number_digits = new ArrayList<>();
        int multiplier = 1;
        while (number > 0) {
            int division = (number % 10) * multiplier;
            number_digits.add(division);
            multiplier = multiplier * 10;
            number = number / 10;
        }
        int length = number_digits.size();
        int first_digit, second_digit, third_digit;
        if (length == 3) {
            third_digit = number_digits.get(2);
            second_digit = number_digits.get(1);
            first_digit = number_digits.get(0);
            words = words + ones[third_digit / 100] + " " + hundred;
            if (second_digit < 20) {
                words = words + " " + teens[(second_digit - 10) + first_digit];

            } else {
                words = words + " " + twenties[second_digit / 10];
                if (first_digit > 0)
                    words = words + " " + ones[first_digit];
            }
        } else if (length == 2) {
            second_digit = number_digits.get(1);
            first_digit = number_digits.get(0);
            if (second_digit < 20) {
                words = words + teens[(second_digit - 10) + first_digit];

            } else {
                words = words + twenties[second_digit / 10];
                if (first_digit > 0)
                    words = words + " " + ones[first_digit];
            }

        } else {
            first_digit = number_digits.get(0);
            words = words + ones[first_digit];
        }

        return words;

    }

}
