package review;
//反转一个单链表。
//
//        示例:
//
//        输入: 1->2->3->4->5->NULL
//        输出: 5->4->3->2->1->NULL

  //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        else{
            ListNode newhead = new ListNode(head.val);
            while (head.next != null){
                ListNode node = new ListNode(newhead.next.val);
                node.next = newhead;
                newhead = node;
                head = head.next;
            }
            return newhead;
        }
    }
}
