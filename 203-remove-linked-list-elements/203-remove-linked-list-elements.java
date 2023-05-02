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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
            
        ListNode curNode = head;
        
        while(curNode != null && curNode.next != null){
            if(curNode.next.val == val){
                curNode.next = curNode.next.next;
            } else{
                curNode = curNode.next;
            }
        }
        return head;
    }
}