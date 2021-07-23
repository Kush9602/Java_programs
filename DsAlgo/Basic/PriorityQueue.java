// priority queue is just a heap

public class PriorityQueue {
    int size;
    int queue[];
    int top;

    public PriorityQueue(int size){
        this.size = size;
        queue = new int[size];
        top = -1;
    }

    // insert element in Priority Queue(Min Heap)
    // Add element one by one   (Time Complexity - O(log n)  )
    public void add(int data){
        if(top >= size - 1){
            System.out.println("Priority Queue is Full");
            return;
        }

        queue[++top] = data;

        int index = top;
        while(index > 0){
            int parent = (index - 1)/2;
            if(queue[top] < queue[parent])
                swap(queue, top, parent);
                
              index = parent;
        }
    }


    // pull root element(smallest element)
    // Time Complexity - O(log n)
    public int remove(){
        if(top < 0){
            System.out.println("Priority Queue is Empty");
            return -1;
        }

        int root = queue[0];
        swap(queue, top, 0);
        top--;

        int parent = 0;
        while((2*parent)+1 <= top && parent <= top){
            int leftChild =  (2*parent)+1;
            int rightChild =  (2*parent)+2;
            int minChild;

            if(rightChild <= top)
                minChild = queue[leftChild] > queue[rightChild] ? rightChild : leftChild;

            else
                minChild = leftChild;
                 
            if(queue[parent] > queue[minChild])
                swap(queue, parent, minChild);
            parent = minChild;
        }
        
        return root;
    }


    public void print(){
        for(int i = 0; i <= top; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    private void swap(int[] arr, int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

}