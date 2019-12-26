package review;

 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }
//        int count = 0;
//        int i = 0;
//        ListNode node = head;
//        while (node != null){
//            count ++;
//            node = node.next;
//        }
//        ListNode temp = head;
//        for (int j = 0; j < count +1-n; j++) {
//            temp.next = temp.next.next;
//        }
//        temp = temp.next;
//        return temp;
//    }    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head ==null || n <= 0){
//            return head;
//        }
//        int count = 0;
//        int i = 0;
//        ListNode node = head;
//        while (node != null){
//            count ++;
//            node = node.next;
//        }
//        ListNode temp = head;
//        for (int j = 1; j <= count-n; j++) {
//            temp = temp.next;
//            if (j >= count-n){
//            temp.next = temp.next.next;
//            }
//        }
//        temp = temp.next;
//        return temp;
//    }
//    public static void main(String[] args) {
//        ListNode s = new ListNode(1);
//        ListNode d = new ListNode(2);
//        ListNode f = new ListNode(3);
//        ListNode g = new ListNode(4);
//        ListNode h = new ListNode(5);
//        node.solution();
//    }
        ListNode first = head;
        ListNode last = head;
        int count = 0;
        while (first != null){
            first = first.next;
            count ++;
            if (count >= n + 1){
                last = last.next;
            }
        }
        if (n > count){
            return null;
        }
        return last;
    }
}
