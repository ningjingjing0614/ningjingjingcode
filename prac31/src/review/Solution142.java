package review;
//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
//为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
// 如果 pos 是 -1，则在该链表中没有环。
//  说明：不允许修改给定的链表。

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
//判断头结点不为空，且链表元素>=两个后，运用快慢指针法，快的比慢的快一倍；
//让两个指针同时从头结点head的出发，当他们第一次相遇时，此时，last与fast所处位置为相遇点；
//然后让快指针fast重新从头结点head出发，慢指针的位置不变，此时让fast的速度和慢指针的速度相等，
//当他们再次相遇时，此时的快慢指针所处位置为所要返回的入环点。
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head, last = head;
        while (fast != null && fast.next != null){
            last = last.next;
            fast = fast.next.next;
            if (last == fast){
                //此时相遇
                break;
            }
        }
        //last此时为相遇点
        fast = head;
        while (last != null && last != fast){
            last = last.next;
            fast = fast.next;
        }
        return last;
    }
}
