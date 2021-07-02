package array;

/**
 * 给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。
 * 返回仅包含 1 的最长（连续）子数组的长度(滑动窗口)
 */
public class LongestOnes {
    public static void main(String[] args) {
        int[] A = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(A, 2));
    }
    public static int longestOnes(int[] A, int K) {
        int left = 0,right = 0,res = 0;
        int KSum = 0;
        while (right < A.length) {
            if (A[right] == 0) {
                KSum++;
            }
            right++;
            while (KSum > K) {
                if (A[left] == 0) {
                    KSum--;
                }
                left++;
            }
            res = Math.max(res,right-left);
        }
        return res;
    }
}
