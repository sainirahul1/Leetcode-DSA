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
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals=new ArrayList<>();
        while(head!=null){
            vals.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=vals.size()-1;
        while(left<right){
            if(!vals.get(left).equals(vals.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}