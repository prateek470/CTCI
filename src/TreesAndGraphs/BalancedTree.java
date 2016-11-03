package TreesAndGraphs;
/**
 * 
 * @author prateek
 * Texas A&M University
 *
 */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
public class BalancedTree {
	
	/**
	 * Check if tree is balanced
	 * @param args
	 */
	static boolean TreeBalanced(TreeNode root){
		if(root==null) return true;
		if(root.left==null && root.right==null) return true;
		
		return Math.abs(maxheight(root)-minheight(root))<=1;
	}
	
	private static int maxheight(TreeNode root) {
		if(root==null) return 0;
		return 1+Math.max(maxheight(root.left), maxheight(root.right));
	}
	
	private static int minheight(TreeNode root) {
		if(root==null) return 0;
		return 1+Math.max(minheight(root.left), minheight(root.right));
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(3);
		System.out.println(TreeBalanced(root));
	}
}
