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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null)
        {
            return false;
        }

        if(check(root, subRoot))
        {
            return true;
        }

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

    private boolean check(TreeNode n1, TreeNode s1)
    {
        if(n1 == null && s1 == null)
        {
            return true;
        }

        if(n1 == null || s1 == null)
        {
            return false;
        }

        if(n1.val != s1.val)
        {
            return false;
        }

        return check(n1.left, s1.left) &&
               check(n1.right, s1.right);
    }
}
