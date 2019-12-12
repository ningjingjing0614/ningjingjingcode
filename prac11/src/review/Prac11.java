package review;

////public class Prac11 {
////  public ListNode middleNode(ListNode head) {
//////
////////        if (l1.val == null){
////////            l3.val = l2.val;
////////        }
////////        if (l2.val == null){
////////            l3.val = l1.val;
////////        }
////////        else if (l1.val != null || l2.val != null){
////////            if(l1.val <= l2.val){
////////
////////            }
////////        }
//////        int n = 0;
//////        ListNode temp = head;
//////        while (temp != null){
//////         temp = temp.next;
//////         n ++;
//////        }
//////        temp = head;
//////        for (int i = 0; i < n/2; i++){
//////            temp = temp.next;
//////        }
//////        return temp;
////      ListNode temp1 = head;
////      ListNode temp2 = last;
////      ListNode l1 = new ListNode();
////      if (l1 == null){
////
////      }
////      while(temp.next != null){
////
////      }
////  }
////
////}
//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//        Definition for singly-linked list.
//         struct ListNode {
//             int val;
//             ListNode *next;
//             ListNode(int x) : val(x), next(NULL) {}
//        };
//
//class Solution {
//    public:
//    ListNode* deleteDuplicates(ListNode* head) {
//        return temp;
//      ListNode temp1 = head;
//      ListNode temp2 = last;
//      ListNode l1 = new ListNode();
//      if (head == null || head.next == null){
//          return l1;
//      }
//
//          if (temp1 <= temp){
//              if (temp1 == temp2){
//                  temp1.next == temp.next.next;
//              }
//          }
//          return
//    }
//}
public class Prac11 {
    public void addindex(int index, int data){
        if (index < 0 || index >size){
            System.out.println("索引非法！");
        }
        else if(index == 0){
            addFirst(data);
        }
        else if (index = size){
            addLast(data);
        }
        else{
            //在中间位置插入
            Node node = new Node(null, data, null);
            //取得待插入位置的前驱节点
            Node prev = node(index -1);
            node.next = prev.next;
            node.prev = prev;
            prev.next = node;

        }
    }
}