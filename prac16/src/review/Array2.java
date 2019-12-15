package review;

/**
 * 二分查找
 */
public class Array2 {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,6,7,8,9};
        int[] arr2 = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr2[i] = i;
        }
        System.out.println(orderedArray(arr));
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearch(arr, 0));
        System.out.println(binarySearch(arr2, 99999));
        System.out.println("二分查找执行的次数为"+count);
    }

    //判断数组是否为有序数组（升序/降序）
    public static boolean orderedArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                System.out.println("无序");
                return false;
            }
        }
        System.out.println("有序");
        return true;
    }
    //二分查找
    public static int binarySearch(int[] array, int data) {
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            count ++;
            int mid = (left + right)/2;
            if (data < array[mid]){
                right = mid-1;
            } else if (data > array[mid]){
                left = mid +1;
            } else {
                return mid;
            }
        }
        System.out.println("未找到");
        return -1;
    }
}
