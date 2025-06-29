public class Problem_104 {
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static int maxDepth(TreeNode root){

        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth + 1,rightDepth + 1); 

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(4),
                new TreeNode(5)
            ),
            new TreeNode(6,new TreeNode(6), new TreeNode(0))
        );
        
        System.out.println("Max depth of tree is :: " + maxDepth(root));
    }
}
