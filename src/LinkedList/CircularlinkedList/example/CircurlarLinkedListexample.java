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
