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
            Node temp = head;
            while (temp.getNext() != head) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setNext(head); // Point new node to head to maintain circular structure
        }
    }
}
