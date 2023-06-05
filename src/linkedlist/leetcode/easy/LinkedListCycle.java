package linkedlist.leetcode.easy;
//https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&id=top-interview-150

public class LinkedListCycle {
    public boolean hasCycle(ListNode1 head) {
    ListNode1 slow =head;
        ListNode1 fast=head;

        while (fast !=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
            return true;
    }
    return false;
    }
}
class ListNode1{
    int val;
    ListNode1 next;
    ListNode1(int x){
        val =x;
        next =null;
    }

}
