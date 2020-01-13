package review;

package OJ;
import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//题目描述
//编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode smallhead = new ListNode(-1);
        ListNode smalltemp = smallhead;
        ListNode bighead = new ListNode(-1);
        ListNode bigtemp = bighead;
        while (pHead != null){
            if (pHead.val < x){
                smalltemp.next = pHead;
                smalltemp = pHead;
            }else{
                bigtemp.next = pHead;
                bigtemp = pHead;
            }
            pHead = pHead.next;
        }
        bigtemp.next = null;
        smalltemp.next = bighead.next;
        return smallhead.next;
    }
}
//
//
//题目描述
//        输入一个链表，输出该链表中倒数第k个结点。
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode first = head;
        ListNode last = head;
        int count = 0;
        while (first != null){
            first = first.next;
            count ++;
            if (count >= k + 1){
                last = last.next;
            }
        }
        if (k > count){
            return null;
        }
        return last;
    }
}

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
