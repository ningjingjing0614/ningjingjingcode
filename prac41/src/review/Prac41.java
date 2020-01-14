package review;

/**
 * 双向链表的实现
 */
class DoubleNode{
    DoubleNode prev;
    int val;
    DoubleNode next;

    public DoubleNode(DoubleNode prev, int val, DoubleNode next) {
        this.prev = prev;
        this.val = val;
        this.next = next;
    }
}

public class Prac41 {
    private int size;
    private DoubleNode head;
    private DoubleNode last;
    public void addLast(int data){
        DoubleNode node = new DoubleNode(null, data, null);
        if (head == null){
            //此时双向链表没有节点
            head = last = node;
            size ++;
            return ;
        }
        node.prev = last;
        last.next = node;
        last = node;
        size ++;
    }
    public void addFirst(int data){
        DoubleNode node = new DoubleNode(null, data, null);
        if (last == null){
            last = head = node;
            size ++;
            return ;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size ++;
    }
    public void addIndex(int index, int data){
        if (index < 0 || index > size){
            System.out.println("illegal");
        }else if (index == 0){
            addFirst(data);
        }else if (index == size){
            addLast(data);
        }else{
            //取得待插入位置的前驱节点
            DoubleNode prev = Node(index - 1);
            //在中间位置插入
//            DoubleNode node = new DoubleNode(null, data, null);
//            node.prev = prev;
//            node.next = prev.next;
//            prev.next.prev = node;
//            prev.next = node;
//            size ++;
            DoubleNode node = new DoubleNode(prev, data, prev.next);
            prev.next.prev = node;
            prev.next = node;
            size ++;
        }
    }
    public int get (int index){
        if (rangeCheck(index)){
            return Node(index).val;
        }
        return -1;
    }
    public void remove(int data){
        DoubleNode temp = head;
        while (temp != null){
            if (temp.val == data){
                unLink(temp);
                break;
            }else {
                temp = temp.next;
            }
        }
    }
    public void removeAll(int data){
        DoubleNode temp = head;
        while (temp != null){
            if (temp.val == data){
                //暂存要删除结点的下一个节点，防止unLink函数删除了next节点
                DoubleNode next = temp.next;
                unLink(temp);
                temp = next;
//                暂存上一个节点是错误的↓
//                DoubleNode prev = temp.prev;
//                unLink(temp);
//                temp = prev;
            }else {
                temp = temp.next;
            }
        }
    }

    public void set (int index, int data){
        if (rangeCheck(index)) {
            Node(index).val = data;
            return ;
        }
        return ;
    }
    public void print(){
        DoubleNode temp = head;
        while (temp != null){
            System.out.print(temp.val +"->");
            temp = temp.next;
        }
    }
    public int getSize(){
        return size;
    }

    /**
     * 取得index位置的节点
     * @param index
     * @return
     */
    public DoubleNode Node(int index) {
        //判断index位置在双向链表中间位置的左边还是右边
        if (index < (size >> 1)) {
            //左边，从头向后遍历
            DoubleNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            //右边，从尾向前遍历
            DoubleNode temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }
    }
    private boolean rangeCheck(int index){
        if (index < 0 || index >= size){
            System.out.println("illegal");
            return false;
        }
        return true;
    }
    private void unLink(DoubleNode temp){
        DoubleNode prev = temp.prev;
        DoubleNode next = temp.next;
        if (prev == null){
            head = next;
        }else {
            prev.next = next;
            prev = null;
        }
        if (next == null){
            last = prev;
        }else {
            next.prev = prev;
            next = null;
        }
        temp.val = 0;
        size --;
    }

}
