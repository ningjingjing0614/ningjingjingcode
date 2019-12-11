package review;

public class Test {
    public static void main(String[] args) {
        Prac10 s = new Prac10();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        s.print();
        Node newHead = s.reverse(s.getFirst());
        while (newHead != null) {
            System.out.println(newHead.getData() + "/");
            newHead = newHead.next;
        }
    }
}


