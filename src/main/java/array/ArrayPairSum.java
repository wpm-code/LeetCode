package array;

import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {

    }
    public void arrayPairSum2(int[] nums) {
        System.out.println("b");
    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i+=2) {
            res+=nums[i];
        }
        return res;
    }
}
