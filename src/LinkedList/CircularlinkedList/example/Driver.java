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
    }
}
