package LinkedList.CircularlinkedList;

public class Driver {
    
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(10);
        circularLinkedList.insert(20);
        circularLinkedList.insert(30);
        circularLinkedList.insert(40);

        System.out.println("Circular Linked List:");
        circularLinkedList.display();
    }
}
