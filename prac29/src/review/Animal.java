package review;

public class Animal {
    protected String name;//此时name属性为继承访问权限
    public Animal(String name){
        this.name = name;
    }
    public void eat(String food) {
        System.out.println(this.name+" eating "+food);
    }

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.name = "Pig";
//        animal.eat("grain");
//        Cat cat = new Cat();
//        cat.name = "Hello Kitty";
//        cat.eat("fish");
//        Dog dog = new Dog();
//        dog.name = "Fadou";
//        dog.eat("dog food");
        Cat cat = new Cat("Garfield");
        cat.eat("fish");
    }
}
class Cat extends Animal{
//    public String name;
//
//    public static void eat(String food) {
//        System.out.println(this.name+"eating"+food);
//    }
    public Cat(String name){
        super(name);
    }
}

//class Dog extends Animal{
////    public String name;
////
////    public static void eat(String food) {
////        System.out.println(this.name+"eating"+food);
////    }
//}