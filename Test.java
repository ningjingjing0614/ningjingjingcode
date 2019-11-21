/**public class Test{
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int maxvalue=Integer.MAX_VALUE;
        System.out.println(maxvalue+1);
        int minvalue=Integer.MIN_VALUE;
        System.out.println(minvalue-1);
        long num1 = 10L;
        System.out.println(num1);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        double num2 = 1.0;
        System.out.println(num2);
        int a1 = 1;
        int b1 = 2;
        System.out.println(a1/b1);
        char ch1 = '6';
        System.out.println(ch1);
        byte Value1 = 0;
        System.out.println(Value1);
        short Value2 = 0;
        System.out.println(Value2);
        boolean Value3 = true;
        System.out.println(Value3);
        String name1 = "张三";
        String name2 = "my name is \"张三\"";
        System.out.println(name2);
        String a2 = "hello";
        String b2 = "word";
        String c1 = a2+b2;
        System.out.println(c1);
        int a3 = 10;
        int b3 = 20;
        System.out.println("a3= "+ a3 +",b3 = " +b3);
        {
            int x = 10;
           System.out.println(x);
        }
         int a4 = 0x10;
         System.out.println(a4);
    }
}
public class Test{
    public static void main(String[] args){
        int a = 10;
        int b = ++a;
        System.out.println(b);
        int c = a--;
        System.out.println(c);
        
    }
}
public class Test{
public static void main(String[] args){
    int a = 10;int b =20;int c = 30;
    System.out.println(a<b && a<c);
    System.out.println(a<b || a>c);
    System.out.println(!(a < b));
    System.out.println(~a);
    int num = 100;
        while (num <=200){
            if(num % 3!=0){
               // System.out.println("first 3 multiple is:"+num);
               // break;
               //System.out.println(" 3 multiple is:"+num);
               num ++;
               continue;
            }
            System.out.println(" 3 multiple is:"+num);
            num ++;
            //System.out.println(" 3 multiple is:"+num);
             int sum = 0;
        for (int i=1; i<100; i++){
            sum += i;
            //System.out.println("sum of 1 to 99 is:"+sum);
        }
        System.out.println("sum of 1 to 99 is:"+sum);
           int result = 1;
       for (int i=1; i<6; i++){
           result *=i;
           //System.out.println("5!="+result);
       }
       System.out.println("5!="+result);
        }
}
}
*/
public class Test{
    public static void main(String[] args){
    int result = 0;
    int num = 1;
    for (int i=1; i<6; i++){
        //int num = 1;
        for (int j=1; j<i; j++){
            num *=j;
        }
        result +=num;
    }
    System.out.println("the result is :"+result);
    }
}