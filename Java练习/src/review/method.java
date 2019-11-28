package review;

public class method {
//    static int count = 0;
    public static void main(String[] args) {
//        char[] f = "wert";
//        char[] t ="u";
//        copy(f,t);
//        for (int i = 0; i<f.length; i++){
//            System.out.println(t[i]);
//        }
//    }
//    public static void copy(char[] f,char[] t);
//    for (int i = 0; i !='\0'; i++){
//        char[i] t = char[i] f;
//        }
        //hanoitower 问题
//        int disks = 3;
//        char[] towers = {'a', 'b', 'c'};
//        hano (disks, towers[0],towers[1],towers[2]);
//        System.out.println("一共移动了"+count+"次");
//    }
//    //将编号为dn的盘子从ts移动到tc
//    public static void move (int disknumber, char tsourse, char tend) {
//        count ++;
//        System.out.println("编号为"+disknumber+"的盘子从"+tsourse+"移动到"+tend);
//    }
//    public static void hano (int ndisks, char ta,char tb, char tc){
//        if (ndisks == 1){
//            move (1, ta, tc);
//        }
//        else {
////            将n-1个盘子从a到b，
////            再把第n个盘子从a到c，
////            最后把第n-1个盘子从b到c。
//            hano(ndisks-1, ta, tc, tb);
//            move (ndisks, ta, tc);
//            hano(ndisks-1, tb, ta, tc);
//        }
        //交换数字
//        int[] arr = {34,66};
//        swap(arr);
//        System.out.println(arr[0]+"  "+arr[1]);
//    }
//
//    public static void swap(int[] array) {
//        int tmp =array[0];
//        array[0] = array[1];
//        array[1] = tmp;
        //数组中所有元素都*2
//        int[] arr = {345,67,8,9,4,0};
//        change(arr);
////        for (int i = 0; i < arr.length; i++){
////            System.out.println(arr[i]);
////        }
//        print(arr);
//    }
//
//    public static void change(int[] array) {
//        for (int n = 0; n < array.length; n++) {
//            array[n] *= 2;
//        }
//    }
//    public static void print(int[] array) {
//        for (int i : array) {
//            System.out.println(i);
//        }
        //数组拷贝
        int[] arr1 = {1,34,5,6,54,7};
        int[] arr2 = new int[6];
        copy (arr1,arr2);
        print (arr1);
        System.out.print("\n");
        print (arr2);
    }

    public static void copy(int[] array1, int[] array2) {
        for (int i = 0; i <array1.length; i++){
            array2 [i] = array1 [i];
        }
    }
    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i+"   ");
        }
    }
}
