package array;

/**
 * 判断数组是否为单调递增或递减
 */
public class IsMonotonic {

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
        System.out.println(isMonotonic(A));
    }
    public static boolean isMonotonic(int[] A) {
        boolean inc = true,des = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i-1] < A[i]) {
                des = false;
            }
            if (A[i-1] > A[i]) {
                inc = false;
            }
        }
        return inc || des;
    }
}
