public class Homework{
    public static void main(String[] args){
    int result = 0;
    int num = 1;
    for (int i=1; i<6; i++){
        //int num = 1;
        for (int j=1; j<=i; j++){
            num *=j;
        }
        result +=num;
    }
    System.out.println("the result is :"+result);

    scanner sc = new scanner(System.in);
    System.out.println("input a number :");
    int num =sc.nextint();

int num = 5;
 int fac = factor(num);
    System.out.println("factor is :"+fac);
    }
     public static int factor(int num){
    
        if (num == 1){
            return 1;
    }
           return num * factor(num - 1);
     }

     
    
    
     int i = 10;
     int ret = sum (i);
       System.out.println("the sum is :"+ret);
    }
   public static int sum (int i){
   if (i == 1){
       return 1;
   }
   return (i+sum(i-1));
   }


 }