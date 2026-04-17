package LinkedList.SingularLinkedList;


public class LinkedList {
    
    private Node Head;

    public LinkedList(){
        Head = null;
    }

    public void InserAtFront(int d){

        Node temp = new Node();     //first create a new node
        temp.setData(d);            //set the data to the created node
        temp.setNextNode(null);  // set next node to null

        //check if its the first node and set the incoming data as the new head if its empty
        if(Head == null){
            Head = temp; //set head to incoming data
        }
        else{ // if nodes already exist, create a new node and assign the new data to that node
            temp.setNextNode(Head);
            Head = temp;
        }
    }
 // Insert at end
    public void insertAtEnd(int d) {
        Node temp = new Node(d);

        if (Head == null) {
            Head = temp;
            return;
        }

        Node current = Head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        } 
        

        current.setNextNode(temp);
    }
     public void display() {
        Node current = Head;

        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }
}
