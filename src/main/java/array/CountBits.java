package array;

import java.util.Arrays;

/**
 * 计算二进制数中的1的个数并返回
 */
public class CountBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
    public static int[] countBits(int num) {
        int[] res = new int[num+1];
        for (int i = 0; i <= num; i++) {
            res[i] = Integer.bitCount(i);
        }
        return res;
    }
}
