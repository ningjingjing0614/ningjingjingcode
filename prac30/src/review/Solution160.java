package review;

  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
//在判断A、B两个链表均不为空之后，遍历两个链表，得到其分别的长度；
// 通过裁剪长链表前面的元素使其后面的元素与短链表所有的元素长度相等；
// 然后判断A、B链表的元素是否相等；若相等，返回headA、headB中任意一个链表中开始相交的第一个元素；
// 若不相等，则说明两个链表一直没有相交，则返回null。
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        int countA = 0;
        int countB = 0;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != null){
            countA ++;
            pA = pA.next;
        }
        while (pB != null){
            countB ++;
            pB = pB.next;
        }
        while (countA > countB){
            countA --;
            headA = headA.next;
        }
        while (countB > countA){
            countB --;
            headB = headB.next;
        }
        //此是A、B一样长
        while (headA != null){
            if (headA == headB){
                return headA;
            }else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
