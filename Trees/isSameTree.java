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
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        dfs(p, res1);
        dfs(q, res2);

        return res1.equals(res2);   
    }

    private void dfs(TreeNode node, List<Integer> res) {
        if (node == null) {
            res.add(null);  
            return;
        }

        res.add(node.val);
        dfs(node.left, res);
        dfs(node.right, res);
    }
}
