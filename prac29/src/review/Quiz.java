package review;

class A {
    public A(){
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
}
public class Quiz extends A{
    public Quiz(){
        System.out.println("4");
    }
    {
        System.out.println("5");
    }
    static {
        System.out.println("6");
    }

    public static void main(String[] args) {
        System.out.println("7");
        new Quiz();
        new Quiz();
        System.out.println("8");
    }
    //367215421548
}

