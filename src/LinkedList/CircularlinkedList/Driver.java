package LinkedList.CircularlinkedList;

public class Driver {
    
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertAtBeginning(10);
        circularLinkedList.insertAtBeginning(20);
        circularLinkedList.insertAtBeginning(30);
        circularLinkedList.insertAtBeginning(40);

        System.out.println("Circular Linked List:");
        circularLinkedList.display();

        circularLinkedList.insertAtEnd(50);
        System.out.println("\nCircular Linked List after inserting at the end:");
        circularLinkedList.display();

        circularLinkedList.inserAnywhere(25, 2);
        System.out.println("\nCircular Linked List after inserting 25 at position 2:");
        circularLinkedList.display();

        circularLinkedList.deleteAtBeginning();
        System.out.println("\nCircular Linked List after deleting at the beginning:");
        circularLinkedList.display();

        circularLinkedList.deleteAtEnd();
        System.out.println("\nCircular Linked List after deleting at the end:");
        circularLinkedList.display();
    }
}
