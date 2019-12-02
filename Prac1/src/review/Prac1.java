package review;

//class Student {
    //    int num;
//    String name;
//    public static int age;
//    char sex;
//    final static  int height = 160;
//    public Student(){
//        System.out.println("hhgege");
//    }
//    public Student(int num,String name){
//        this();
//       // this.Student();
//        this.num = num;
//        this.name = name;
//    }
//    public static void change(){
//
//        age = 18;
//        System.out.println(Student.age);
//    }
//}
//public class Prac1 {
//    public static void main(String[] args) {
//       // Student stu1 = new Student(int num,String name);
//        Student stu1 = new Student(9,"宁静静");
//        System.out.println(stu1.name);
//        System.out.println(stu1.num);
//        Student.change();
//        //System.out.println(Student.age);
//        System.out.println(stu1.height);
//        Student stu2 = new Student();
//        System.out.println(stu2.height+" * "+stu2.name);
//    }
//}
//    class Test {
//        int num;
//        String name;
//        public static int q;
//        char sex;
//        final static int height = 160;
//
//        public Test() {
//            System.out.println("我是宁静静");
//        }
//        public Test(char sex) {
//            this();
//            this.sex = sex;
//        }
//        public Test(int num, String name) {
//            this(sex);
//            this.num = num;
//            this.name = name;
//        }
//    }
//    public class Prac1 {
//        public static void main(String[] args) {
//            Test stu1 = new Test();
//            Test stu2 = new Test('女');
//            Test stu3 = new Test(8,"ningjingjing");
//            System.out.println(stu1.num+"1");
//            System.out.println("2"+ stu2.sex+"2");
//            System.out.println(stu3.name+"3");
//        }
//    }
class Test{
    int num;
    int age;
    public Test(){
        System.out.println(this);
    }
        }
public class Prac1{
    public static void main(String[] args) {
        Test t1 = new Test();
        //t1.Test();
        System.out.println("main 中的："+t1);
        //t1.Test();
    }
}