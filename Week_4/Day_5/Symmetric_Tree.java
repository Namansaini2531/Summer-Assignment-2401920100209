class Solution {
    public boolean isSymmetric(TreeNode root) {
      
        return isSym(root.left, root.right);
      
    }
    
    private boolean isSym(TreeNode left, TreeNode right) {

        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        
        return (left.val == right.val) && isSym(left.left, right.right) && isSym(left.right, right.left);
    }
}
