public class MyQueue{

    private int size;
    private int queue[];
    public static int front;
    public static int rear;

    public MyQueue(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // complexity O(1)
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }

        if(isEmpty()){
            rear++;
            front++;
            queue[front] = data;
        }
        else{
            rear++;
            queue[rear] = data;
        }
    }

    // compexity O(n)
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        int frontElement = queue[front];
        if(front == rear){      // if only one element in the queue
            front--;
            rear--;
        }
        else{              
            for(int i = front; i < rear; i++)   // else shift every element towards front
                queue[i] = queue[i+1];
            rear--;
        }

        return frontElement;
    }

    public int peek(){
        return queue[front];
    }

    public void print(){
        if(front == -1){
            System.out.println("Underflow");
            return;
        }
        for(int i = rear; i >= front; i--)
            System.out.print(queue[i]+" ");
        System.out.println();
    }

    public boolean isFull(){
        if(rear == size - 1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if(front == -1)
            return true;
        return false;
    }
}