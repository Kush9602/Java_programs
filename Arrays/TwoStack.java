// Implement two stack in one array
public class TwoStack {
    private int capacity;
    private int[] stack;
    int top1, top2;

    public TwoStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    public void push1(int data) {
        if (top1 + 1 != top2) {
            stack[++top1] = data;
        } else
            System.out.println("Stack1 is full!");
    }

    public void push2(int data) {
        if (top2 - 1 != top1) {
            stack[--top2] = data;
        } else
            System.out.println("Stack2 is full!");
    }

    public int pop1() {
        if (top1 != -1)
            return stack[top1--];
        else
            System.out.println("Stack1 is empty");
        return -1;
    }

    public int pop2() {
        if (top2 != capacity)
            return stack[top2++];
        else
            System.out.println("Stack2 is empty");
        return -1;
    }

    public void printStack1() {
        if (top1 == -1)
            System.out.println("Stack1 is empty");
        else {
            for (int i = 0; i <= top1; i++)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }

    public void printStack2() {
        if (top2 == capacity)
            System.out.println("Stack2 is empty");
        else {
            for (int i = capacity - 1; i >= top2; i--)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }
}
