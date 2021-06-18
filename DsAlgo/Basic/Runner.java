public class Runner {
    public static void main(String[] args){
        // MyDoublyLinkedList myDLL = new MyDoublyLinkedList();
        // LinkedListDemo myDLL = new LinkedListDemo();
        // MyStack stack = new MyStack(10);
        // StackLinkedList SLL = new StackLinkedList();
        // MyQueue que = new MyQueue(10);
        QueueLinkedList qll = new QueueLinkedList();


        for(int i = 1; i <= 1; i++)
            qll.enQueue(i);
        
        // for(int i = 0; i < 6; i++)
        //     System.out.println(stack.pop());
        // System.out.println(SLL.pop());
        qll.print();
        
        System.out.println(qll.deQueue());
        // System.out.println(qll.deQueue());
        // System.out.println(qll.deQueue());
        // System.out.println(qll.deQueue());
        qll.print();
        // que.enQueue(11);
        // que.print();
        // que.enQueue(11);

    }
}
