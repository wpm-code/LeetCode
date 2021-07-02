package array;

import java.util.Arrays;
import java.util.Stack;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
    // public static int[] twoSum(int[] nums,int target) {
    //     Stack<Integer> stack = new Stack<>();
    //     int[] result = new int[2];
    //     for (int i = nums.length-1; i >= 0; i--) {
    //         stack.push(nums[i]);
    //     }
    //     while (!stack.isEmpty()) {
    //         Integer num = stack.pop();
    //         int res = target-num;
    //         if (stack.contains(res)) {
    //             result[0] = num;
    //             result[1] = res;
    //         }
    //     }
    //     return result;
    // }
    public static int[] twoSum(int[] nums,int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int num = nums[i] + nums[j];
            if (num < target) {
                i++;
            } else if (num > target) {
                j--;
            } else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }
}
