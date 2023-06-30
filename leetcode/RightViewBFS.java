package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RightViewBFS {
    List<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = rightView(root, list, 0);
        return res;
    }

    private static List<Integer> rightView(TreeNode root, List<Integer> list, int depth) {
        if (root == null) {
            return list;
        }
        if (list.size() == depth) {
            list.add(root.val);
        }
        rightView(root.right, list, depth + 1);
        rightView(root.left, list, depth + 1);
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}