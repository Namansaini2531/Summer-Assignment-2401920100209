class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        gain(root);
        return maxSum;
    }

    private int gain(TreeNode node) {
        
        if (node == null) {
            return 0;
        }

        int leftG  = Math.max(0, gain(node.left));
        int rightG = Math.max(0, gain(node.right));

        int pathThroughNode = node.val + leftG + rightG;
        maxSum = Math.max(maxSum, pathThroughNode);

        return node.val + Math.max(leftG, rightG);
    }
}
