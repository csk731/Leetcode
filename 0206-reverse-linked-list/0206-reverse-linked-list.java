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
    public ListNode rev(ListNode head){
        if(head.next==null) return ans=head;
        return rev(head.next).next=head;
    }
    public ListNode reverseList(ListNode head) {
        if(head!=null) rev(head).next=null;
        return ans;
    }
}