package com.denis.interview.algorithms.binarytrees.mindifofvaluesoftwonodes;

import com.denis.interview.util.TreeNode;

/**
 * Given a Binary Search Tree (TreeNode) with the root node root,
 * return the minimum difference between the values of any two different nodes in the tree.
 * Second approach : In-Order Traversal
 */
public class SecondApproach {

    private Integer prev, ans;

    public int minDiffInBST(TreeNode<Integer> root) {
        prev = null;
        ans = Integer.MAX_VALUE;
        deepFirstSearch(root);
        return ans;
    }

    private void deepFirstSearch(TreeNode<Integer> node) {

        if (node == null) {
            return;
        }

        deepFirstSearch(node.getLeft());

        if (prev != null) {
            ans = Math.min(ans, node.getValue() - prev);
        }
        prev = node.getValue();
        deepFirstSearch(node.getRight());
    }

}
