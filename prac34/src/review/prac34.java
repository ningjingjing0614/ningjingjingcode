package review;

    /**
     * 单链表的实现
     */
    class Node{
        //负责具体存储元素内容以及存储下个节点地址
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
    public class Prac34 {
//    //每个节点内部存储的元素值
//    private int data;
//    //存储下一个节点
//    private Prac13 next;
//
//    public Prac13(int data, Prac13 next) {
//        this.data = data;
//        this.next = next;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public Prac13 getNext() {
//        return next;
//    }
//
//    public void setNext(Prac13 next) {
//        this.next = next;
//    }

        private int size;
        private Node head;
        private Node last;
        //头插法
        public void addFirst(int data){
            Node node = new Node(data, null);
            if (head == null){
                head = last = node;
                size ++;
            }
            node.setNext(head);
            head = node;
            size ++;
            return;
        }
        //尾插法
        public void addLast(int data){
            Node node = new Node(data, null);
            if (last == null){
                last = head = node;
                size ++;
            }
            last.setNext(node);
            last = node;
            size ++;
            return;
        }
        public void print(){
//        Node temp = head;
//        while (temp != null){
//            System.out.println(temp.getData());
//            temp = temp.getNext();
//        }
            for (Node temp = head; temp != null; temp = temp.getNext()) {
                System.out.println(temp.getData());
            }
        }
    }
