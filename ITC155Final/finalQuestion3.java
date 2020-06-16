package ITC155Final;

//Write a method called isFull that returns true if a binary tree is full and 
//false if it is not. A full binary tree is one in which every node has 0 or 2 
//children. For example, reference trees #1 and #2 is not full, but #3 is full. 
//By definition, the empty tree is considered full.


public class finalQuestion3 {
	public finalQuestion3Node nodeRoot;
	public finalQuestion3() {
		nodeRoot=null;
	}
	public boolean isFull() {
		return isFull(nodeRoot);
	}
	public static boolean isFull(finalQuestion3Node root) {
		if(root==null) {
			return true;
		}
		else {
			return isFull(root.left) && isFull(root.right);
		}
	}
	public finalQuestion3(int max) {
		if(max==0) {
			throw new IllegalArgumentException();
		}
		nodeRoot=buildTree(1,max);
	}
	public finalQuestion3Node buildTree(int n, int max) {
		if(n>max) {
			return null;
		}
		else {
			return new finalQuestion3Node(n, buildTree(2*n,max),buildTree(2*n+1,max));
		}
	}
	public void printPreorder() {
		System.out.print("Preorder: ");
		printPreorder(nodeRoot);
		System.out.println();
	}
	public void printPreorder(finalQuestion3Node root) {
		if(root!=null) {
			System.out.print(" "+ root.data);
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}
	public void printInorder() {
		System.out.print("Intorder: ");
		printInorder(nodeRoot);
		System.out.println();
	}
	public void printInorder(finalQuestion3Node root) {
		if(root!=null) {
			System.out.print(" " + root.data);
			printInorder(root.left);
			printInorder(root.right);
		}
	}
	public void printPostorder() {
		System.out.print("Postorder: ");
		printPostorder(nodeRoot);
		System.out.println();
	}
	public void printPostorder(finalQuestion3Node root) {
		if(root!=null) {
			System.out.print(" " + root.data);
			printPostorder(root.left);
			printPostorder(root.right);
		}
	}
	public void printSideways() {
        printSideways(nodeRoot, 0);
    }
	private void printSideways(finalQuestion3Node root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
	public finalQuestion3Node insert(finalQuestion3Node node, int value) {
		if(node == null) {
			return createNode(value);
		}
		
		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if (value > node.data){
			node.right = insert(node.right, value);
		}
		return node;
	}

	private finalQuestion3Node createNode(int value) {
		finalQuestion3Node node = new finalQuestion3Node(value);
		node.data = value;
		node.left = null;
		node.right = null;
		return node;
	}

}
