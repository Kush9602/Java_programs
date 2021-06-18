public class QueueLinkedList<E>{

    Node<E> front;
    Node<E> rear;

    public void enQueue(E data){
        Node<E> add = new Node<E>(data);
        if(isEmpty()){
            front = add;
            rear = add;
            return;
        }
        rear.next = add;
        rear = add;
    }

    public E deQueue(){
        if(isEmpty()){
            System.out.println("Underflow");
            return null;
        }
        else if(front.equals(rear)){
            Node<E> frontElement = front;
            front = null;
            rear = null;
            return frontElement.data;
        }
        Node<E> curr = front;
        front = front.next;
        return curr.data;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Underflow - No element to print");
            return;
        }
        Node<E> temp = front;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if(front == null)
            return true;
        return false;
    }


    private class Node<E>{
        E data;
        Node next;

        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}