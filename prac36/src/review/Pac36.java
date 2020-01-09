package review;

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
package OJ;
//题目描述
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
// 重复的结点不保留，返回链表头指针。
// 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode dummyHead = new ListNode(- 1);
        dummyHead.next = pHead;
        //要删除节点的前驱
        ListNode prev = dummyHead;
        //从cur开始寻找要删除的节点
        ListNode cur = dummyHead.next;
        while (cur != null){
            if (cur.next != null && cur.val == cur.next.val){
                //此时要删除cur   1 2 3 4 4 4 5
                while (cur .next != null && cur.val == cur.next.val){
                    //此时的cur需要一直删除 4 4 4
                    cur = cur.next;
                }
                //cur留在了要删除的重复节点的最后一个元素位置
                cur = cur.next;
                prev.next = cur;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
