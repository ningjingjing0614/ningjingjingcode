package review;
//删除链表中等于给定值 val 的所有节点。

  //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;

      ListNode(int x) {
          val = x;
      }

      public ListNode removeElements(ListNode head, int val) {
//          while (head != null || head.val == val) {
//              head = head.next;
//              return head;
//          }
//          if (head == null) {
//              return head;
//          } else {
//              ListNode prev = head;
//              while (prev.next != null) {
//                  if (prev.next.val == val) {
//                      prev.next = prev.next.next;
//                  } else {
//                      prev = prev.next;
//                  }
//              }
//              return head;
//          }
//      }
              ListNode dummyhead = new ListNode(val-1);
              dummyhead.next = head;
              ListNode prev = dummyhead;
              while (prev.next != null) {
                  if (prev.next.val == val) {
                      prev.next = prev.next.next;
                  } else {
                      prev = prev.next;
                  }
              }
              return dummyhead.next;
          }
      }

//       while (head != null && head.getData() == data) {
//            head = head.getNext();
//            size--;
//        }
//        if (head == null) {
//            return;
//        } else {
//            Node prev = head;
//        while (prev.getNext() != null) {
//            if (prev.getNext().getData() == data) {
//                prev.setNext(prev.getNext().getNext());
//                size--;
//            } else {
//                prev = prev.getNext();
//            }
//        }
//        }

  }