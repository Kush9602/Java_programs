public class BSTFromPrePostOrder {

    public static void main(String[] args){
        Node rootPost = null;
        Node rootPre = null;

        int[] postOrder = {2,1,7,8,5,3,31,75,23,12};
        int[] preOrder = {12,3,1,2,5,8,7,23,75,31};

        rootPost = BSTfromPostOrder(postOrder, 0, 9);
        rootPre = BSTfromPreOrder(preOrder, 0, 9);

        inOrder(rootPost);
        System.out.println();
        inOrder(rootPre);
    }

    static Node BSTfromPostOrder(int[] arr, int start, int end){
        if(start > end)
            return null;

        Node root = new Node(arr[end]);


        int i;
        // get the index of element less then root node
        for(i = end - 1; i >= start; i--){
            if(arr[i] < arr[end])
                break;
        }

        root.left = BSTfromPostOrder(arr, start, i);
        root.right = BSTfromPostOrder(arr, i+1, end-1);

        return root;
    } 

    static Node BSTfromPreOrder(int[] arr, int start, int end){
        if(start > end)
            return null;

        Node root = new Node(arr[start]);

        int i;
        for(i = start+1; i <= end; i++){
            if(arr[i] > arr[start])
                break;
        }

        root.left = BSTfromPreOrder(arr, start+1, i-1);
        root.right = BSTfromPreOrder(arr, i, end);

        return root;
    }


    static void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static class Node {
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
        }
    }
}