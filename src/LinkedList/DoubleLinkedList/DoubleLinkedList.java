package LinkedList.DoubleLinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

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


}
