package LinkedList.CircularlinkedList;

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        
        Node newNode = new Node();// Create a new node
        newNode.setData(data);// Set the data for the new node
        newNode.setNext(null);// Initialize the next pointer of the new node to null

        if (head == null) {
            head = newNode;// If the list is empty, set head to the new node
            head.setNext(head); // Point to itself to make it circular
        } else {
            //find the last node and point it to the new node
            Node temp = head;
            while (temp.getNext() != head) {// Traverse to the last node
                temp = temp.getNext();
            }
            //insert the new node at the end of the list
            temp.setNext(newNode);
            newNode.setNext(head); // Point new node to head to maintain circular structure
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if (head == null) {
            head = newNode;
            head.setNext(head); // Point to itself to make it circular
        } else {
            //find the last node and point it to the new node
            Node temp = head;
            while (temp.getNext() != head) {
                temp = temp.getNext();
            }
            //insert the new node at the end of the list
            temp.setNext(newNode);
            newNode.setNext(head); // Point new node to head to maintain circular structure
        }
    }

    public void inserAnywhere(int data, int position) {
        Node newNode = new Node(); 
        newNode.setData(data);
        newNode.setNext(null);

        if (position == 0) {
            insertAtBeginning(data); // Reuse the insertAtBeginning method
            return;
        }

        Node temp = head; // Start from the head
        for (int i = 0; i < position - 1; i++) {// Traverse to the node just before the desired position
            temp = temp.getNext();//  Move to the next node
            if (temp == head) {// If we have looped back to the head, the position is out of bounds
                System.out.println("Position out of bounds.");
                return;
            }
        }
        newNode.setNext(temp.getNext()); // Point the new node to the next node
        temp.setNext(newNode); // Point the previous node to the new node
    }

    public void deleteAtBeginning() {
        if (head == null) { // List is empty
            System.out.println("List is empty.");
            return;
        }
        if (head.getNext() == head) { // Only one node in the list
            head = null; // Only one node in the list
            return;
        }
        Node temp = head; // Start from the head
        while (temp.getNext() != head) {// Traverse to the last node
            temp = temp.getNext();// Move to the next node
        }
        temp.setNext(head.getNext()); // Point last node to the second node
        head = head.getNext(); // Update head to the second node
    }

    public void deleteAtEnd() { // List is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.getNext() == head) {
            head = null; // Only one node in the list
            return;
        }
        Node temp = head;// Start from the head
        while (temp.getNext().getNext() != head) {// Traverse to the second last node
            temp = temp.getNext();
        }
        temp.setNext(head); // Point second last node to head
    }


    public void display() {
        if (head == null) { // List is empty
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;// Start from the head
        do {// Traverse the list until we loop back to the head
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();// Move to the next node
        } while (temp != head);// Loop back to the head indicates we have traversed the entire list
        System.out.println();
    }   
}
