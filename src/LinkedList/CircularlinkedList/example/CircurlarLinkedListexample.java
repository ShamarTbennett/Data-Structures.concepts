package LinkedList.CircularlinkedList.example;

public class CircurlarLinkedListexample {
    private Node head;

    public CircurlarLinkedListexample() {
        this.head = null;
    }

    public void insert(int data){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if(head == null){
            head = newNode;
            head.setNext(head); // Point to itself to make it circular
        } else {
            //find the last node and point it to the new node
            Node temp = head;
            while(temp.getNext() != head){
                temp = temp.getNext();
            }
            //insert the new node at the end of the list
            temp.setNext(newNode);
            newNode.setNext(head); // Point new node to head to maintain circular structure
        }
    }
}
