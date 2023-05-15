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
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode fast = head;
        ListNode slow = head;
        int max = 0;
        while(fast != null && fast.next != null){
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }
        
        while(slow != null){
            max = Math.max(max, stack.pop() + slow.val);
            slow = slow.next;
        }
        
        return max; 
    }
}