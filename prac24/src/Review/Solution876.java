package Review;
//public class Prac24 {
//    public ListNode middleNode(ListNode head) {
//        int count = 0;
//        ListNode temp = head;
//        // 第一次遍历取得当前链表的的个数count
//        while (temp != null) {
//            temp = temp.next;
//            count ++;
//        }
//        temp = head;
//        // 第二次遍历到count/2的位置，就是要返回的链表中间值
//        for (int i = 0; i < count/2; i++) {
//            temp = temp.next;
//        }
//        return temp;
//    }
//}

 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    //    public ListNode middleNode(ListNode head) {
//二次遍历
//        int count = 0;
//        ListNode temp = head;
//        // 第一次遍历取得当前链表的的个数count
//        while (temp != null) {
//            temp = temp.next;
//            count ++;
//        }
//        temp = head;
//        // 第二次遍历到count/2的位置，就是要返回的链表中间值
//        for (int i = 0; i < count/2; i++) {
//            temp = temp.next;
//        }
//        return temp;
//    }
    public ListNode middleNode(ListNode head) {
//快慢指针
        if (head == null || head.next == null){
            return head;
        }else{
            ListNode last = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                last = last.next;
                fast = fast.next.next;
            }
            return last;
        }
    }
}