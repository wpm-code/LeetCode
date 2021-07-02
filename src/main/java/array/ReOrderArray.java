package array;

import java.util.LinkedList;

public class ReOrderArray {
    public static void main(String[] args) {

    }
    public static void reOrderArray(int[] array) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            if (i%2 == 0) {
                list.addLast(array[i]);
            } else {
                list.addFirst(array[i]);
            }
        }
        Object[] objects = list.toArray();
    }
}
