package review;

//给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
//
//        如果有两个中间结点，则返回第二个中间结点。
//        示例 1：
//
//        输入：[1,2,3,4,5]
//        输出：此列表中的结点 3 (序列化形式：[3,4,5])
//        返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
//        注意，我们返回了一个 ListNode 类型的对象 ans，这样：
//        ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
//        示例 2：
//
//        输入：[1,2,3,4,5,6]
//        输出：此列表中的结点 4 (序列化形式：[4,5,6])
//        由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。

 Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
//研究题目及示例可知，无论链表的中间节点是一个还是两个，记它的长度为n，计算出n/2，
//然后让链表走到下标为n/2的位置，这时下标为n/2的链表元素即为要返回的中间节点。
class Solution876 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        // 第一次遍历取得当前链表的的个数count
        while (temp != null) {
            temp = temp.next;
            count ++;
        }
        //temp = head;
        // 第二次遍历到count/2的位置，就是要返回的链表中间值
        for (int i = 0; i < count/2; i++) {
            temp = temp.next;
        }
        return temp;
    }
}