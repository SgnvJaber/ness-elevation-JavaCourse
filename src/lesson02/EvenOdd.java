package lesson02;
//Saed Jaber,ID:208480632
/*
    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
    Example 1:
    Input: nums = [3,1,2,4]
    Output: [2,4,3,1]
    Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
* */


public class EvenOdd {

    public static void main(String[] args) {
        int[] numbers = {6, 3, 1, 2, 4};
        int[] result_array = new int[numbers.length];
        int j = 0;
        //Copy Even Numbers
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                result_array[j++] = numbers[i];
            }
        }
        //Copy Odd Numbers
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 != 0) {
                result_array[j++] = numbers[i];
            }
        }
        //Print the array
        for (int num : result_array) {
            System.out.print(num + " ");
        }

    }
}
