/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node curNode = head;
        
        while(curNode != null){
            map.put(curNode, new Node(curNode.val));
            curNode = curNode.next;
        }
        
        curNode = head;
        
        while(curNode != null){
            map.get(curNode).next = map.get(curNode.next);
            map.get(curNode).random = map.get(curNode.random);
                
            curNode = curNode.next;
        }
        
        return map.get(head);
    }
}