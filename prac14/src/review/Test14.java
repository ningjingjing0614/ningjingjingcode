package review;

public class Test14 {
    public static void main(String[] args) {
        Huiwen h= new Huiwen();
        h.addLast(1);
        h.addLast(2);
        h.addLast(3);
        h.addLast(4);
        h.addLast(5);
        h.print();
        Node newHead = h.realization(h.getHead());
        while (newHead != null){
            System.out.print(newHead.getData()+"->");
            newHead = newHead.getNext();
        }
    }
}
