package review;

import java.util.Arrays;
public class Prac59 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {1,2,3,4,5,6};
        String newarr = Arrays.toString(arr1);
        System.out.println(newarr);
        int[] output = transform(arr);
        printArray(output);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] transform(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ret[i] = arr[i]*2;
        }
        return ret;
    }
}
