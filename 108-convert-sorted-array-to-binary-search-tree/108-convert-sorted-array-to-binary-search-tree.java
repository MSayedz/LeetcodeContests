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
        
        int p = (left + right)/2;
        TreeNode root = new TreeNode(nums[p]);
        root.left = sortedArrayToBST(nums, left, p - 1);
        root.right = sortedArrayToBST(nums, p + 1, right);
        
        return root;
    }
}