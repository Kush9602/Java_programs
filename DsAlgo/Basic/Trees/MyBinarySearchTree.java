public class MyBinarySearchTree {

    public Node root;

    public Node search(Node node, int info){
        if(node == null || node.data == info)
            return node;
        else{
            if(node.data > info)
                search(node.left, info);
            else
                search(node.right, info);
        }
        return node;
    }


    // insert node recursively(when we have root node).
    public Node insert(Node node, int data){
        if(node == null){
            Node newNode = new Node(data);
            node = newNode;
            return node;
        }

        if(data > node.data){
            node.right = insert(node.right, data);
        }else{
            node.left = insert(node.left, data);
        }

        return node;
    }


    // insert the new node 
    public void insert(int data){
        if(root == null){
            Node item = new Node(data);
            root = item;
            return;
        }

        Node addAt = searchNode(root, data);
        Node add = new Node(data);
        if(addAt.data <= data)
            addAt.right = add;
        else 
            addAt.left = add; 

    }

    // search for the node we have to insert the new node and return that node
    private Node searchNode(Node root, int data){
        Node node;
        if(data >= root.data){
            if(root.right == null)
                return root;
           
            node = searchNode(root.right, data);
        }
             
        else{
            if(root.left == null)
                return root;
        
            node = searchNode(root.left, data);
        }  

        return node;
    }


    public Node delete(Node node, int data){
        // if no such data is exist in the tree
        if(node == null)
            return node;
        else if(data > node.data)
            node.right = delete(node.right, data);
        else if(data < node.data)
            node.left = delete(node.left, data);
        else{ // we get the require node to delete

            // Case 1: leaf node(no child)
            if(node.left == null && node.right == null)
                node = null;   
            
            // Case 2: One child
            else if(node.left == null)
                node = node.right;  
            
            else if(node.right == null)
                node = node.left;
            
            // Case 3: Two child
            else{
                Node inOrderSuccessor = getSuccessor(node.right); // throuhgh smallest element from right
                // Node inOrderPredecessor = getPredecessor(node.left); // through largest element from left
                node.data = inOrderSuccessor.data;
                node.right = delete(node.right, inOrderSuccessor.data); 
            }      
        }

        return node;
    }

    // get the successor(smallest element in BST)
    public Node getSuccessor(Node node){
        if(node.left == null)
            return node;
        Node temp = getSuccessor(node.left);
        return temp;       
    }

    // get the Predecessor(Largest element in BST)
    public Node getPredecessor(Node node){
        if(node.right == null)
            return node;
        Node temp = getPredecessor(node.right);
        return temp;       
    }


    // Depth first search(DFS)
    // inOrder traversal
    public void inOrderTraversal(Node root){
        if(root == null)
            return;
            
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }
}
