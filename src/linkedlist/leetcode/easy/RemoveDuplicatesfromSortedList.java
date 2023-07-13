package linkedlist.leetcode.easy;

public class RemoveDuplicatesfromSortedList {
    public ListNodeq deleteDuplicates(ListNodeq head) {
        if (head == null || head.next == null) {
            return null;
        }
        head.next = deleteDuplicates(head.next);
        if (head.val == head.next.val) {
            return head.next;
        }
        return head;
    }
}
