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
    public int countNodes(TreeNode root) {
       return count(root);        
    }    
    private int count(TreeNode r)
    {
        if(r==null)
        {
            return 0;
        }

        int left=count(r.left);
        int right=count(r.right);

        return left+right+1;
    }
}
