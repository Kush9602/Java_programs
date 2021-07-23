public class Runner {
    public static void main(String[] args){
        int[] arr =  {15,20,5,6,27,35,25,1,17,2};
        // MyBinarytree tree= new MyBinarytree();
        // MyBinarytree.Node root = tree.createTree();
        MyBinarySearchTree bst = new MyBinarySearchTree();
        MyBinarySearchTree.Node root = null;

        // doing recursively(overloaded fun)
        for(int i = 0; i < arr.length; i++)
            root = bst.insert(root, arr[i]);

        // for(int i = 0; i < arr.length; i++)
        //     bst.insert(arr[i]);

        // MyBinarySearchTree.Node node = bst.getSuccessor(root.right);
        // System.out.println(node.data);
        // bst.inOrderTraversal(bst.root); 
        System.out.print("Before deletion: ");
        bst.inOrderTraversal(root);   // for recrusive fun 
        root = bst.delete(root, 35);
        System.out.println();
        System.out.print(" After deletion: ");
        bst.inOrderTraversal(root);

        
        // tree.in_orderTraversal(root);
        // System.out.println();
        // tree.pre_orderTraversal(root);
        // System.out.println();
        // tree.post_orderTraversal(root);   
    }
}