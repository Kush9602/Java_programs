public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedListDemo myLL = new LinkedListDemo();

        for(int i = 1; i <= 10; i++)
            myLL.add(i);

        System.out.print("LL before reversal: ");
        myLL.print();
        System.out.println();

        myLL.reverse();
        System.out.print("LL after reversal: ");
        myLL.print();
    }
}
