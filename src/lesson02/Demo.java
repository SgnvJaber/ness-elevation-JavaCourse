package lesson02;

public class Demo {

    int findMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min)
                min = num;
        }
        return min;
    }

    int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        return max;
    }

    int calculateAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int average = sum / nums.length;
        return average;
    }

    void handleNumbers(int[] nums) {
        System.out.println("Max:" + findMax(nums));
        System.out.println("Min:" + findMin(nums));
        System.out.println("Average:" + calculateAverage(nums));
    }


}
