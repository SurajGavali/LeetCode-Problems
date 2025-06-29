public class Problem_101 {
    // https://leetcode.com/problems/symmetric-tree/description/

    public class TreeNode {
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

    public static void main(String[] args) {
        Problem_101 problem = new Problem_101();

        // Tree 1:    1
        //           / \
        //          2   2
        //         / \ / \
        //        3  4 4  3
        TreeNode p = problem.new TreeNode(1);
        p.left = problem.new TreeNode(2);
        p.right = problem.new TreeNode(2);
        p.left.left = problem.new TreeNode(3);
        p.left.right = problem.new TreeNode(4);
        p.right.right = problem.new TreeNode(3);
        p.right.left = problem.new TreeNode(4);

        System.out.println("Is Tree Mirror of itself :: "+ Boolean.valueOf(isMirror(p)));
    }

    public static boolean isMirror(TreeNode root) {

        if (root == null) return true;
        return isMirrorHelper(root.left, root.right);
    }

    private static boolean isMirrorHelper(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        return isMirrorHelper(t1.left, t2.right) && isMirrorHelper(t1.right, t2.left);
    }
    
}
