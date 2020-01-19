package review;

//编写一个程序，找到两个单链表相交的起始节点。
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if (headA == null || headB == null){
    //         return null;
    //     }
    //     int countA = 0;
    //     int countB = 0;
    //     ListNode pA = headA;
    //     ListNode pB = headB;
    //     while (pA != null){
    //         countA ++;
    //         pA = pA.next;
    //     }
    //     while (pB != null){
    //         countB ++;
    //         pB = pB.next;
    //     }
    //     while (countA > countB){
    //         countA --;
    //         headA = headA.next;
    //     }
    //     while (countB > countA){
    //         countB --;
    //         headB = headB.next;
    //     }
    //     //此是A、B一样长
    //     while (headA != null){
    //         if (headA == headB){
    //             return headA;
    //         }else {
    //             headA = headA.next;
    //             headB = headB.next;
    //         }
    //     }
    //     return null;
    // }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            //此时还没有相交
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        return pA;
    }
}

