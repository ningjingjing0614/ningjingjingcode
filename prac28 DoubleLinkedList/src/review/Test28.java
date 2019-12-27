package review;

public class Test28 {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addLast(1);
        dl.addLast(2);
        dl.addLast(3);
        dl.addLast(4);
        dl.addLast(5);
        dl.addFirst(6);
        dl.addFirst(9);
        dl.addFirst(9);
        dl.addFirst(9);
        dl.addFirst(1);
//        dl.addIndex(0, 11);
//        dl.addIndex(3, 22);
//        dl.addIndex(12, 33);
//        System.out.println(dl.get(2));
//        dl.set(2,44);
        dl.remove(1);
        dl.removeAll(9);
        dl.print();
    }
}
