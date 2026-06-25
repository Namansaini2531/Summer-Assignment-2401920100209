class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
      
        if(root == null){
          return false;
        }
 
        if(root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        int rem = targetSum - root.val;
        return hasPathSum(root.left, rem) || hasPathSum(root.right, rem);
    }
}
