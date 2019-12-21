package review;
//删除链表中等于给定值 val 的所有节点。
//
//        示例:
//
//        输入: 1->2->6->3->4->5->6, val = 6
//        输出: 1->2->3->4->5
  //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
            ListNode dummyhead = new ListNode(val - 1);
            dummyhead.next = head;
            ListNode prev = dummyhead;
            while(prev.next != null) {
                if (prev.next.val == val) {
                    prev.next = prev.next.next;
                }else {
                    prev = prev.next;
                }
            }
            return dummyhead.next;
        }
    }