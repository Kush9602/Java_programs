// DoublyList implementation with Generic 
public class MyDoublyLinkedList<E>{

    Node<E> head;
    Node<E> tail;

    // insert data at last index
    public void add(E data){
        Node<E> add = new Node<E>(data);
        if(head == null){
            head = add;
            tail=add;
            return;
        }

        Node<E> temp = head;
        while(temp.next != null)
            temp = temp.next;
        
        temp.next = add;
        add.previous = temp;
        tail = add;
    }

    // insert data at specific index
    public void addAt(int index, E data){
        Node<E> add = new Node<E>(data);
        if(index == 1){
            add.next = head;
            head.previous = add;
            head = add;
            return;
        }
        if(index == 0)
            return;

        Node<E> temp = head;
        for(int i = 0; i < index - 1; i++)
            temp = temp.next;
        
        if(temp.next != null){
            (temp.previous).next = add;
            add.previous = temp.previous;
            add.next = temp; 
            temp.previous = add;
        }
        else{
            temp.next = add;
            add.previous = temp;
            tail = add;
        }
        
    }

    //Deletion at the end
    public void remove(){
        Node<E> temp = tail.previous;
        temp.next = null;
        tail = temp;
    }   

    // deletion at the head(start)
    public void removeFirst(){
        Node<E> temp = head.next;
        temp.previous = null;
        head = temp;
    }

    // remove at the middle
    public void removeAt(int index){
        Node<E> temp = head;
        if(index == 0){
            System.out.println("Starting Index is 1.");
            return;
        }      
        else if(index == 1){
            temp = temp.next;
            temp.previous = null;
            head = temp;
            return;
        }
        
        for(int i = 0; i < index - 1; i++)
            temp = temp.next;
        
        if(temp.next == null){
            temp = temp.previous;
            temp.next = null;
            tail = temp;
        }
        else{
            (temp.previous).next = temp.next;
            (temp.next).previous = temp.previous; 
        }   
    }

    // reverse a Doubly Linked List
    public void reverse(){
        Node<E> temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
    }

    // print the elements of linked list
    public void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }        
    }


    static class Node<E>{
        E data;
        Node<E> previous;
        Node<E> next;

        public Node(E data){
            this.data = data;
            previous = null;
            next= null;
        } 
    }
}
