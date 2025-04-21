package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class _104_Maximum_Depth_of_Binary_Tree {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        // Test 3: balanced tree
        TreeNode root3 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );
        System.out.println("Test 3 (balanced): " + maxDepth(root3)); // Expect 3

        // Test 4: unbalanced tree (left-heavy)
        TreeNode root4 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4), null), null), null);
        System.out.println("Test 4 (unbalanced left): " + maxDepth(root4)); // Expect 4

        // Test 5: unbalanced tree (right-heavy)
        TreeNode root5 = new TreeNode(1, null,
                new TreeNode(2, null,
                        new TreeNode(3, null,
                                new TreeNode(4, null, null))));
        System.out.println("Test 5 (unbalanced right): " + maxDepth(root5)); // Expect 4
    }
}
