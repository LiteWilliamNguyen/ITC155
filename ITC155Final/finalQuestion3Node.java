package ITC155Final;

public class finalQuestion3Node {
	public int data;
	public finalQuestion3Node left;
	public finalQuestion3Node right;
	
	public finalQuestion3Node(int data) {
		this(data,null,null);
	}
	
	public finalQuestion3Node(int data, finalQuestion3Node left, finalQuestion3Node right) {
		this.data=data;
		this.left=left;
		this.right=right;
	}
	
	
}
