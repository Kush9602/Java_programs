public class CircularQueue {
    
    private int capacity;
    private int queue[];
    private int front;
    private int rear;

    public CircularQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enQueue(int data){
        if(front == -1){
            front++;
            rear++;
            queue[front] = data;
            return;
        }
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        else{
            rear = (rear+1)%capacity;
            queue[rear] = data;
            // if(rear+1 == capacity){
            //     rear = 0;
            //     queue[rear] = data;
            // }
            // else{
            //     rear++;
            //     queue[rear] = data;
            // }
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        else if(front == rear){
            int curr = queue[front];
            front = -1;
            rear = -1;
            return curr;
        }
        else{
            int curr = queue[front];
            front = (front+1)%capacity;
            return curr;
        }
    }


    public void print(){
        if(isEmpty()){
            System.out.println("UnderFlow : No element to print");
            return;
        }
        int f = front;
        int r = rear;
        while(f != r){
            System.out.print(queue[f] + " ");
            f = (f+1)%capacity;
        }
        System.out.println(queue[f]);
    }

    public boolean isFull(){
        if((rear+1)%capacity == front)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if(front == -1)
            return true;
        return false;
    }
}