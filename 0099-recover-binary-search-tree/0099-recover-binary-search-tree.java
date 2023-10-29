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
    TreeNode prev=null, node1=null, node2=null;
    public void check(TreeNode root){
        if(root==null) return;
        check(root.left);
        if(node1==null && prev!=null && root.val<prev.val){
            node1=prev;
        }
        if(node1!=null && root.val<prev.val){
            node2=root;
        }
        prev=root;
        check(root.right);
    }
    public void recoverTree(TreeNode root) {
        check(root);
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
    }
}