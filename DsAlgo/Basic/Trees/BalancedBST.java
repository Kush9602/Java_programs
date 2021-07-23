public class BalancedBST {

    public static void main(String[] args){
        BalancedBST bst = new BalancedBST();
        BalancedBST.Node root = null;

        int[] arr = {12,3,1,23,75,5,2,8, 7,31};

        for(int i = 0; i < arr.length; i++)
            root = bst.insert(root, arr[i]); 

        // bst.inOrder(root);
        System.out.println(bst.maxHeight(root));
        System.out.println(bst.isBalanced(root));
    }


    // check if tree is balanced or not
    public boolean isBalanced(Node root){
        if(root == null)
            return true;
        
        boolean lTree = isBalanced(root.left);
        boolean rTree = isBalanced(root.right);
        // if both left and right children are balanced then only check for parent node otherwise return false
        if(lTree == false || rTree == false)
            return false;

        // check balance for current node
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        if(Math.abs(leftHeight - rightHeight) <= 1) 
            return true;

        return false;
    }

    // check the maximun height of the tree
    public int maxHeight(Node node){
        if(node == null)
            return -1;

        int leftHeight = maxHeight(node.left);
        int rightHeight = maxHeight(node.right);

        if(leftHeight > rightHeight)
            leftHeight++;
        else
            rightHeight++;
    
        return Math.max(leftHeight, rightHeight);
    }


    // insert element in BST
    public Node insert(Node root, int data){
        if(root == null){
            Node newNode = new Node(data);
            root = newNode;
            return root;
        }

        if(data > root.data)
            root.right = insert(root.right,data);
        else 
            root.left = insert(root.left , data);
        
        return root;

    }

    public void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;        
        }
    }
}