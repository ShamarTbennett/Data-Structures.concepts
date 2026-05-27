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
        Node newNode = new Node(data);

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
            temp = temp.getPreviosNode();
        }


        System.out.println("null");
    }

}

