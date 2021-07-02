package array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int pre = 0,max = nums[0];
        for (int num : nums) {
            pre = Math.max(pre+num,num);
            max = Math.max(pre,max);
        }
        return max;
    }
}
