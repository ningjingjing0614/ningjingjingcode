package methon;
//class test {
//    int a = 10;
//    public test(){
//        System.out.println("1111111");
//       //System.out.println(a);
//    }
//    {
//        System.out.println("222222");
//        //System.out.println(a);
//    }
//}
//public class Prac2 {
//    public static void main(String[] args) {
//        test t1 = new test();
//        test t2 = new test();
//        System.out.println(t1.a);
//    }
//}
class account {
    int id ;
    private int num;
   private int sce = 8;
   public int getSce(){
       return sce;
   }
   public void setSce(int sce){
       this.sce = sce;
       //return sce;
   }
}
public class Prac2{
    public static void main(String[] args) {
        account acc1 = new account();
        acc1.id = 2 ;
        //acc1. num =5;
       //acc1. sce = 8;
        System.out.println(acc1.id);
        //System.out.println(acc1.num);
        acc1.setSce(5);
       System.out.println(acc1.getSce());

    }
}