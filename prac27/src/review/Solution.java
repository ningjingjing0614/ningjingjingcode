package review;

import java.util.*;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
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
