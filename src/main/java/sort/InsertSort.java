package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,8,2,6,4,9};
        System.out.println(Arrays.toString(insert(nums)));
    }
    public static int[] insert(int[] nums) {
        int current;
        for (int i = 0; i < nums.length - 1; i++) {
            current = nums[i+1];
            int preIndex = i;
            while (preIndex >= 0 && current < nums[preIndex]) {
                nums[preIndex+1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex+1] = current;
        }
        return nums;
    }
}
