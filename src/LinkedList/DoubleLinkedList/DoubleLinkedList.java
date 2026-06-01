package LinkedList.DoubleLinkedList;

/**
 * A simple doubly linked list implementation with head and tail pointers.
 * Supports insertion at the end and traversal in both forward and backward directions.
 */
public class DoubleLinkedList {
    private Node head;
    private Node tail;

    /**
     * Initializes an empty doubly linked list.
     */
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }



    /**
     * Inserts a new node with the given data at the end of the list.
     * @param data the value to store in the new node
     */
    public void insert(int data) {
        //creating a new node
        Node newNode = new Node();
        newNode.setdata(data);
        newNode.setNextNode(null);
        newNode.setPreviousNode(null);

        // If list is empty, set both head and tail to the new node.
        if (head == null) {
            //set head to the new node
            head = newNode;
            //assign the new node a tail
            tail = newNode;
        } else {
            // Append to the end and update links.
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        }
    }

    public void insertAtFront(int data) {
        // Create a new node with the given data
        Node newNode = new Node();
        newNode.setdata(data);
        newNode.setNextNode(null);
        newNode.setPreviousNode(null);

        // If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Link the new node to the current head
            newNode.setNextNode(head);
            head.setPreviousNode(newNode);
            head = newNode; // Update head to the new node
        }
    }

    public void insertAtBack(int data) {
        // Create a new node with the given data
        Node newNode = new Node();
        newNode.setdata(data);
        newNode.setNextNode(null);
        newNode.setPreviousNode(null);

        // If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Link the current tail to the new node
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode; // Update tail to the new node
        }
    }

    public void insertAtPosition(int data, int position) {
        // Create a new node with the given data
        Node newNode = new Node();
        newNode.setdata(data);
        newNode.setNextNode(null);
        newNode.setPreviousNode(null);
        // If inserting at the front (position 0), use insertAtFront
        if (position == 0) {
            insertAtFront(data);
            return;
        }   
        // Traverse to the position where the new node will be inserted
        Node temp = head;
        int currentPosition = 0;
        while (temp != null && currentPosition < position) {
            temp = temp.getNextNode();
            currentPosition++;
        }
        // If temp is null, we are at the end of the list, so insert at back
        if (temp == null) {
            insertAtBack(data);
            return;
        }

        // Link the new node to the current node and its previous node
        newNode.setNextNode(temp);
        newNode.setPreviousNode(temp.getPreviousNode());
        // Link the previous node to the new node
        if (temp.getPreviousNode() != null) {
            temp.getPreviousNode().setNextNode(newNode);
        } else {
            // If the new node is being inserted at the front, update head
            head = newNode;
        }
    }


        // Delete the first node from the linked list
    public void deleteFromFront() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Move the head pointer to the next node
        // The first node is automatically removed
        head = head.getNextNode();

        // If the new head is not null, set its previous pointer to null
        if (head != null) {
            head.setPreviousNode(null);
        } else {
            // If the list becomes empty, also set tail to null
            tail = null;
        }
    }


    // Delete the last node from the linked list
    public void deleteFromBack() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Check if the list contains only one node
        // If so, set head and tail to null
        if (head.getNextNode() == null) {
            head = null;
            tail = null;
            return;
        }

        // Move the tail pointer to the previous node
        tail = tail.getPreviousNode();
        tail.setNextNode(null); // Set the new tail's next pointer to null
    }



    /**
     * Prints list data from head to tail.
     */
    public void displayForward() {

        Node temp = head;
        System.out.println("Forward:");

        while (temp != null) {
            System.out.print(temp.getdata() + " <-> ");
            temp = temp.getNextNode();
        }

        System.out.println("null");
    }

    /**
     * Prints list data from tail to head.
     */
    public void displayBackward() {


        Node temp = tail;
        System.out.println("Backward:");

        while (temp != null) {
            System.out.print(temp.getdata() + " <-> ");
            temp = temp.getPreviousNode();
        }


        System.out.println("null");
    }

}

