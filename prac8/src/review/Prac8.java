package review;

////class Person {
////    private String name;
////    private int age;
////    private String sex;
////
////    public Person() {
////        this.name = "caocao";
////        this.age = 10;
////        this.sex = "男";
////    }
////    public Person(String name, int age, String sex){
////        this.name = name;
////        this.age = age;
////        this.sex = sex;
////    }
////    public void show(){
////        System.out.println("name: "+name+"age: "+age+"sex: "+sex);
////    }
////}
////public class Prac8 {
////    public static void main(String[] args) {
////        Person p1 = new Person();
////        p1.show();
////        Person p2 = new Person("ningjingjing",19,"女");
////        p2.show();
////    }
////}
//class Person{
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public void show(){
//        System.out.println("name: "+name+"age: "+age);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//public class Prac8{
//    public static void main(String[] args) {
//        Person p1 = new Person("ningjingjing",19);
//        p1.show();
//        System.out.println(p1);
//    }
//}
class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("name: "+name+"age: "+age);
    }
}

public class Prac8{
    public static void main(String[] args) {
        new Person("ningjignjing",19).show();
    }
}