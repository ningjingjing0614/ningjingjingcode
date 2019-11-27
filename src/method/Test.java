package method;

public class Test {
    //    public static int count = 0;
    public static void main(String[] args) {
        //输出n的阶乘
//        int i = 5;
//        int f = factor(i);
//        System.out.println(f);
//    }
//public static int factor(int n){
//        if ( n == 1){
//            return 1;
//        }
//        return n*factor (n - 1);
//}
        //按顺序打印一个数的每一位
//        int i = 1234;
//        int p = digit(i);
//        System.out.println(p);
//    }
//    public static void digit(int n) {
//        int n = 123;
//        if (n > 0 && n < 9) {
//            System.out.println(n);
//        }
//        if (n > 9) {
//
//            System.out.println(n % 10);
//            n = (n / 10);
        //递归求1~10的和
//        int i = 10;
//        int sum = add(i);
//        System.out.println(sum);
//        }
//    public static int add(int n) {
//        if (n == 1){
//            return 1;
//        }
//        return n + add(n-1);
//    }
        //递归输出一个正整数各位数之和
//    int i = 12563;
//    int sum = add(i);
//    System.out.println(sum);
//    }
//    public static int add(int n) {
//        if (n == 1){
//            return n;
//        }
//        return (n%10) + add(n/10);
        //输出斐波那契数的第n项
//        int i = 10;
//        int s = fibo(i);
//        System.out.println(s);
//      System.out.println(count);
//  }
//   public static int fibo(int n) {
//    if (n == 1 ||n ==2){
//            return 1;
//      }
//        count ++;
//        return fibo(n-1) + fibo(n-2);
//    }

//    public static int fibo(int n) {
//        int last1 = 1;
//        int last2 = 1;
//        int cur =0;
//        for (int i = 3; i <= n; i++){
//            cur = last1 + last2;
//            last1 = last2;
//            last2 = cur;
//        }
//        return cur;
//    }
        //输出数组元素的平均值
        int[] arr = {45, 56, 58, 65, 78, 6};
        double a = avg(arr);
        System.out.println(a);
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double) sum / (double) arr.length;
    }
}
