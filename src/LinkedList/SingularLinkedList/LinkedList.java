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

    public void InserAtStart(int d){
        Node temp = new Node();     //first create a new node
        temp.setData(d);            //set the data to the created node
        temp.setNextNode(null);  // set next node to null
        temp.setNextNode(Head);    // set the next node to the head, which is null

        Head = temp; // set the current head to the new created node
    }

    public void insertAnyWhere(int index, int d){
        Node temp = new Node();     //first create a new node
        temp.setData(d);            //set the data to the created node
        temp.setNextNode(null);  // set next node to null

        if(index == 0){ //check if the index is zero and just called a method thatdoes that already
            InserAtStart(d);
        }

       // Start from the head of the linked list
        Node n = Head;

        // Traverse the linked list until reaching the node
        // just before the desired insertion position
        for(int i = 0; i < index - 1; i++) {
            n = n.getNextNode();
        }

        // Make the new node point to the next node in the list
        // This preserves the rest of the linked list
        temp.setNextNode(n.getNextNode());

        // Link the previous node to the new node
        // The new node is now inserted into the list
        n.setNextNode(temp);

    }


   // Insert a new node at the end of the linked list
    public void insertAtEnd(int d) {

        // Create a new node with the given data
        Node temp = new Node(d);

        // Check if the list is empty
        // If empty, make the new node the head
        if (Head == null) {
            Head = temp;
            return;
        }

        // Start traversing from the head
        Node current = Head;

        // Move through the list until reaching the last node
        // The last node's next pointer will be null
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        } 
        
        // Link the last node to the new node
        current.setNextNode(temp);
    }



    // Delete the first node from the linked list
    public void deleteFromFront() {

        // Check if the list is empty
        if (Head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Move the head pointer to the next node
        // The first node is automatically removed
        Head = Head.getNextNode();
    }



    // Delete the last node from the linked list
    public void deleteFromEnd() {

        // Check if the list is empty
        if (Head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Check if the list contains only one node
        // If so, set head to null
        if (Head.getNextNode() == null) {
            Head = null;
            return;
        }

        // Start traversing from the head
        Node current = Head;

        // Traverse until reaching the second-to-last node
        // Stop when the next node's next pointer is null
        while (current.getNextNode().getNextNode() != null) {
            current = current.getNextNode();
        }

        // Remove the last node by setting the second-to-last
        // node's next pointer to null
        current.setNextNode(null);
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
