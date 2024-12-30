import com.yang.dataStructure.TreeNode;

import java.util.*;
class Solution {

    List<String> res = new ArrayList<>();

    public void dfs(TreeNode root, String s) {

        if(root == null) {
            return;
        }
        if(root.right == null && root.left ==null) {
            res.add(s + root.val);
            return;
        }
        dfs(root.left, s + root.val + "->");
        dfs(root.right, s + root.val + "->");
    }
    public List<String> binaryTreePaths(TreeNode root) {

        dfs(root, "");
        return res;

    }
}
public class MyTest {

    public static void main(String[] args) {

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1,left,right);



    }
}
