package com.yang.dataStructure;
import sun.reflect.generics.tree.Tree;

import java.util.*;

class TreeNode {
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

class Solution {

    private void proOrder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }

        proOrder(root.left, res);
        res.add(root.val);
        proOrder(root.right, res);
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        proOrder(root, res);
        return res;
    }
}



public class MyTest {

    public static void main(String[] args) {


    }
}
