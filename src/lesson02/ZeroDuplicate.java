package lesson02;
//Saed Jaber,ID:208480632

/*
    Q1
    Given a fixed-length integer array arr,duplicate each occurrence of zero,shifting the remaining elements to the right.
    Note that elements beyond the length of the original array are not written.
    Do the above modifications to the input array in place and do not return anything.
    Example 1:
    Input:arr=[1,0,2,3,0,4,5,0]
    Output:[1,0,0,2,3,0,0,4]
    Explanation:After calling your function,the input array is modified to:[1,0,0,2,3,0,0,4]
*/

public class ZeroDuplicate {
    public static void move(int[] numbers, int position) {
        for (int i = numbers.length - 1; i > position; i--) {
            numbers[i] = numbers[i - 1];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 3, 5, 4, 5, 0};
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                move(numbers, i);
                //Skip next spot.
                i++;
            }

        }
        //Print the array
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}
