import java.util.Scanner;
public class HeapTree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many element you wanna insert in your heap: ");
        int n = scan.nextInt();
        int[] arr =  new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter " + i + " element: ");
            int data = scan.nextInt();
            insert(arr, i, data);
        }

        levelOrder(arr);
        System.out.println();
        // inOrder(arr, 0);
        
        int maxElement = extractMax(arr);

        System.out.print("Heap after deleting: ");
        for(int i = 0; i < n-1; i++)
            System.out.print(arr[i] + " ");

    }


    static void insert(int[] arr, int index, int data){
        arr[index] = data;
        
        while(index > 0){
            int parent = (index-1)/2;

            if(arr[index] > arr[parent]){
                swap(arr, index, parent);
            }

            index = parent;
        }
    }

    // remove max element from the heap(i.e root element)
    static int extractMax(int[] arr){
        int root = arr[0];
        arr[0] = arr[arr.length - 1];

        int parent = 0;
        while(isLeftChild(arr, parent)){
            int leftChild = 2 * parent + 1;
            int rightChild = 2 * parent + 2;
            int nextParent;

            if(rightChild < arr.length - 1){
                nextParent = arr[leftChild] > arr[rightChild] ? leftChild : rightChild;
                swap(arr, parent, nextParent);
            }
            else{
                swap(arr, parent, leftChild);
                nextParent = leftChild;
            }

            parent = nextParent;
        }

        return root;
    }


    static boolean isLeftChild(int[] arr, int parent){
        int leftChild = 2*parent+1;
        if(leftChild < arr.length - 1)
            return true;
        return false;
    }


    static void inOrder(int[] arr, int root){
        if(root > arr.length - 1){
            return;
        }

        inOrder(arr, 2*root+1);
        System.out.print(arr[root] + " ");
        inOrder(arr, 2*root+2);
    }


    static void levelOrder(int[] arr){
        System.out.print("Level-Order traversal: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


    static void swap(int[] arr, int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}