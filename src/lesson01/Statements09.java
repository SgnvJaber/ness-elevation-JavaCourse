package lesson01;

public class Statements09 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 17, 20, 45};
        for (int nums : numbers) {
            if (nums % 3 == 0 && nums % 5 == 0)
                System.out.print(nums + " ");
        }
    }
}
