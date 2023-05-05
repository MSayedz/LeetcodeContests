/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastRunner = head;
        ListNode slowRunner = head;
        
        while(fastRunner != null && fastRunner.next != null){
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
            if(fastRunner != null && fastRunner == slowRunner)
                return true;
        }
        
        return false;
    }
}