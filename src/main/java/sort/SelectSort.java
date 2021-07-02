package sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,8,2,6,4,9};
        System.out.println(Arrays.toString(select(nums)));
    }
    public static int[] select(int[] nums) {
        int minIndex;
        for (int i = 0; i < nums.length; i++) {
            minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
