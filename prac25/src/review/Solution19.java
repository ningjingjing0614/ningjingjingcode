package review;

 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    //给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //双指针法
        if (head == null || n <=0){
            return null;
        }
        int count = 0;
        ListNode fast = head;
        ListNode last = head;
        while (fast != null){
            fast = fast.next;
            count ++;
            if (count >= n){
                last = last.next;
            }
            last.next = last.next.next;
        }
        if (n > count){
            return null;
        }
        return last;
    }
}