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
    public int minDiffInBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        int minDiff = Integer.MAX_VALUE;

        // adjacent difference check
        for (int i = 1; i < res.size(); i++) {
            minDiff = Math.min(minDiff, res.get(i) - res.get(i - 1));
        }

        return minDiff;
    }
       
    private void dfs(TreeNode node, List<Integer> res)
    {
        if(node==null)
        {
            return;
        }
        dfs(node.left,res);
        res.add(node.val);
        dfs(node.right,res);
    }
}
