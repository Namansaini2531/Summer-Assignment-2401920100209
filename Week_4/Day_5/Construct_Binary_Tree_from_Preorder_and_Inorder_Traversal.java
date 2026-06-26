class Solution {
    private int in = 0;
    
    public TreeNode bstFromPreorder(int[] preorder) {

        return build(preorder, Integer.MAX_VALUE);

    }
    
    private TreeNode build(int[] preorder, int bound) {
        
        if(in == preorder.length || preorder[in] > bound){
            return null;
        }

        TreeNode node = new TreeNode(preorder[in++]);

        node.left  = build(preorder, node.val);   
        node.right = build(preorder, bound);     
         
        return node;
    }
}
