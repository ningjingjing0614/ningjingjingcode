package practice;


public class Test13 {
    public static void main(String[] args) {
//        Prac13 p1 = new Prac13(1,null);
//        Prac13 p2 = new Prac13(2,null);
//        Prac13 p3 = new Prac13(3,null);
//        //将第二个节点挂到前一个节点上
//        p1.setNext(p2);
//        p2.setNext(p3);
//        //遍历链表结构
//        Prac13 temp = p1;
//        //while(temp.getData() != 0)--空指针异常
//        while(temp != null){
//            System.out.println(temp.getData());
//            temp = temp.getNext();
//        }
        Prac13 p = new Prac13();
//        p.addLast(1);
//        p.addLast(2);
//        p.addLast(3);
        p.addFirst(4);
        p.addFirst(5);
        p.addFirst(6);
        p.print();
    }
}
