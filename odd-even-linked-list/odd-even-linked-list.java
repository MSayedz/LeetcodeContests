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
        ListNode oddHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode evenHead = new ListNode(0);
        ListNode even = evenHead;
        int count = 0;
        while(head != null){
            if(++count%2 == 0){
                even.next = head;
                even = even.next;
            } else{
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
        }
        odd.next = evenHead.next;
        even.next = null;
        
        return oddHead.next;
    }
}