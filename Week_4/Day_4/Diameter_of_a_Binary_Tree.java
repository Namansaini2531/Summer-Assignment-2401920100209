class Solution {
    private int maxDia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDia;
    }

    private int height(TreeNode node) {
 
        if (node == null) {
          return 0;
        }

        int leftH  = height(node.left);
        int rightH = height(node.right);

        maxDia = Math.max(maxDia, leftH + rightH);

        return 1 + Math.max(leftH, rightH);
    }
}
