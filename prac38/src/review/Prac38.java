package review;

package OJ;
//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
//
//        为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
//
//        说明：不允许修改给定的链表。
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
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
package OJ;
//给定一个链表，判断链表中是否有环。
//
//        为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        //快慢指针
        ListNode fast = head, last = head;
        while (fast != null && fast.next != null){
            last = last.next;
            fast = fast.next.next;
            if (fast == last) {
                return true;
            }
        }
        return false;
    }
}