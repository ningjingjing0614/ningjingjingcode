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
public class Prac9 {
    private int size;
    private Node first;
    private Node last;

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
}
