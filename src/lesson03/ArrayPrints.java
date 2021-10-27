package lesson03;

/*
כתבו תוכנית אשר מקבלת מערך של מספרים שלמים והשתמשו בלולאות. הניחו כי המערך גדול מ 0 וקטן מ 100. המספרים נעים בין מינוס 256 עד פלוס 256.
1)הדפיסו את כל המספרים בשורה אחת.
2)הדפיסו כל מספר בשורה נפרדת
3)הדפיסו את המספרים מהסוף להתחלה.
4)הדפיסו את סכום כל המספרים עם אינדקס אי-זוגי במערך.
5)בדקו האם קיימים איברים במערך שערכם שווה לאינדקס שלהם, במידה וכן, הדפיסו את המספר, במידה ולא, הדפיסו מינוס 1.
6)בדקו האם קיימים איברים במערך שהינם חזקה של 2, במידה וכן, הדפיסו את המספר, במידה ולא, הדפיסו מינוס 1.
7)הדפיסו את העצרת (Factorial) של כל מספר חיובי במערך.
עדכנתי את סעיף 7 :
הדפיסו את העצרת (Factorial) של כל מספר חיובי הקטן מ 10 במערך.

8)בדקו האם קיימים איברים במערך שאם נחלק את המספר בסכום הספרות שלו נקבל מספר שלם, במידה וכן, הדפיסו את המספר, במידה ולא, הדפיסו מינוס 1.
9)הדפיסו את המספרים בבסיס בינארי
10)בדקו האם קיימים איברים במערך שהינם מספר מרסן, במידה וכן, הדפיסו את המספר, במידה ולא, הדפיסו מינוס 1.
 */
public class ArrayPrints {
    //Q1)
    public static void array_print(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        //So the function won't overlap with other functions
        System.out.println();
    }

    //Q2)
    public static void array_println(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    //Q3)
    public static void array_printBackward(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        //So the function won't overlap with other functions
        System.out.println();
    }

    //Q4)
    public static int sumOddIndex(int[] numbers) {
        int sum = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            sum += numbers[i];
        }
        return sum;
    }

    //Q5)
    public static void printEqualIndex(int[] numbers) {
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == i) {
                flag = true;
                System.out.print(numbers[i] + " ");
            }
        }
        if (flag == false) {
            System.out.print(-1);
        }
        //So the function won't overlap with other functions
        System.out.println();
    }

    //Q6)
    public static boolean isPowerOf2(int number) {
        //The number 1 is equal to 2 power of zero.
        if (number == 1) {
            return true;
        }
        //If the number is equal to 2 then it is the power of 2.
        if (number < 2) {
            return false;
        }
        //Keep checking the remainder of dividing number by 2 if number become equal to 1 then return true
        while (number % 2 == 0) {
            number = number / 2;
            if (number == 1) {
                return true;
            }
        }
        //the number is not power of 2,return false.
        return false;

    }

    public static void printEqualPowerOf2(int[] numbers) {
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (isPowerOf2(numbers[i])) {
                flag = true;
                System.out.print(numbers[i] + " ");
            }
        }
        if (flag == false) {
            System.out.print(-1);
        }
        //So the function won't overlap with other functions
        System.out.println();
    }

    //Q7)
    public static int factorial(int number) {
        //The factorial of zero is equal to one;
        if (number == 0) {
            return 1;
        }
        int result = 1;
        while (number > 1) {
            result = result * number;
            number--;
        }
        return result;
    }

    public static void factorialArrayPrint(int[] numbers) {
        for (int num : numbers) {
            if (num>=0&&num<10) {
                System.out.println("The factorial of " + num + ":" + factorial(num));
            }
        }
    }

    //Q8)
    public static boolean isEqualToSumDigit(int number) {
        if (number == 0) {
            return true;
        }
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        if (number % sum == 0) {
            return true;
        }
        return false;
    }

    public static void printEqualToSumDigit(int[] numbers) {
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (isEqualToSumDigit(numbers[i])) {
                flag = true;
                System.out.print(numbers[i] + " ");
            }
        }
        if (flag == false) {
            System.out.print(-1);
        }
        //So the function won't overlap with other functions
        System.out.println();
    }

    //Q9)
    public static String convertToBinary(int number) {
        String temp = "";
        String binary = "";
        //Check for negative number.
        int convert_number = number > 0 ? number : -number;
        boolean add_minus = number > 0 ? false : true;
        //While number is not equal to zero
        while (convert_number != 0) {
            //Store the reminder
            temp += Integer.toString(convert_number % 2);
            //Divide the number by two.
            convert_number = convert_number / 2;
        }
        if (add_minus) {
            binary += '-';
        }
        for (int i = temp.length() - 1; i >= 0; i--) {
            binary += temp.charAt(i);

        }
        return binary;
    }

    public static void printBinaryVersion(int[] numbers) {
        for (int num : numbers) {
            System.out.println("The number: " + num + " in Binary: " + convertToBinary(num));
        }
    }

    //Q10)
    public static boolean isMersennePrime(int number) {
        //In mathematics, a Mersenne prime is a prime number that is one less than a power of two.
        // That is, it is a prime number of the form Mn = 2 power n − 1 for some integer n.
        if (isPowerOf2(number + 1)) {
            return true;
        }
        return false;
    }

    public static void printMersennePrime(int[] numbers) {
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (isMersennePrime(numbers[i])) {
                flag = true;
                System.out.print(numbers[i] + " ");
            }
        }
        if (flag == false) {
            System.out.print(-1);
        }
        //So the function won't overlap with other functions
        System.out.println();
    }


    //The main Function
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 2, 5, 23, 3, -2, -42, -234, -3, -1, 213, 240};
        int numbers2[] = {1, 3, 7, 9, 4};
        int numbers3[] = {1, 2, 4, 8, 5, 32};
        int numbers4[] = {0, 2, 12, 15, 18, 9, 45, -45, -18};
        int numbers5[] = {1, 2, 4, 8, 14, 52, -2, -4, -8};
        int numbers6[] = {1, 3,7,15,31,2,5,8,9};

        //Q1)
        array_print(numbers);
        //Q2)
        array_println(numbers2);
        //Q3)
        array_printBackward(numbers2);
        //Q4)
        System.out.println("Sum Odd Index:" + sumOddIndex(numbers2));
        //Q5)
        printEqualIndex(numbers2);
        //Q6)
        printEqualPowerOf2(numbers3);
        //Q7)
        factorialArrayPrint(numbers2);
        //Q8)
        printEqualToSumDigit(numbers4);
        //Q9)
        printBinaryVersion(numbers5);
        //Q10)
        printMersennePrime(numbers6);
    }
}
