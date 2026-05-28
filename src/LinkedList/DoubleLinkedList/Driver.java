package LinkedList.DoubleLinkedList;

public class Driver {
    

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.displayForward();
        list.displayBackward();
    }
}
