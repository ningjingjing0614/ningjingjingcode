package review;

public class Prac56 {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            int temp = 1;
//            for (int j = 1; j <= i; j++) {
//                temp *= j;
//            }
//            sum += temp;
//        }
//        System.out.println("sum = " + sum);
//    }
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            int temp = 1;
//            for (int j = 1; j <= i; j++) {
//                temp *= j;
//            }
//            sum += temp;
//        }
//        System.out.println("sum = " + sum);
//        int a = 10;
//        int b = 20;
//        int ret = add(a, b);
//        System.out.println("add = "+ ret);
//    }
//    public static int add(int x, int y){
//     return x + y;
//    }

public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("第一次调用方法之前");
    int ret = add(a, b);
    System.out.println("第一次调用方法之后");
    System.out.println("ret = " + ret);

    System.out.println("第二次调用方法之前");
    ret = add(30, 50);
    System.out.println("第二次调用方法之后");
    System.out.println("ret = " + ret);
}
public static int add (int x, int y){
    System.out.println("调用方法中 X = " + x + " Y = " + y);
    return x + y;
}
}
