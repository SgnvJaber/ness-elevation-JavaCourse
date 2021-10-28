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
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        functions.powerOfNumbers(numbers);
        //Q4)
        System.out.println("=============AVERAGE OF NUMBERS===============");
        System.out.println("Numbers Average is: " + functions.averageOfNumbers(numbers));
        //Q5)
        System.out.println("=============Calculator===============");
        String[] equation = {"3", "+", "4"};
        System.out.println("[" + functions.myCalculator(equation) + "]");
        //Q6
        System.out.println("=============EvenDividedByFour===============");
        functions.printEvenDividedByFour(numbers);
    }
}
