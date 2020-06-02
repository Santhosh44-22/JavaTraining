package in.conceptarchitect.collections;

public class Program
{
	public static void main(String[] args) 
	{
		BinaryTree bst = new BinaryTree();
		bst.insert(2);
		bst.insert(6);
		bst.insert(4);
		bst.insert(1);
		bst.insert(7);
		bst.insert(0);
		
		
		 System.out.print("\nPost order : ");
         bst.postorder();
         System.out.print("\nPre order : ");
         bst.preorder();
         System.out.print("\nIn order : ");
         bst.inorder();	
	}
}
