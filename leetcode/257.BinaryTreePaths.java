/*

257. Binary Tree Paths
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

  */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> response = new ArrayList<>();
        getResponse(root,response,"");
        return response;
        
    }


    public void getResponse(TreeNode root, List<String> response, String path){

        if(root==null) return;

        if(path.isEmpty()){
            path += root.val;
        }else{
            path = path + "->" + root.val; 
        }

        if(root.left ==null && root.right == null){
            response.add(path);
            return;
        }

        getResponse(root.left,response, path);
        getResponse(root.right,response, path);

    }

}
