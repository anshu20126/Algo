package linkedlist.leetcode.medium;

import linkedlist.leetcode.easy.ReverseLinkedList;

//https://leetcode.com/problems/reverse-linked-list-ii/?envType=study-plan-v2&envId=top-interview-150
public class ReverseLinkedListII {
    private ListNode curNode;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) {
            return head;
        }
        return helper(head, left, right, 1);
    }
    private ListNode helper(ListNode head, int left, int right, int pos) {
        if (head == null) {
            return head;
        }

        if (pos == left) {
            curNode = head;
        }

        if (pos == right) {
            ListNode node = curNode;
            curNode = curNode.next;
            node.next = head.next;
            return node;
        }

        ListNode prev = helper(head.next, left, right, pos + 1);

        if (curNode == null) {
            head.next = prev;
            return head;
        }

        ListNode node = curNode;

        if (pos == left) {
            curNode = null;
        } else {
            curNode = curNode.next;
        }

        node.next = prev;
        return node;
    }

    public static void main(String[] args) {
// Create the linked list [1, 2, 3, 4, 5]
       ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int left =2,right =4;
        ReverseLinkedListII reverseLinkedList = new ReverseLinkedListII();
        ListNode reversedList = reverseLinkedList.reverseBetween(head,left,right);

        // Print the reversed list [5, 4, 3, 2, 1]
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
