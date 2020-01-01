package review;

public class Animals {
    protected String name;
    public Animals(String name){
        this.name = name;
    }
    public void eat(String food){
        System.out.println("I am an animal");
        System.out.println(this.name+ "Eating"+food);
    }
}
public class Bird extends Animals{
    public Bird (String name){
        super (name);
    }
    public void eat(String food){
        System.out.println("I am a bird");
        System.out.println(this.name+ "Eating"+food);
    }
}
//public class Test{
//    public static void main(String[] args) {
//        Animals animal1 = new Animals("jingjing");
//        animal1.eat("millet");
//        Animals animal1 = new Animals("ningning");
//        animal1.eat("millet");
//    }
//}
