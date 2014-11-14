public class TreeNode {
	TreeNode left, right;
	int element;
	int height;
	public TreeNode() {
		this(0);
	}
	public TreeNode(int n) {
		height = 0;
		left = right = null;
		element = n;
	}
}
