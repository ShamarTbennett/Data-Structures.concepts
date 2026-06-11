package LinkedList.CircularlinkedList.example;

/**
 * CircularLinkedList - A data structure where each node points to the next node,
 * and the last node points back to the head, forming a circle.
 */
public class CircurlarLinkedListexample {
    private Node head;  // Reference to the first node in the list

    /**
     * Constructor - Initialize an empty circular linked list
     */
    public CircurlarLinkedListexample() {
        this.head = null;
    }

    /**
     * insert() - Adds a new element at the end of the circular linked list
     * @param data - The value to insert
     */
    public void insert(int data){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if(head == null){
            // List is empty - make this node the head
            head = newNode;
            head.setNext(head); // Point to itself to create the circular structure
        } else {
            // List is not empty - find the last node and insert new node at the end
            Node temp = head;
            while(temp.getNext() != head){
                // Traverse until we find the last node (whose next points to head)
                temp = temp.getNext();
            }
            // Insert the new node at the end
            temp.setNext(newNode);
            newNode.setNext(head); // Point new node back to head to maintain circular structure
        }
    }

    /**
     * anyPosition() - Inserts a new element at a specific position in the list
     * @param data - The value to insert
     * @param position - The position where the element should be inserted (1-based)
     */
    public void anyPosition(int data, int position){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if(position == 1){
            // Insert at the beginning (new head)
            if(head == null){
                // List is empty
                head = newNode;
                head.setNext(head); // Point to itself to make it circular
            } else {
                // List is not empty - find the last node
                Node temp = head;
                while(temp.getNext() != head){
                    temp = temp.getNext();
                }
                // Insert new node before current head
                temp.setNext(newNode);
                newNode.setNext(head);
                head = newNode; // Update head to the new node
            }
        } else {
            // Insert at a specific position (not at the beginning)
            Node temp = head;
            // Traverse to the position before the insertion point
            for(int i=1; i<position-1; i++){
                temp = temp.getNext();
                // Check if position is out of bounds
                if(temp == head){
                    System.out.println("Position out of bounds");
                    return;
                }
            }
            // Insert new node after temp
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }

    /**
     * delete() - Removes the first occurrence of a specific element from the list
     * @param data - The value to delete
     */
    public void delete(int data){
        if(head == null){
            // List is empty
            System.out.println("List is empty");
            return;
        }

        if(head.getData() == data){
            // The element to delete is the head node
            if(head.getNext() == head){
                // Only one node in the list - delete it
                head = null;
            } else {
                // Multiple nodes - find the last node and update its pointer
                Node temp = head;
                while(temp.getNext() != head){ // Traverse until we find the last node
                    temp = temp.getNext();
                }
                temp.setNext(head.getNext()); // Point last node to the second node
                head = head.getNext(); // Update head to the second node
            }
            return;
        }

        // Search for the element in the rest of the list
        Node current = head;
        Node previous = null;

        do {
            previous = current; // Keep track of the previous node
            current = current.getNext(); // Move to the next node
            if(current.getData() == data){ // Check if current node contains the data
                previous.setNext(current.getNext()); // Remove current node by bypassing it
                return;
            }
        } while(current != head);

        System.out.println("Element not found in the list.");
    }

    /**
     * search() - Searches for a specific element in the list
     * @param data - The value to search for
     */
    public void search(int data){
        if(head == null){
            // List is empty
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head; // Start from the head node
        do {
            if(temp.getData() == data){ // Check if current node contains the data
                // Element found
                System.out.println("Element found in the list.");
                return;
            }
            temp = temp.getNext();
        } while(temp != head);  // Stop when we loop back to head
        
        // Element not found after checking all nodes
        System.out.println("Element not found in the list.");
    }

    /**
     * display() - Prints all elements in the circular linked list
     */
    public void display(){
        if(head == null){
            // List is empty
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head; // Start from the head node
        do {
            System.out.print(temp.getData() + " "); // Print the data of the current node
            temp = temp.getNext();
        } while(temp != head);  // Stop when we loop back to head
        
        System.out.println();  // New line after printing all elements
    }

}
