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
        return divideConquerSolution(lists);
    }
    
    private ListNode mergeWithPriorityQueue(ListNode[] lists) {
        if (lists == null || lists.length == 0) 
            return null;
        
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length,(a,b) -> a.val-b.val);
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
    
    private ListNode divideConquerSolution(ListNode[] lists) {
        ListNode ans = null;
        if(lists.length != 0){
            int step = 1;
            while(step < lists.length){
                // to make sure 0+step < len
                for(int i = 0; i+step < lists.length; i += step*2)
                    lists[i] = mergeTwoLists(lists[i], lists[i+step]);
                step *= 2;
            }
            ans = lists[0];
        }
        return ans;
    }
    
    private ListNode mergeTwoLists(ListNode lis1, ListNode lis2){
        if(lis1 == null)
            return lis2;
        if(lis2 == null)
            return lis1;
        // now lis1 != null && lis2 != null
        if(lis1.val < lis2.val){
            lis1.next = mergeTwoLists(lis1.next, lis2);
            return lis1;
        }else{
            lis2.next = mergeTwoLists(lis1, lis2.next);
            return lis2;
        }
    }
}