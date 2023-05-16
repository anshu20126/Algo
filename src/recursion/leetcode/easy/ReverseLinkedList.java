package recursion.leetcode.easy;
//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode reverseList = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return reverseList;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversedHead = ReverseLinkedList.reverseList(head);

        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }

// Output: 5 4 3 2 1

    }
}
