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
    int sum =0;
    public int sumNumbers(TreeNode root) {
        // List<Integer> intList = new ArrayList<>();
        sumNumbers(root, 0);        
        // return intList.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }
    
    // public void sumNumbers(TreeNode root, List<Integer> intList, int rootVal) {
    public void sumNumbers(TreeNode root, int rootVal) {
        if(root != null){
            rootVal = 10*rootVal + root.val;
            if(root.left == null && root.right == null){
                // intList.add(rootVal);
                sum+=rootVal;
            }else{
                sumNumbers(root.left, rootVal);
                sumNumbers(root.right, rootVal);
                // sumNumbers(root.left, intList, rootVal);
                // sumNumbers(root.right, intList, rootVal);
            }
        }
    }
}