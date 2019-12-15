package review;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
//        System.out.println(findMix(arr));

//        doubleArray(arr);
//        print(arr);
//        System.out.printf("\n");
//        String str = Arrays.toString(arr);
//        System.out.println(str);
        System.out.println(average(arr));
    }
//    public static void doubleArray(int[] arr){
//        for (int i = 0; i <arr.length; i++) {
//            arr[i] *= 2;
//        }
//    }
//    public static void print(int[] arr){
//        for(int x:arr){
//            System.out.print(x+"--");
//        }
//    }

//     public static int findMix(int[] array) {
//      int max = array[0];
//      for (int i = 1; i < array.length; i++) {
//          if(array[i] >max){
//              max = array[i];
//          }
//      }
//         return max;
//     }

    public static double average(int[] array){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++){
           sum += array[i];
        }
        double aver = sum / array.length;
        return aver;
    }
}
