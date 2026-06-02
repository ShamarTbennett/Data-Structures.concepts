package LinkedList.CircularlinkedList;

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
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

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        } while (temp != head);
        System.out.println();
    }   
}
