package review;

class Node{
    private int data;
    public  Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class Prac10 {
    private int size;
    private Node first;
    private Node last;

    public Prac10(Node first) {
        this.first = first;
    }

    public Node getFirst() {
        return first;
    }

    //public void add(int data){
//    addFirst(data);
//}
//    public void addFirst(int data) {
//    Node node = new Node(data, null);
//        if (first == null) {
//            first = node;
//            size ++;
//            return;
//        }
//        node.next = first;
//        first = node;
//        size ++;
//    }
    public void addLast(int data) {
        Node node = new Node(data, null);
        if (last == null) {
            last = first = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    public void print() {
//        for (Node x = first; x != null; x= x.next) {
//            System.out.print(x.getData() +"、");
//            return;
//        }
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            // 继续向下一个节点遍历
            temp = temp.next;
        }
    }

    //回文链表
//1，2，3，4，5，null -> 5,4,3,2,1,null
//将原先链表遍历一次，边遍历便头插新的链表
    public Node reverse(Node head) {
        //判断边界
        if (head == null || head.next == null) {
            return head;
        }
        //当前链表不为空，遍历当前链表，产生新节点，来头插另一个链表
        Node newHead = new Node(head.getData(), null);
        //遍历原先链表
        while(head.next != null){
            //产生新节点
            Node node = new Node(head.next.getData(),null);
            //将新节点头插到新链表头部
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }
}
