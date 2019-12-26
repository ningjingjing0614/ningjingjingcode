package review;

 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
class Solution {
//先判断链表中元素>=1个；然后使用双指针，快的指针比慢的快n+2个；
// 这样，等快的将链表走完，慢的刚好停在待删除节点的前驱节点位置，然后让满指针的指向跳过待删除节点；
// 之后判断n是否等于快指针走过的来年表的总长度count；若相等则表示删除头结点，返回除头结点以外的所有链表元素；
// 若不相等则说明要删除的元素不是头结点，则表示返回头结点。
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head == null){
            return null;
        }
        ListNode fast = head;
        ListNode last = head;
        int count = 0;
        while (fast != null){
            fast = fast.next;
            count ++;
            if (count >= n + 2){
                last = last.next;
            }
        }
        //last此时处在待删除节点的前驱节点
        if (count == n){
            return head.next;
        }else {
            last.next = last.next.next;
            return head;
        }
    }
}
