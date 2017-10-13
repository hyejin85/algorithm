import java.util.*;

class TreeNode {
	char data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(){}
	
	public TreeNode(char data) {
		this.data = data;
	}
	
	public TreeNode makeTree(TreeNode root, char data, char left, char right) {
		TreeNode node = null;
		
		if(root == null)
			return null;
		
		if(root.data == data) {
			if(left != '.' && right != '.') {
				root.left = new TreeNode(left);
				root.right = new TreeNode(right);
			} else if (left != '.' && right == '.') {
				root.left = new TreeNode(left);
			} else if (left == '.' && right != '.') {
				root.right = new TreeNode(right);
			}
		} else {
			makeTree(root.left, data, left, right);
			makeTree(root.right, data, left, right);
		}
		
		return root;
	}
	
	public void preOrder(TreeNode root) {
		if(root != null) {
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
        }
	}

	public void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}
	
	public void postOrder(TreeNode root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
            System.out.print(root.data);
        }
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int N = sc.nextInt(); sc.nextLine();
		String str;
		TreeNode root = new TreeNode('A');
		
		for(int i=0; i<N-1; i++) {
			str = sc.nextLine();
			char data = str.charAt(0);
			char left = str.charAt(2);
			char right = str.charAt(4);
			
			root.makeTree(root, data, left, right);
		}
		
		root.preOrder(root);
		System.out.println();
		root.inOrder(root);
		System.out.println();
		root.postOrder(root);
	}
}
