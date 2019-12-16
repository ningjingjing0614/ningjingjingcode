package review;

//回文链表
class Node{
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

public class SingleLinked {
    private Node head;
    private Node last;
    private int size;

//    public SingleLinked(Node head, Node last, int size) {
//        this.head = head;
//        this.last = last;
//        this.size = size;
//    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void addLast(int data){
        Node node = new Node(data, null);
        if (last == null){
            last = head = node;
            size ++;
        }
        last.setNext(node);
        last = node;
        size ++;
    }
    public Node reverse(Node head){
        if (head == null || head.getNext() == null){
            return head;
        }
        Node newHead = new Node(head.getData(), null);
        while (head.getNext() != null){
            Node node = new Node(head.getNext().getData(), null);
            node.setNext(newHead);
            newHead = node;
            head = head.getNext();
            size ++;
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
