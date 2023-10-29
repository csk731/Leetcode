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
    public boolean check(long left, long right, TreeNode root){
        if(root==null) return true;
        if(root.val<left || root.val>right) return false;
        return check(left,(long)root.val-1,root.left) && check((long)root.val+1,right,root.right);
    }
    public boolean isValidBST(TreeNode root) {
        return check(Integer.MIN_VALUE, Integer.MAX_VALUE, root);
    }
}