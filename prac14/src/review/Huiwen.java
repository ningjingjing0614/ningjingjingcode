package review;
//1,2,3,4,5->5,4,3,2,1
class Node {
    private int data;
    private Node next;

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
public class Huiwen {
    private Node head;
    private Node last;
    private int size;

    public Node getHead() {
        return head;
    }

    public void addLast(int data){
        Node node = new Node(data, null);
        if(last == null) {
           last = head = node;
           size ++;
        }
        last.setNext(node);
        last = node;
        size ++;
    }
    //链表的回文  1,2,3,4,5->5,4,3,2,1
    public Node realization(Node head){
        if (head == null || head.getNext() ==null){
            return head;
        }
        //当前链表不为空，遍历当前链表，产生新节点头插另一个链表
        Node newHead = new Node(head.getData(),null);
        while (head.getNext() != null){
            Node node = new Node(head.getNext().getData(),null);
            node.setNext(newHead);
            newHead = node;
            head = head.getNext();
        }
        return newHead;
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
