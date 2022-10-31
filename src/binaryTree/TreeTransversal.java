package binaryTree;

class Node{
	int key;
	Node left,right;
	Node(int key){
		this.key=key;
	}
}

class Transversal{
	Node root;
	void preordertransversal(Node n) {
		if(n!=null) {
			System.out.print(n.key+" ");
			preordertransversal(n.left);
			preordertransversal(n.right);
		}
	}
		void inordertransversal(Node n) {
			if(n!=null) {
				preordertransversal(n.left);
				System.out.print(n.key+" ");
				preordertransversal(n.right);
			}
	}
		void postordertransversal(Node n) {
			if(n!=null) {
				preordertransversal(n.left);
				preordertransversal(n.right);
				System.out.print(n.key+" ");
			}
	}
}
public class TreeTransversal {

	public static void main(String[] args) {
		Transversal t1=new Transversal();
		t1.root=new Node(11);
		t1.root.left=new Node(22);
		t1.root.left.left=new Node(33);
		t1.root.left.right=new Node(44);
		t1.root.left.right.left=new Node(55);
		t1.root.left.right.right=new Node(66);
		t1.root.right=new Node(77);
		t1.root.right.left=new Node(88);
		t1.root.right.left.left=new Node(99);
		
		t1.preordertransversal(t1.root);
		System.out.println();
		t1.inordertransversal(t1.root);
		System.out.println();
		t1.postordertransversal(t1.root);

	}

}

