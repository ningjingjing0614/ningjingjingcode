package revise;


public class Test {
//    public static void main(String[] args) {
//        Prac5 myarray = new Prac5(3);
//        myarray.add(1);
//        myarray.add(2);
//        myarray.add(3);
//        myarray.add(4);
//        myarray.add(4,10);
//        myarray.add(5,30);
//        //myarray.add(5,520);
//        myarray.find(6);
//        myarray.find(10);
//        myarray.remove(2);
//        //myarray.remove(11);
//        myarray.set(2,9);
//        myarray.set(7,9);
//        //myarray.get(3);
//        //myarray.get(6);
//        //myarray.clear();
//        myarray.contains(10);
//        myarray.contains(11);
//        myarray.size();
//        myarray.print();
//        //System.out.println(myarray.size());
//        }
public static void main(String[] args) {
//    //生产每个节点
//    Prac7 l1 = new Prac7(1,null);
//    Prac7 l2 = new Prac7(2,null);
//    Prac7 l3 = new Prac7(3,null);
//    //将第二个节点挂接在前一个节点上
//    l1.setNext(l2);
//    l2.setNext(l3);
//    //如何遍历链表结构？
//    Prac7 temp = l1;
//    while(temp != null){
//        System.out.println(temp.getData());
//        //继续想下一个节点走
//        temp = temp.getNext();
//    }
    Prac7 l = new Prac7();
    l.addLast(1);
    l.addLast(2);
    l.addLast(3);
    l.print();

  }
}

