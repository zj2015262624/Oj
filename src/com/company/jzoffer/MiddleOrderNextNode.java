package com.company.jzoffer;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class MiddleOrderNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null){
            return null;
        }
        if(pNode.right != null){
            pNode = pNode.right;
            while(pNode.left != null){//有右子树 那它右子树的最左边的节点是下一个节点
                pNode = pNode.left;
            }
            return pNode;
        }
        while(pNode.next != null){//没有右子树 并且没有遍历到根节点
            if(pNode.next.left == pNode){
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;//都不符合就是最后一个节点 返回null
    }
}
