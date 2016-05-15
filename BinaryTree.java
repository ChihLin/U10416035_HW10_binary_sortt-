//U10416035 Cheng Chih Lin 

import java.util.ArrayList;


public class BinaryTree{
	
	public static Node root ;
	
	//constructor to put array's numebr into insert method
	BinaryTree(int[] numbers){
		for (int i = 0; i < numbers.length; i++){
			insert(numbers[i]);
		}
	}
	
	
	public boolean insert(int e){
		if (root == null){
			root = createNewNode(e); 
		}
		else {

			Node parent = null;
			Node current = root;
			while (current != null){
				
				//judge the value , and print it to the left
				if (e < current.element) {
					parent = current;
					current = current.left;
				}
				//judge the value , and print it to the right
				else if (e > current.element) {
					parent = current;
					current = current.right;
				}
				
				else
					return false; 
			}
			
			//new a Node to store parent node
			if (e < parent.element){
				parent.left = createNewNode(e);
			}
			else{
				parent.right = createNewNode(e);
			}
		}

		return true; 		
	}
	
	//create new Node
	Node createNewNode(int e) {
		return new Node(e);
	}
	
	//invoke the inOrder method
	public void inorder(){
		inOrder(root);		
	}
	
	//print the binary tree 's result 
	public void inOrder(Node root){
		if(root == null){
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.element + "  ");
		inOrder(root.right);
		
	}
	
	//define a Node class 
	public static class Node{
		
		//data field 
		Node left;
		Node right;
		int element;
		
		//constructor
		public Node(int e){
			
			element = e;
			right = null;
			left = null;
			
		}
		
	}

	
}
