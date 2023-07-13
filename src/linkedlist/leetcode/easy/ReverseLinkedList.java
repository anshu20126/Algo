package linkedlist.leetcode.easy;

//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {
    public ListNodeq reverseList(ListNodeq head) {
      if (head==null || head.next==null){
          return head;
      }
      ListNodeq reverse =reverseList(head.next);

      head.next.next=head;
      head.next=null;
      return reverse;
    }
    public static void main(String[] args) {
// Create the linked list [1, 2, 3, 4, 5]
        ListNodeq head = new ListNodeq(1);
        head.next = new ListNodeq(2);
        head.next.next = new ListNodeq(3);
        head.next.next.next = new ListNodeq(4);
        head.next.next.next.next = new ListNodeq(5);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNodeq reversedList = reverseLinkedList.reverseList(head);

        // Print the reversed list [5, 4, 3, 2, 1]
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
    }

class ListNode{
    int val;
    ListNodeq next;
    ListNode(){}
    ListNode(int val){this.val=val;}
    ListNode(int val, ListNodeq next){this.val=val;this.next=next;}
}

