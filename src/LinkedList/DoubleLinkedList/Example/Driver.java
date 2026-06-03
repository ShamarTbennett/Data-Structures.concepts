package LinkedList.DoubleLinkedList.Example;

public class Driver {

    public static void main(String[] args) {
        ExampleDoubleLinkedList list = new ExampleDoubleLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("The elements in the double linked list are:");
        list.display();

        list.insertatend(60);
        System.out.println("\nAfter inserting 60 at the end:");
        list.display();
    }
    
}
