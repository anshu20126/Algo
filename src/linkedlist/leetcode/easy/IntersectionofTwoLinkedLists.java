package linkedlist.leetcode.easy;

//https://leetcode.com/problems/intersection-of-two-linked-lists/?envType=featured-list&envId=top-interview-questions
public class IntersectionofTwoLinkedLists {

    public ListNodeq getIntersectionNode(ListNodeq headA, ListNodeq headB) {
       if (headA.val!=headB.val){
           return null;
       }
       ListNodeq common = new ListNodeq(headA.val);
       if (headA.val==headB.val) {
           ListNodeq intersect = getIntersectionNode(headA.next,headB.next);
       }
        return headA.next;
    }
}

class ListNodeq {
    int val;
    ListNodeq next;

    ListNodeq(int x) {
        val = x;
        next = null;
    }
}
