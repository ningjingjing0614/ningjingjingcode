//System.out.println();
public class Twork{
public static void main(String[] args){
    // fibonaci数的代码
//     long star = System.currentTimeMillis();
//     for (int i = 1; i < 10; i++){
//         //System.out.println(fibo(i));
//         // long time = end - star;
//         System.out.println(fibona(i));
//     }
//     long end = System.currentTimeMillis();
//     System.out.println("shijian "+(end - star));
// }
// public static int fibo(int n){
//     if (n == 1){
//         return 1;
//     }
//     if (n == 2){
//         return 1;
//     }
//     else
//     return fibo(n-1)+fibo(n-2);
//    }
// public static int fibona(int n){
//     if (n ==1 || n == 2){
//         return 1;
//     }
//     else{
//         int last1 = 1;
//         int last2 = 1;
//         int cur = 0;
//          for (int i = 3; i <= n; i++){
//               cur = last1 + last2;
//               last1 = cur;
//               last2 = last1;
//         }
//         return cur;
//     }
//青蛙跳台阶
// int i = 9;
// int n = frogjump(i);
// System.out.println(n);
// }
// public static int frogjump(int n){
//     if (n == 1){
//         return 1;
//     }
//     if (n == 2){
//         return 2;
//     }
//     return frogjump (n-1)+frogjump(n-2);
//Hanoi Tower
int n = 3;
char[] t = {ta,tb,tc};
hanoitower(n, t[0], t[1], t[2]);
}

int count = 0;
//将编号为dn的盘子，从sd移动到fd
public static void move (int nd, char sd, char fd){
    count ++;
    System.out.println("把"+nd+"从"+sd+"移动到"+fd+"移动次数为"+count);
}
public static void hanoitower(int n, char ta, char tb, char tc){
    if (n == 1){
        move (1,ta,tc);
    }
    else {
        hanoitower (n-1, ta, tc, tb);
        move (nd, ta,tc);
        hanoitower(n-1, tb, ta,tc);
    }
}
}