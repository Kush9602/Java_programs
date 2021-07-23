// level order traversal
import java.util.*;
public class BFSTreeTraversal {
    public static void main(String[] args){
        MyBinarySearchTree bst = new MyBinarySearchTree();
        MyBinarySearchTree.Node root = null;

        int[] arr = {12,3,1,23,75,31,5,2,8,7};
        for(int i = 0; i < arr.length; i++)
            root = bst.insert(root, arr[i]);

        // bst.inOrderTraversal(root);
        levelOrder(root);


    }

    // print node level by level
    static void levelOrder(MyBinarySearchTree.Node root){
        Queue<MyBinarySearchTree.Node> queue = new<MyBinarySearchTree.Node> LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            MyBinarySearchTree.Node temp = queue.poll();
            System.out.print(temp.data + " ");

            if(temp.left != null)
                queue.add(temp.left);

            if(temp.right != null)
                queue.add(temp.right);
            
        }
    }
}