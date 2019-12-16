package review;

public class Test17 {
    public static void main(String[] args) {
        SingleLinked s = new SingleLinked();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        s.print();
        Node newHead = s.reverse(s.getHead());
        while (newHead != null){
            System.out.print(newHead.getData()+"->");
            newHead = newHead.getNext();
        }
    }
}
