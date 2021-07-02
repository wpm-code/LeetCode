package sort;

import java.util.Arrays;

public class HeapSort {
    static int temp;
    public static void main(String[] args) {
        int[] array = {6,8,1,2,7,9,10,4};
        System.out.println(Arrays.toString(heapSort(array)));
    }

    public static int[] heapSort(int[] array) {
        temp = 0;
        for (int i = array.length/2-1; i >= 0; i--) {
            toHeap(array,i,array.length);
        }
        for (int i = array.length-1; i >= 0; i--) {
            temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            toHeap(array,0,i);
        }
        return array;
    }

    public static void toHeap(int[] array,int i,int length) {
        temp = array[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && array[j] < array[j + 1]) {
                j++;
            }
            if (temp < array[j]) {
                array[i] = array[j];
                i = j;
            } else {
                break;
            }
        }
        array[i] = temp;
    }
}
