package review;

public class Prac60 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += factor(i);
        }
        System.out.println("sum = "+ sum);
    }
    public static int factor(int n){
        System.out.println("计算n的阶乘中 ！n = " + n);
        int result = 1;
        for (int i = 0; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

//反转一个单链表。
//
//        示例:
//
//        输入: 1->2->3->4->5->NULL
//        输出: 5->4->3->2->1->NULL
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode(head.val);
        while (head.next != null){
            ListNode node = new ListNode(head.next.val);
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }
}