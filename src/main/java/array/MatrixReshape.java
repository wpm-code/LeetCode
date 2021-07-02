package array;

/**
 * 重构数组
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums[0].length;
        int col = nums.length;
        if (row*col != r*c) {
            return nums;
        }
        int res[][] = new int[r][c];
        for (int i = 0; i < row * col; i++) {
            res[i/c][i%c] = nums[i/row][i%row];
        }
        return res;
    }
}
