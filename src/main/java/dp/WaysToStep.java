package dp;

/**
 * 三步上楼
 */
public class WaysToStep {
    public static void main(String[] args) {
        System.out.println(waysToStep(11));
    }
    public static int waysToStep(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        int[] res = new int[n+1];
        res[1] = 1;
        res[2] = 2;
        res[3] = 4;
        for (int i = 4; i < res.length; i++) {
            res[i] = res[i-1] + res[i-2] + res[i-3];
        }
        return res[n];
    }
}
