// creating a stack using Array
public class MyStack {

    private int capacity;
    private int stack[];
    public static int top; 

    // Constructor initialize the defalt values
    public MyStack(int size){
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    //Insert the item into the stack
    public void push(int data){
        if(isFull()){
            // System.out.println("Stack if full.");
            // System.exit(1); 
            return ;
        }
        top++;
        stack[top] = data;
    }

    // return top of the stack and remove top element
    public int pop(){
        if(isEmpty())
            return -1;
            
        return stack[top--];
    }

    //retur top element of the stack but not remove it
    public int  peek(){
        if(isEmpty()){
            System.out.println("Stack if Empty");
            System.exit(1); 
        }
        return stack[top];
    }

    // print elements in the stack
    public void printStack(){
        for(int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");
    }


    // check if stack is empty or not
    public boolean isEmpty() {
        return top == -1;       
    }

    // check if stack is full or not
    public boolean isFull(){
        return top == capacity - 1;       
    }

}
