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

public class Linkedlist {
    private Node head;
    private Node last;
    private int size;

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
    public void addFirst(int data){
        Node node = new Node(data, null);
        if (head == null){
            head = last = node;
            size ++;
        }
        node.setNext(head);
        head = node;
        size ++;
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

    /**
     * 在链表任意索引处插入新的节点值data
     * @param index
     * @param data
     */
    public void addIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("illegal");
        } else if (index == size) {
            addLast(data);
            size++;
        } else if (index == 0) {
            addFirst(data);
            size++;
        } else {
            Node newNode = new Node(data, null);
            Node prev = getIndexNode(index - 1);
            //newNode.setNext(getIndexNode(index));
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
            size++;
        }
    }

    /**
     * 根据用户传入的索引值获取相应的节点值data
     * @param index
     * @return
     */
    public int get (int index){
        if (rankCheck(index)){
            Node node = getIndexNode(index);
            return node.getData();
        }

        return -1;
    }

    /**
     * 判断链表中是否有data值
     * @param data
     * @return
     */
    public boolean contains(int data){
        Node temp = head;
        while (temp != null){
            if (temp.getData() == data){
                System.out.print("success+");
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    /**
     * 修改指定index位置的节点为data值
     * @param index
     * @param data
     */
    public void set (int index, int data){
        if (rankCheck(index)){
            Node node = getIndexNode(index);
            node.setData(data);
        }
    }

    /**
     * 根据用户传入的index值取得对应的Node节点
     * @param index
     * @return
     */
    private Node getIndexNode(int index){
        Node temp = getHead();
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
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
        }
        return newHead;
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData()+"-->");
            temp = temp.getNext();
        }
    }
    public void prints(){
        System.out.println(getSize());
    }
    private boolean rankCheck(int index){
        if (index < 0 || index >= size){
            System.out.println("illegal");
            return false;
        }
        return true;
    }

}


