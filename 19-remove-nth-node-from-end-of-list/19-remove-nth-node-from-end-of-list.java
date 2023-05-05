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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fastRunner = dummy;
        while(fastRunner != null && n-->-1){
            fastRunner = fastRunner.next;
        }
        
        ListNode slowRunner = dummy;
        
        while(fastRunner != null){
            fastRunner = fastRunner.next;
            slowRunner = slowRunner.next;
        }
        
        slowRunner.next = slowRunner.next.next;
        
        return dummy.next;
    }
}