package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3,6,11,4,0,8,13,9};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }
    public static int[] mergeSort(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        int[] left = Arrays.copyOfRange(nums, 0, nums.length / 2);
        int[] right = Arrays.copyOfRange(nums, nums.length/2, nums.length);
        return merge(mergeSort(left),mergeSort(right));
    }
    //数组合并
    public static int[] merge(int[] left,int[] right) {
        int[] array = new int[left.length+right.length];
        int i=0,j=0,t=0;
        while (i<left.length || j<right.length) {
            if (i >= left.length){
                array[t++] = right[j++];
            } else if (j >= right.length) {
                array[t++] = left[i++];
            } else if (left[i] > right[j]) {
                array[t++] = right[j++];
            } else {
                array[t++] = left[i++];
            }
        }
        return array;
    }
}
