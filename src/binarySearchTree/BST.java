package binarySearchTree;

class Node{
	int key;
	Node left,right;
	Node(int key){
		this.key=key;
	}
}
class Transversal{
	Node root;
	void insertkey(int key) {
		root=insertInTree(root, key);
	}
	Node insertInTree(Node root,int key) {
		if(root==null) {
			root=new Node(key);
		}
		if(key<root.key) {
			root.left=insertInTree(root.left,key);
		}else if(key>root.key) {
			root.right=insertInTree(root.right,key);
		}
		return root;
	}
	
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
public class BST {

	public static void main(String[] args) {
		Transversal t=new Transversal();
		t.insertkey(6);
		t.insertkey(7);
		t.insertkey(3);
		t.insertkey(9);
		t.insertkey(5);
		t.inordertransversal(t.root);
	}

}
