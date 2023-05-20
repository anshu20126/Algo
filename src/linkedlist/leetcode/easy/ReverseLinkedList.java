package linkedlist.leetcode.easy;

import java.util.List;

//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
      if (head==null || head.next==null){
          return head;
      }
      ListNode p =reverseList(head.next);

      head.next.next=head;
      head.next=null;
      return p;
    }
    public static void main(String[] args) {
// Create the linked list [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reversedList = reverseLinkedList.reverseList(head);

        // Print the reversed list [5, 4, 3, 2, 1]
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
    }

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val,ListNode next){this.val=val;this.next=next;}
}

