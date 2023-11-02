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
    class Pair{
        int sum;
        int count;
    }
    int ans=0;
    public Pair getCount(TreeNode root, Pair pair){
        pair=new Pair();
        if(root==null) return pair;
        Pair x=getCount(root.left,pair);
        Pair y=getCount(root.right,pair);
        pair.sum = root.val+x.sum+y.sum;
        pair.count = 1+x.count+y.count;
        if(pair.sum/pair.count==root.val) ans++;
        return pair;
    } 
    public int averageOfSubtree(TreeNode root) {
        getCount(root,new Pair());
        return ans;
    }
}