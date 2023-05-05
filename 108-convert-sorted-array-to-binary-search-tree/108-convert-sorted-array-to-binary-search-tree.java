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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if(left > right)
            return null;
        
        int i = (left + right)/2;
        TreeNode root = new TreeNode(nums[i]);
        
        root.left = sortedArrayToBST(nums, left, i-1);
        root.right = sortedArrayToBST(nums, i+1, right);
        
        return root;
    }
}