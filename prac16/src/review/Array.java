package review;


public class Array {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int data1 = 7;
        int data2 = 4;
        System.out.println(findNum(arr, data1));
        System.out.println(findNum(arr, data2));
    }

    public static int findNum(int[] array, int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data){
                return i;
            }
        }
        System.out.println("未找到");
        return -1;
    }
}
