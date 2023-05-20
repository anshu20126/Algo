package recursion.leetcode.easy;
//https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    /*public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode reversedHead = RemoveLinkedListElements.removeElements(head, head.val);

        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }

// Output: 5 4 3 2 1

    }*/
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */