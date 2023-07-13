package linkedlist.leetcode.easy;
//https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan-v2&id=top-interview-150
public class MergeTwoSortedLists {
    public ListNodeq mergeTwoLists(ListNodeq list1, ListNodeq list2) {
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }
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
