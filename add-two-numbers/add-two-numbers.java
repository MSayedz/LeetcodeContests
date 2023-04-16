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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int reminder = 0;
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        
        while(l1 != null || l2 != null || reminder != 0){
            int cur = (l1 == null ? 0: l1.val) + (l2 == null ? 0: l2.val) + reminder;
            reminder = 0;
            if(cur > 9){
                cur %=10;
                reminder = 1;
            }
            res.next = new ListNode(cur);
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            res = res.next;
        }
        
        return dummy.next;
    }
}