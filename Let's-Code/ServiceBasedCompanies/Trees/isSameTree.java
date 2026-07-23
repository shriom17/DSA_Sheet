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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // List<Integer> res1 = new ArrayList<>();
        // List<Integer> res2 = new ArrayList<>();

        // dfs(p, res1);
        // dfs(q, res2);

        // return res1.equals(res2);  
      
        return check(p,q);
    }

    private boolean check(TreeNode p1, TreeNode q1)
    {
        if(p1==null && q1==null)
        {
            return true;
        }
        if(p1==null || q1==null)
        {
            return false;
        }
       
        if(p1.val != q1.val)
        {
            return false;
        }
        return check(p1.left, q1.left) && check(p1.right,q1.right);
    }
    // private void dfs(TreeNode node, List<Integer> res) {
    //     if (node == null) {
    //         res.add(null);  
    //         return;
    //     }

    //     res.add(node.val);
    //     dfs(node.left, res);
    //     dfs(node.right, res);
    // }
}
