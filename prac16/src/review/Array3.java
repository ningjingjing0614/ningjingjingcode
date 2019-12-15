package review;

import java.util.Arrays;

/**
 * 将无序数组重新排列为有序数组
 */
public class Array3 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
