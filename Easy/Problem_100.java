public class Problem_100 {

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
        Problem_100 problem = new Problem_100();

        // Tree 1:    1
        //           / \
        //          2   3
        TreeNode p = problem.new TreeNode(1);
        p.left = problem.new TreeNode(2);
        p.right = problem.new TreeNode(3);

        // Tree 2:    1
        //           / \
        //          2   3
        TreeNode q = problem.new TreeNode(1);
        q.left = problem.new TreeNode(2);
        q.right = problem.new TreeNode(4);

        boolean isIdentical = isSameTreeIterative(p,q);

        System.out.println("Are trees same :: "+ isIdentical);
    }

    // Recursive solution
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Step 1: If both nodes are null, trees are identical at this branch
        if (p == null && q == null) {
            return true;
        }
        // Step 2: If one is null and the other is not, trees are not identical
        if (p == null || q == null) {
            return false;
        }
        // Step 3: If values of current nodes are different, trees are not identical
        if (p.val != q.val) {
            return false;
        }
        // Step 4: Recursively check left and right subtrees
        // Both must be identical for the trees to be the same
        boolean leftSame = isSameTree(p.left, q.left); // check left subtree
        boolean rightSame = isSameTree(p.right, q.right); // check right subtree
        return leftSame && rightSame;
    }

    // Iterative solution using queues (Breadth-First Traversal)
    public static boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        java.util.Queue<TreeNode> queue1 = new java.util.LinkedList<>();
        java.util.Queue<TreeNode> queue2 = new java.util.LinkedList<>();
        queue1.add(p);
        queue2.add(q);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            // If both are null, continue to next pair
            if (node1 == null && node2 == null) continue;
            // If one is null or values differ, trees are not the same
            if (node1 == null || node2 == null || node1.val != node2.val) return false;
            // Add left children to queues
            queue1.add(node1.left);
            queue2.add(node2.left);
            // Add right children to queues
            queue1.add(node1.right);
            queue2.add(node2.right);
        }
        // If both queues are empty, trees are identical
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
