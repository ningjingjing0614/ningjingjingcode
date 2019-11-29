package method;
//public class Fwork {
//    class Person {
//        public int age ;
//        public String name;
//        public void eat(){
//            System.out.println("吃饭！");
//        }
//        private void sleep(){
//            System.out.println("睡觉！");
//        }
//    }
//  }
//public static void main(String[] args) {
//
//}

//class Person {
//    public int age ;
//    public String name;
//    public void eat(){
//        System.out.println("吃饭！");
//    }
//    public void sleep(){
//        System.out.println("睡觉！");
//    }
//}
//public class Fwork{
//    public static void main(String[] args){
//        Person per1 = new Person();
//        per1.eat();
//        per1.sleep();
//        Person per2 = new Person();
//        Person per3 = new Person();
//    }
//}
//class Person {
//    public String name;
//    public int age;
//}
//class Fwork{
//    public static void main(String[] args) {
//        Person per1 = new Person();
//        System.out.println(per1.name);
//        System.out.println(per1.age);
//    }
//}
//class Person{
//    public String name;
//    public int age;
//}
//class Fwork{
//    public static void main(String[] args) {
//        Person per1 = new Person();
//        System.out.println(per1.name.length());
//    }
//}
//class Person{
//    public String name = "宁静静";
//    public int age = 18;
//    public static void Methon(){
//        System.out.println("i am methon !");
//    }
////    public  void Soul(){
////        System.out.println("aaabbbccc");
////    }
//}
//class Fwork{
//    public static void main(String[] args) {
//        Person per1 = new Person();
//        System.out.println(per1.name);
//        System.out.println(per1.age);
//        Person.Methon();
//       // Person.Soul();//
//    }
//}
//class Communist{
//    public int a;
//    public static int count ;
//    public static void change(){
//        count = 123;
//        System.out.println("jjjjj");
////        c = 9;
////        d = 8;
////        a = 5;
//    }
//}
//class Fwork{
////    public int c = 1;
////    public static int d = 7;
//    public static void main(String[] args) {
//////        Communist com1 = new Communist();
//////        com1.a ++;
//////        Communist.count ++;
//////        System.out.println(com1.a);
//////        System.out.println(Communist.count);
//////        System.out.println("**********");
//////        Communist com2 = new Communist();
//////        com2.a ++;
//////        Communist .count ++;
//////        System.out.println(com1.a);
//////        System.out.println(Communist.count);
////////        public static int b;
////////        System.out.println(b);//在方法中无法定义静态变量
////    Communist.change();
////    System.out.println(Communist.count);
//////    System.out.println(Communist.c);
//////    System.out.println(Communist.d);
//////    System.out.println(Communist.a);
////        System.out.println(count);
////        System.out.println(a);
//        System.out.println(Communist.count);
//    }
//}
//class Person {
//    private int age = 19;
//    public String name = "ningjingjing";
//
//    public void show(){
//        System.out.println("我是"+name+"今年"+age+"岁");
//    }
//}
//class Fwork{
//    public static void main(String[] args) {
//        Person per1 = new Person();
//        per1.show();
//    }
//}
class Person {
    int age;
    String name;
    static String country = "中国";

    public Person(int age) {
        this.age = age;//
        System.out.println("一个参数的构造方法");
    }

    public static void test1() {
        System.out.println("test1");
    }

    public void test2() {
        test1();
        System.out.println("test2");
    }
}
class Fwork{
    public static void main(String[] args) {
        //Person per1 = new Person();
        Person per2 = new Person(18);
        System.out.println(per2.age);
        per2.test2();
    }
}