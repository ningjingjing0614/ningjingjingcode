
//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
//        示例：
//
//        输入：1->2->4, 1->3->4
//        输出：1->1->2->3->4->4

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    // 新建一个l3链表。取两个指针，分别指向l1、l2两个链表的头结点，逐步比较两个指针的大小，
// 小的按顺序放在新链表l3里面，并且指针也要逐步移动到下一个元素。要是其中一个指针走到末尾了，
// 将另一个指针位置及其链表之后剩余位置的值都复制到l3新链表中。l3链表即为所要返回的新链表。
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null){
                return l2;
            }else if(l2 == null){
                return l1;
            }else{
                ListNode newlast = null;
                ListNode newhead = newlast;
                while (l1 != null && l2 != null) {
                    if (l1.val <= l2.val) {
                        ListNode node = new ListNode(l1.val);
                        if (newhead == null){
                            newhead =newlast = node;
                            l1 = l1.next;
                        }else{
                            newlast.next = node;
                            newlast = node;
                            l1 = l1.next;
                        }
                    }else{
                        ListNode node = new ListNode(l2.val);
                        if (newhead == null){
                            newhead =newlast = node;
                            l2 = l2.next;
                        }else{
                            newlast.next = node;
                            newlast = node;
                            l2 = l2.next;
                        }
                    }
                }
                while (l1 != null){
                    ListNode node = new ListNode(l1.val);
                    newlast.next = node;
                    newlast = node;
                    l1 = l1.next;
                }
                while (l2 != null){
                    ListNode node = new ListNode(l2.val);
                    newlast.next = node;
                    newlast = node;
                    l2 = l2.next;
                }
                return newhead;
            }
        }
    }

