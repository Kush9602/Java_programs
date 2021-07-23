public class Runner {
    public static void main(String[] args){
        // MyDoublyLinkedList myDLL = new MyDoublyLinkedList();
        // LinkedListDemo myDLL = new LinkedListDemo();
        // MyStack stack = new MyStack(10);
        // StackLinkedList SLL = new StackLinkedList();
        // MyQueue que = new MyQueue(10);
        // QueueLinkedList qll = new QueueLinkedList();
        // CircularQueue qll = new CircularQueue(10);
        PriorityQueue pq = new PriorityQueue(4);

        pq.add(45);
        pq.add(12);
        pq.add(1);
        pq.add(100);

        pq.print();

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        // for(int i = 1; i <= 3; i++)
        //     qll.enQueue(i);
        
        // for(int i = 0; i < 6; i++)
        //     System.out.println(stack.pop());
        // System.out.println(SLL.pop());
        // qll.print();
        
        // System.out.println(qll.deQueue());
        // System.out.println(qll.deQueue());
        // System.out.println(qll.deQueue());
        // System.out.println(qll.deQueue());
        // qll.print();
        // qll.enQueue(11);
        // qll.enQueue(12);
        // qll.enQueue(13);
        // qll.enQueue(14);
        // qll.enQueue(15);
        // qll.print();

    }
}
