package revise;
//负责具体存储元素内容，以及存储下一个节点的地址
//Node 类是链表Prac7来使用的---车厢
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

//负责提供给用户使用，用户使用此类来存储元素---火车

public class Prac7 {
////
////    /**
////     * 单链表实现
////     */
//// class Prac7 {
////    //每个节点内部存储的元素值
////    private int data;
////    //存储下一个节点的地址
////    private Prac7 next;
////    public Prac7(int data, Prac7 next){
////        this.data = data;
////        this.next = next;
////    }
////
////    public int getData() {
////        return data;
////    }
////
////    public void setData(int data) {
////        this.data = data;
////    }
////
////    public Prac7 getNext() {
////        return next;
////    }
////
////    public void setNext(Prac7 next) {
////        this.next = next;
////    }
////}
////    //负责具体存储元素内容，以及存储下个节点地址
////    //Node类是单链表Prac7类来使用的
////    class Node {
////        private int data;
////        public Node next;
////
////        public Node(int data, Node next) {
////            this.data = data;
////            this.next = next;
////        }
////
////        public int getData() {
////            return data;
////        }
////
////        public void setData(int data) {
////            this.data = data;
////        }
////
////        public Node getNext() {
////            return next;
////        }
////
////        public void setNext(Node next) {
////            this.next = next;
////        }
////    }
////
////    //负责给用户使用，用户使用此类来存储元素（火车）
////    public class Prac7 {
////        private Node head;
////        private int size;
////        //永远指向火车车位车厢
////        private Node last;
////        //永远指向火车车头
////        private Node first;
////
////        public void add(int data) {
////            addLast(data);
////        }
////        //头插法
////        public void addFirst(int data){
////            //产生新节点
////            Node node = new Node(data,null);
////            if (first == null){
////                first = last = node;
////                size ++;
////                return;
////            }
////            node.next = first;
////            first = node;
////            size ++;
////        }
////        //尾插法
////        public void addLast(int data){
////            //生产一个新节点(车厢)
////            Node node = new Node(data,null);
////            //此时火车还没有车都和车厢
////            if (head == null){
////                head = last = node;
////                size ++;
////                return;
////            }
////            //要挂载当前最新节点，让最后一个车厢的next指向当前新节点
////            last.setNext(node);
////            last = node;
////            size ++;
////        }
////        //遍历一个链表
////        public void print(){
////            //从火车头开始依次遍历直到火车为尾
////            Node temp = first;
////            while(temp != null){
////                System.out.println(temp.getData());
////                //继续下一个节点遍历
////                temp = temp.next;
////            }
////            for(Node x = first; x!=null; x=x.next){
////                System.out.println(x.getData()+"-");
////            }
////        }
////    }
//
//
//
//    //每个节点内部存储的元素的值
//    private int data;
//    //存储下一个节点的地址
//    private Prac7 next;
//
//    public Prac7(int data, Prac7 next) {
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
//    public Prac7 getNext() {
//        return next;
//    }
//
//    public void setNext(Prac7 next) {
//        this.next = next;
//    }

    //火车头
//    private Node head;
    private int size;
    //永远指向火车的车尾车厢
    private Node last;
    //永远指向火车车头
    private Node first;

    //火车挂车厢的过程
    public void add(int data){
        addLast(data);
    }
    //尾插法
    public void addLast(int data){
        //生产一个新节点
        Node node = new Node (data,null);
        //此时火车还是空车厢
        if(last == null){
            last = node;
            size++;
            return;
        }
        last.setNext(node);
        last = node;
        size ++;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node (data,null);
        if (first == null){
            first =last = node;
            size ++;
            return;
        }
        node.setNext(first);
        first = node;
        size ++;
    }
    //遍历一个链表
    public void print(){
        //从火车头开是依次遍历，知道火车尾
        Node temp = first;
        while (temp !=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args) {

        Prac7 l = new Prac7();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.print();
    }

}
