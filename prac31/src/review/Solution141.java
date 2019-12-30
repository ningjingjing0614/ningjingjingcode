package review;

//给定一个链表，判断链表中是否有环。
//为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
// 如果 pos 是 -1，则在该链表中没有环。

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    //运用快慢指针法，快指针比慢指针快一倍速；让他们两先同时等于链表的头结点head；
// 然后让他们按自己的速度出发，在这过程中判断他们两的值是否会相等若相等，则有发环，反之，则没有。
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