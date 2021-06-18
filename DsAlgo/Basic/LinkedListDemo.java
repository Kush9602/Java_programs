// This Class is Generic for Singly LinkedList
public class LinkedListDemo<E> {

    Node<E> head;
    Node<E> tail;

    // insertion at the end
    public void add(E data){
        Node<E> add = new Node<E>(data);

        if(head == null){
            head = add;
            return;
        }

        Node<E> temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = add;
        tail = temp.next;
    }

    // insertion at the middle
    public void addAt(int index, E data){
        Node<E> add = new Node<E>(data);
        if(index == 1){
            add.next = head;
            head = add;
            return;
        }
        if(index == 0){
            System.out.println("NoSuchIndex");
            return;
        }
        Node<E> temp = head;
        for(int i = 0; i < index - 2; i++)
            temp = temp.next;

        if(temp.next != null){
            add.next = temp.next;
            temp.next = add;
        }
        
    }

    // insertion at the head(start)
    public void addFirst(E data){
        Node<E> add = new Node<E>(data);
        add.next = head;
        head = add;
    }

    // deletion at the end
    public void remove(){
        if(head == null){
            System.out.println("List is empty");
            return;
        } 
        Node<E> temp = head;
        while(temp.next != tail)
            temp = temp.next;
        temp.next = null;
    }

    // deletion at the start
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }         
        Node<E> temp = head;
        head = temp.next;
        temp.next = null;
    }

    // remove at the middle
    public void removeAt(int index){
        Node<E> temp = head;
        for(int i = 0; i < index - 1; i++)
            temp = temp.next;
        temp.next = (temp.next).next;
        
    }

    // replace 
    public void set(int index, E data){
        Node<E> temp = head;
        for(int i = 0; i < index - 1; i++)
            temp = temp.next;
        temp.data = data;
    }

    // get the data at the end
    public E get(){
        Node<E> temp = head;
        while(temp.next != null)
            temp = temp.next;

        return temp.data;
    }

    // get the data at the required index
    public E getAt(int index){
        Node<E> temp = head;
        for(int i = 0; i < index - 1; i++)
            temp = temp.next;
    
        return temp.data;
    }
    

    public int size(){
        int size = 0;
        Node<E> temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    // print the elements of linked list
    void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
            
    }

    // reverse a linked list
    public void reverse(){
        Node<E> current = head;
        Node<E> temp = null;
        Node<E> nextNode = current.next;

        while(nextNode != null){
            current.next = temp;    
            temp = current;
            current = nextNode;
            nextNode = nextNode.next;
        }
        current.next = temp;
        head = current;
    }

    // create a node of the linked list
    static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}
