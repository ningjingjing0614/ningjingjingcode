package review;

//题目描述
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
// 重复的结点不保留，返回链表头指针。
// 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode dummyHead = new ListNode(- 1);
        dummyHead.next = pHead;
        //要删除节点的前驱
        ListNode prev = dummyHead;
        //从cur开始寻找要删除的节点
        ListNode cur = dummyHead.next;
        while (cur != null){
            if (cur.next != null && cur.val == cur.next.val){
                //此时要删除cur   1 2 3 4 4 4 5
                while (cur .next != null && cur.val == cur.next.val){
                    //此时的cur需要一直删除 4 4 4
                    cur = cur.next;
                }
                //cur留在了要删除的重复节点的最后一个元素位置
                cur = cur.next;
                prev.next = cur;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}

