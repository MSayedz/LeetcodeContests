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
        ListNode fastRunner = head;
        ListNode slowRunner = head;
        
        while(fastRunner != null && fastRunner.next != null){
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
        }
        
        Stack<ListNode> stack = new Stack<>();
        
        while(slowRunner != null){
            stack.push(slowRunner);
            slowRunner = slowRunner.next;
        }
        
        slowRunner = head;
        while(!stack.isEmpty() && slowRunner.val == stack.peek().val){
            slowRunner = slowRunner.next;
            stack.pop();
        }
         
        return stack.isEmpty();
    }
}