// create a balanced BST from sorted array
public class CreateBalancedBST {
    public static void main(String[] args){
        int[] arr = {1,2,4,7,9,12,25,28,31,36,40};

        Node root;

        root = CreateBalancedBST(arr, 0 , arr.length-1);
        // inOrder(root);
        System.out.print(isBalanced(root));
    }

    static Node CreateBalancedBST(int[] arr, int start, int end){
        if(start > end)
            return null;

        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);

        root.left = CreateBalancedBST(arr, start, mid-1);
        root.right = CreateBalancedBST(arr, mid+1, end);

        return root;
    }


    static boolean isBalanced(Node root){
        if(root == null)
            return true;

        boolean leftTree = isBalanced(root.left);
        boolean rightTree = isBalanced(root.right);
        if(leftTree == false || rightTree == false)
            return false;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1)
            return false;
        
        return true;
    }

    static int height(Node root){
        if(root == null)
            return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight > rightHeight)
            leftHeight++;
        else 
            rightHeight++;
        
        return Math.max(leftHeight, rightHeight);
    }


    static void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static class Node{
        int data;   
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }
}