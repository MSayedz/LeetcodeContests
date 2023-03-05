/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        int size = 0;
        Long curSum = 0l;
        queue.offer(root);
        while(!queue.isEmpty()){
            size = queue.size();
            curSum = 0l;
            for(int i=0;i<size;i++){
                root = queue.poll();
                curSum+= (long) root.val;
                if(root.left != null)
                    queue.offer(root.left);
                if(root.right != null)
                    queue.offer(root.right);
            }
            pq.offer(curSum);
            if(pq.size()>k)
                pq.poll();
        }
        
        return pq.size() == k ? pq.poll() : -1;
    }
}