package LinkedList.CircularlinkedList;

public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        
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
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.getNext();
            if (temp == head) {
                System.out.println("Position out of bounds.");
                return;
            }
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.getNext() == head) {
            head = null; // Only one node in the list
            return;
        }
        Node temp = head;
        while (temp.getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(head.getNext()); // Point last node to the second node
        head = head.getNext(); // Update head to the second node
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.getNext() == head) {
            head = null; // Only one node in the list
            return;
        }
        Node temp = head;
        while (temp.getNext().getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(head); // Point second last node to head
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
