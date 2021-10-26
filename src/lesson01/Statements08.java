package lesson01;

public class Statements08 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 17, 20};
        for (int nums : numbers) {
            if (nums % 2 == 0)
                System.out.print(nums + " ");
        }
    }
}
