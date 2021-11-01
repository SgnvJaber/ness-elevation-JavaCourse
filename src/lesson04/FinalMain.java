package lesson04;

public class FinalMain {
    public static void main(String[] args) {
        FinalFunctions functions = new FinalFunctions();
        //Q1
        System.out.println("=============REVERSE INTEGER===============");
        int number_to_reverse = 12345;
        System.out.println("[" + number_to_reverse + "] in reverse is:[" + functions.reverseNumber(number_to_reverse) + "]");
        //Q2
        System.out.println("=============REVERSE DOUBLE===============");
        Double double_to_reverse = 123.45;
        System.out.println("[" + double_to_reverse + "] in reverse is:[" + functions.reverseDouble(double_to_reverse) + "]");
        //Q3)
        System.out.println("=============POWER OF NUMBERS===============");
        int[] numbers = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        functions.powerOfNumbers(numbers);
        //Q4)
        System.out.println("=============AVERAGE OF NUMBERS===============");
        System.out.println("Numbers Average is: " + functions.averageOfNumbers(numbers));
        //Q5)
        System.out.println("=============Calculator===============");
        String[] equation = {"3", "/", "2"};
        System.out.println("[" + functions.myCalculator(equation) + "]");
        //Q6
        System.out.println("=============EvenDividedByFour===============");
        functions.printEvenDividedByFour(numbers);
        //Q7
        System.out.println("=============PRINT MIDDLE===============");
        functions.printMiddle(numbers);
        //Q8
        System.out.println("=============PRINT LYRICS===============");
        String song = "DO LA MI NO SA SIO ME NE";
        functions.printSongLyrics(song);
        //Q9A
        String[] words = {"ABC", "AAAAA", "BBB", "kjhdsfkjo", "JDSDFHKJH", "FGH", "LXCVKJ", "XLCKVJL", "VCKJLK", "VLK;LK", "VLKL"};
        System.out.println("=============PRINT LONGEST STRING===============");
        functions.printLongestString(words);
        //Q9B
        System.out.println("=============SEARCH FOR STRING===============");
        String[] matching_words = functions.containsString(words, "A");
        System.out.println("Matching Words:");
        for (String word : matching_words) {
            if (word != null) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
        //Q10
        System.out.println("=============Highest Score===============");
        String[][] data = {{"85", "76", "45", "91", "82"}, {"David", "Moshe", "Ilana", "Shlomo", "Hanna"}};
        functions.printHighestScore(data);
        System.out.println("=============Second Maximum Number===============");
        functions.printSecondMaximumNumber(numbers);
        //Q12
        System.out.println("=============Equal Arrays===============");
        System.out.println("Equal: " + functions.areEqual(numbers, numbers));
        //Q13
        System.out.println("=============Prime Numbers ===============");
        functions.printPrimeNumbers(numbers);
        //Q14
        System.out.println("=============Number To Words ===============");
        int number = -145;
        System.out.println("The number: [" + number + "] in words is: [" + functions.numberToWords(number) + "]");

    }

}
