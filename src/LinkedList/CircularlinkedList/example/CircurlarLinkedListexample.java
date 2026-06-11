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

    public void anyPosition(int data, int position){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if(position == 1){
            if(head == null){
                head = newNode;
                head.setNext(head); // Point to itself to make it circular
            } else {
                Node temp = head;
                while(temp.getNext() != head){
                    temp = temp.getNext();
                }
                temp.setNext(newNode);
                newNode.setNext(head);
                head = newNode; // Update head to the new node
            }
        } else {
            Node temp = head;
            for(int i=1; i<position-1; i++){
                temp = temp.getNext();
                if(temp == head){
                    System.out.println("Position out of bounds");
                    return;
                }
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }

    public void delete(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.getData() == data){
            if(head.getNext() == head){ // Only one node in the list
                head = null;
            } else {
                Node temp = head;
                while(temp.getNext() != head){
                    temp = temp.getNext();
                }
                temp.setNext(head.getNext()); // Point last node to the second node
                head = head.getNext(); // Update head to the second node
            }
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            previous = current;
            current = current.getNext();
            if(current.getData() == data){
                previous.setNext(current.getNext()); // Bypass the current node
                return;
            }
        } while(current != head);

        System.out.println("Element not found in the list.");
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        } while(temp != head);
        System.out.println();
    }

}
