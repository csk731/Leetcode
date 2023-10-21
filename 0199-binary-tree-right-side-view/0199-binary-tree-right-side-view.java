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
    public List<Integer> rightSideView(TreeNode A) {
        List<Integer> ans=new ArrayList<>();
        if(A==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            int size=q.size();
            while(size!=0){
                TreeNode node=q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                if(size==1) ans.add(node.val);
                size--;
            }
        }
        return ans;
    }
}