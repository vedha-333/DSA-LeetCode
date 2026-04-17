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
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min ;
    }

    void inOrder(TreeNode root){
        if (root == null ) return ;
        inOrder(root.left);

        if (prev != null){
            min = Math.min(min , root.val - prev);
        }

        prev = root.val ;

        inOrder(root.right);
    }
}