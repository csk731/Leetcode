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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode x=null, y=head, z=head.next;
        while(y!=null){
            y.next=x;
            x=y;
            y=z;
            if(z!=null) z=z.next;
        }
        return x;
    }
}