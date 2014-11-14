import java.util.*;

public class BuildBTree {

	public static TreeNode buildTree(int[] arr, int lo, int hi) {
		int mid = (lo + hi)/2;
		TreeNode t = new TreeNode(arr[mid]);
		System.out.printf("%d %d %d\n", lo, mid, hi);

		if(lo > hi)
			return null;
		if(lo == hi)
			return t;

		t.left = buildTree(arr, lo, mid - 1);
		t.right = buildTree(arr, mid + 1, hi);
		return t;
	}

	public static void inorder(TreeNode r) {
		if(r == null)
			return;
		inorder(r.left);
		System.out.println(r.element);
		inorder(r.right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		TreeNode t = buildTree(arr, 0, arr.length - 1);
		inorder(t);

	}
}
