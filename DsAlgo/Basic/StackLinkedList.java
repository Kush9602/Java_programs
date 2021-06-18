public class StackLinkedList<E> {

    Node<E> top;
    Node<E> head;

    public void push(E data){
        Node<E> add = new Node<E>(data);

        if(top == null){
            head = add;
            top = add;
            return;
        }

        top.next = add;
        top = add;
    }


    public E pop(){
        Node<E> pre = head;
        if(head == null){
            System.out.println("Stack is empty");
            return null;
        }
        else if(head.next == null){
            Node<E> element = head;
            top = null;
            head = null;
            return element.data;
        }

        Node<E> nextNode = head.next;

        while(nextNode.next != null){
            pre= pre.next;
            nextNode = nextNode.next;
        }

        top = pre;
        pre.next = null;

        return nextNode.data;
    }

    public E peek(){
        return top.data;
    }


    public void print(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    

    static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}
