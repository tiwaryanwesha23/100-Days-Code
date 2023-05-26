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
    public ListNode oddEvenList(ListNode head) {
        if (head==null) return head;
        ListNode l1=head, l2=head.next, t=null;
        
        while(l2!=null && l2.next!=null){
            t=new ListNode(l2.next.val);
            t.next=l1.next;
            l1.next=t;
            l2.next=l2.next.next;
            l1=l1.next;
            l2=l2.next;
            ListNode l4=head;
        }
        return head; 
    }
}