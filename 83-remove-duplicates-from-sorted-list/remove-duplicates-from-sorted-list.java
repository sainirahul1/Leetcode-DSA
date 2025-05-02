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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set=new LinkedHashSet<>();
        ListNode curr=head;
        while(curr!=null){
            set.add(curr.val);
            curr=curr.next;
        }
        ListNode neww=new ListNode(0);
        ListNode tail=neww;
        for(int val:set){
            tail.next=new ListNode(val);
            tail=tail.next;
        }
        return neww.next;
        
    }
}