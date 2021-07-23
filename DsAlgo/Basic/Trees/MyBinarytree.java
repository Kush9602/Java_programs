import java.util.Scanner;
class MyBinarytree{
    static Scanner scan = new Scanner(System.in);
    
    public Node createTree(){
        Node root = null;
        System.out.println("Enter your data(-1 for no data): ");
        int data = scan.nextInt();

        if(data == -1)
            return null;
        
        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();
        
        return root;
    }

    public void in_orderTraversal(Node root){
        if(root == null)
            return;
        
        in_orderTraversal(root.left);
        System.out.print(root.data + " ");
        in_orderTraversal(root.right);
    }


    public void pre_orderTraversal(Node root){
        if(root == null)
            return;
        
        System.out.print(root.data + " ");
        pre_orderTraversal(root.left);
        pre_orderTraversal(root.right);
    }


    public void post_orderTraversal(Node root){
        if(root == null)
            return;
        
        post_orderTraversal(root.left);
        post_orderTraversal(root.right);
        System.out.print(root.data + " ");
    }


    private class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

}