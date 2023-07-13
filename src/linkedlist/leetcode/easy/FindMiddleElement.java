package linkedlist.leetcode.easy;

import linkedlist.leetcode.medium.ListNode;

//https://leetcode.com/problems/middle-of-the-linked-list/
public class FindMiddleElement {
    public ListNode middleNode(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;
        while(t2!=null && t2.next!=null){
            t1 = t1.next;
            t2 = t2.next.next;
        }
        return t1;
    }
    public static void main(String[] args) {
        // Create the linked list [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        FindMiddleElement findMiddleElement = new FindMiddleElement();
         ListNode middleList = findMiddleElement.middleNode(head);

        // Print the middle list [3,4,5]
        while (middleList != null) {
            System.out.print(middleList.val + " ");
            middleList = middleList.next;
        }
    }
}

