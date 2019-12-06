package linkedlist;

public class Test {

   public static void main(String[] args) {
//        //只生产3个节点
//        Prac6 l1 = new Prac6(1, null);
//        Prac6 l2 = new Prac6(2,null);
//        Prac6 l3 = new Prac6(3,null);
//        //将第二个节点挂到第一个节点之后
//        l1.setNext(l2);
//        l2.setNext(l3);
//        //遍历链结钩
//        Prac6 temp = l1;
//        while(temp != null){
//            System.out.print(temp.getData()+"——");
//            //继续向下一个节点走
//            temp = temp.getNext();
//        }
       Prac6 l = new Prac6();
       l.addLast(1);
       l.addLast(2);
       l.addLast(3);
        l.print();
  }
}
