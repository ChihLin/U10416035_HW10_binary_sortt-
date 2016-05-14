//U10416035 Cheng Chih Lin 

import java.util.ArrayList;


public class BinaryTree{
	
	public static Node root ;
	
	BinaryTree(){
		
	}
	
	
	BinaryTree(int[] numbers){
		for (int i = 0; i < numbers.length; i++){
			insert(numbers[i]);
		}
	}
	
	public void inorder(){
		storeNumber(root);		
	}
	
	public boolean insert(int e){
		if (root == null){
			root = createNewNode(e); 
		}
		else {

			Node parent = null;
			Node current = root;
			while (current != null){
				if (e<current.element) {
					parent = current;
					current = current.left;
				}
				
				else if (e > current.element) {
					parent = current;
					current = current.right;
				}
				else
					return false; 
			}
      
			if (e<parent.element)
				parent.left = createNewNode(e);
			else
				parent.right = createNewNode(e);
		}

		return true; 		
	}
	Node createNewNode(int e) {
		return new Node(e);
	}
	
	public void storeNumber(Node root){
		if(root == null){
			return;
		}
		storeNumber(root.left);
		System.out.print(root.element + " , ");
		storeNumber(root.right);
		
	}
	
	public static class Node{
		Node left;
		Node right;
		int element;
		
		public Node(int e){
			
			element = e;
			right = null;
			left = null;
			
		}
		
		public ArrayList path(int e){
		
			Node current = root;
			
			ArrayList list = new ArrayList();
		
			while(current != null){
			
				list.add(current);
			
				if(e >current.element){
					current = current.right;
				}
				else if (e  < current.element){
					current = current.left;
				}
			
				else{
					break;
				}
			}
			
			return list;
			
		}
	}

	
}
