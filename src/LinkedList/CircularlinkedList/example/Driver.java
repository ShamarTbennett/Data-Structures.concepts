package LinkedList.CircularlinkedList.example;

public class Driver {
    
    public static void main(String[] args) {
        CircurlarLinkedListexample circularList = new CircurlarLinkedListexample();
        circularList.insert(10);
        circularList.insert(20);
        circularList.insert(30);
        circularList.insert(40);

        System.out.println("Circular Linked List:");
        circularList.display();

        circularList.anyPosition(25, 3);
        System.out.println("Circular Linked List after inserting 25 at position 3:");
        circularList.display();

        circularList.delete(20);
        System.out.println("Circular Linked List after deleting 20:");
        circularList.display();

        System.out.println("Searching for 30 in the list:");
        circularList.search(30);

        System.out.println("Searching for 50 in the list:");
        circularList.search(50);

    }
}
