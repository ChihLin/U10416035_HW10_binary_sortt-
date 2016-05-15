//U10416035 Cheng Chih Lin 

public class TestBinaryTree{

	public static void main(String[] args){
	
		//create an array
		int[]  arr = {2,8,65,45,15,4,77,58,42,53,72,25,74,52};
	
		//new an object
		BinaryTree bt = new BinaryTree(arr);
		
		//print the result
		System.out.println("The array 's number :");
		for(int i = 0 ; i< arr.length ; i++){
			
			System.out.print(arr[i] +"  ");
		}
		
		System.out.println(" ");
		System.out.println("After binary tree 's numebr : ");
		
		bt.inorder();
		
	}

}
