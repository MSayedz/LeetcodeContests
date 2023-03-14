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
    public int sumNumbers(TreeNode root) {if(root == null)
            return -1;
        List<Integer> intList = new ArrayList<>();
        sumNumbers(root, intList, 0);        
        return intList.stream().mapToInt(Integer::intValue).sum();
    }
    
    public void sumNumbers(TreeNode root, List<Integer> intList, int rootVal) {
        if(root != null){
            rootVal = 10*rootVal + root.val;
            if(root.left == null && root.right == null){
                intList.add(rootVal);
            }else{
                sumNumbers(root.left, intList, rootVal);
                sumNumbers(root.right, intList, rootVal);
            }
        }
    }
}