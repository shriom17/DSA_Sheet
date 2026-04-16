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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> del = new HashSet<>();
        for (int x : to_delete) del.add(x);

        List<TreeNode> res = new ArrayList<>();

        dfs(root, true, del, res);
        return res;
    }

    private TreeNode dfs(TreeNode node, boolean isRoot, Set<Integer> del, List<TreeNode> res) {
        if (node == null) return null;

        boolean deleted = del.contains(node.val);

        // if it's a root and not deleted, add to result
        if (isRoot && !deleted) {
            res.add(node);
        }

        // recurse
        node.left = dfs(node.left, deleted, del, res);
        node.right = dfs(node.right, deleted, del, res);

        // if deleted, remove node
        return deleted ? null : node;
    }
}
