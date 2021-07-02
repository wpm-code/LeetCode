package array;

public class FindNum {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(find(1,matrix));
    }
    public static boolean find(int target,int[][] array) {
        int row = array[0].length-1;
        int col = 0;
        while (row>=0 && col<array.length) {
            if (array[row][col] == target) {
                return true;
            }
            if (array[row][col] > target) {
                row--;
            }
            if (array[row][col] < target) {
                col++;
            }
        }
        return false;
    }
}
