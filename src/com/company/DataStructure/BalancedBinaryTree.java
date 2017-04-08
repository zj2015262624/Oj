package com.company.DataStructure;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        return Math.abs(depth(root.left)-depth(root.right))<=1&& isBalanced(root.left)&&isBalanced(root.right);
    }
    static int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
}
