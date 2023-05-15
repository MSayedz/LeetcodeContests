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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head, kthNode = head, slow = head;
        
        while(--k>0){
            fast = fast.next;
            kthNode = kthNode.next;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        int temp = kthNode.val;
        kthNode.val = slow.val;
        slow.val = temp;
        
        return head;
    }
}