package LinkedList.DoubleLinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

     // Constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }



    // Insert at end
    public void insert(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {

            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);

            tail = newNode;
        }

    }

    // Display forward
    public void displayForward() {

        Node temp = head;

        System.out.println("Forward:");

        while (temp != null) {
            System.out.print(temp.getdata() + " <-> ");
            temp = temp.getNextNode();
        }

        System.out.println("null");
    }

    // Display backward
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

