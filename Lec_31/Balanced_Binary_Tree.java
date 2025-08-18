package Lec_31;

import Lec_31.Diameter_of_binary_tree.TreeNode;

public class Balanced_Binary_Tree {
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
	
		class Solution {
			 public boolean isBalanced(TreeNode root) {
		        return Balanced(root);
		    }
		    
		    public boolean Balanced(TreeNode root) {
		    	if(root==null) {
		    		return true;
		    	}
		    	boolean l=Balanced(root.left);
		    	boolean r=Balanced(root.right);
		    	boolean s=Math.abs(ht(root.left) - ht(root.right))<=1;
		    	return l && r&& s;
		    }
		    
		    public int ht(TreeNode root) {
			    	if(root==null) {
			    		return -1;
			    	}
			    	int lh=ht(root.left);
			    	int rh=ht(root.right);
			    	return Math.max(lh, rh)+1;
			    }
		    
		}
}
