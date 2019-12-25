package review;

 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        ListNode temp = dummyhead;
        while (temp.next != null){
            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return dummyhead.next;
    }
}
