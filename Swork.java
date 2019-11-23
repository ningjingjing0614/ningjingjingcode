 import java.util.Scanner;
 public class Swork{
     public static void main(String[] args){
        //  int[] arr = {1,2,3};
        //  System.out.println(arr[0]);
        //  System.out.println(arr[1]); 
        //  System.out.println(arr[2]); 
        // System.out.println("input age:");
        // Scanner sc = new Scanner (System.in);
        // int age = sc.nextInt();
        // if(age <=18){
        //     System.out.println("青年");
        // }
        // else if(age >19 && age <=28){
        //     System.out.println("中年");
        // }
        // else if(age >29 && age <=55){
        //     System.out.println("老年");
        // }
        // else{
        //     System.out.println("长寿");
        // }
        //判断一个数字是否是素数
        Scanner sc = new Scanner (System.in);
        System.out.println("input a number:");
        while (sc.hasNextInt()){
        int i = sc.nextInt();
        boolean prime = true;
            for (int j = 2; j < i; j++){
                if (i%j != 0){
            System.out.println(i+"is prime");
            prime = false;
            break;
                }
                if(prime == true) {
                    System.out.println(i+"is not prime");   
                }
            }
        }
    }
 }