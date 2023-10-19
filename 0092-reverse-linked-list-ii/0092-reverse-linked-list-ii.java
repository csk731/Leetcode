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
    ListNode ans;
    public ListNode rev(ListNode head, ListNode r){
        if(head.next==r) return ans=head;
        return rev(head.next,r).next=head;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return head;
        ListNode l=null, r=head;
        while(left>1){
            if(l==null) l=head;
            else l=l.next;
            left--;
        }
        while(right>0){
            r=r.next;
            right--;
        }
        if(l==null){
            rev(head,r).next=r;
            return ans;
        }
        rev(l.next,r).next=r;
        l.next=ans;
        return head;
    }
}