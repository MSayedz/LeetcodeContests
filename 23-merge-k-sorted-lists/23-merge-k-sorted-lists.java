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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        
        ListNode res = new ListNode(0);
        ListNode dummy = res;
        for(ListNode list:lists){
            if(list != null){
                pq.add(list);
            }
        }
        
        while(!pq.isEmpty()){
            dummy.next = pq.poll();
            dummy = dummy.next;
            if (dummy.next!=null)
                pq.add(dummy.next);
        }
        
        return res.next;
    }
}