package in.conceptarchitect.collections;

public class BinaryTree {
	class Node
	 {
		Node left, right;
	     int data;
	 
	     public Node()
	     {
	         left = null;
	         right = null;
	         data = 0;
	     }
	     public Node(int n)
	     {
	         left = null;
	         right = null;
	         data = n;
	     }
	     public void setLeft(Node n)
	     {
	         left = n;
	     }
	     public void setRight(Node n)
	     {
	         right = n;
	     }
	     public Node getLeft()
	     {
	         return left;
	     }
	     public Node getRight()
	     {
	         return right;
	     }
	     public void setData(int d)
	     {
	         data = d;
	     }
	     public int getData()
	     {
	         return data;
	     }     
	 }
	
	private Node root;
	 
    public BinaryTree()
    {
        root = null;
    }
    public boolean isEmpty()
    {
        return root == null;
    }
    public void insert(int data)
    {
        root = insert(root, data);
    }
    private Node insert(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
   
    public boolean search(int val)
    {
        return search(root, val);
    }
    private boolean search(Node r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }
}
