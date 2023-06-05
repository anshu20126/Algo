package stackandqueue.leetcode.easy;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> reverse = new Stack<ListNode>(); // F-I-L-O
        ListNode dummy = head; // we use head for forward traversing and dummy to store in stack
        while(dummy != null){
            reverse.push(dummy);
            dummy = dummy.next;
        }
        while(head !=null && !reverse.isEmpty()){ 
            // if value in head doesnt match stack val: return false
            if(reverse.pop().val != head.val) return false;
            // if value matches then move head to next el
            else{
                head = head.next;
            }
        }
        return true;
    }
}
 class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }