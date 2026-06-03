package LinkedList.DoubleLinkedList.Example;

public class Driver {

    public static void main(String[] args) {
        ExampleDoubleLinkedList list = new ExampleDoubleLinkedList();

       
        list.insert(10);
        list.insert(20);
        list.insert(70);
        list.insert(40);
        list.insert(50);

        System.out.println("The elements in the double linked list are:");
        list.display();

        list.insertatend(60);
        System.out.println("\nAfter inserting 60 at the end:");
        list.display();

        System.out.println("\nInserting 26 at position 0:");
        list.insertAnywhere(26, 0); // Insert 26 at position 0 (beginning)
        list.display();
        
        System.out.println("\nInserting 30 at position 1:");
        list.insertAnywhere(30, 1); // Insert 30 at position 1 (end)
        list.display();

        System.out.println("\nInserting 28 at position 1:");
        list.insertAnywhere(28, 1); // Insert 28 at position 1 (between 26 and 30)
        list.display();
    }
    
}
