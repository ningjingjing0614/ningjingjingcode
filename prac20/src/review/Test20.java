package review;

public class Test20 {
    public static void main(String[] args) {
        List s = new List();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.addLast(5);
        s.addFirst(6);
        s.addFirst(7);
        s.addFirst(8);
        s.addFirst(9);
        s.addFirst(10);
        s.addFirst(6);
        s.addFirst(5);
        s.addFirst(9);
        s.addFirst(9);
        s.addFirst(9);
        s.addFirst(9);
        s.addFirst(8);
        s.addFirst(8);
        s.addFirst(8);
//        s.addIndex(0,77);
//        s.addIndex(1,44);
//        s.addIndex(12,33);
//        System.out.println(s.get(4));
//        s.set(6,99);
//        s.set(100,1);
//        System.out.println(s.contains(88));
//        System.out.println(s.contains(9));
        //s.remove(5);
        //s.remove(9);
        //s.removeAll(6);
        s.removeAll(8);
        s.removeAll(9);
        s.print();
        //s.prints();
//        Node newHead = s.reverse(s.getHead());
//        while (newHead != null){
//            System.out.print(newHead.getData()+"->");
//            newHead = newHead.getNext();
//        }

    }
}