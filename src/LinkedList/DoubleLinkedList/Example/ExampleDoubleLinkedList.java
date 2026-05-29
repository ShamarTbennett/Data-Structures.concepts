package LinkedList.DoubleLinkedList.Example;

public class ExampleDoubleLinkedList {
    
    private Node head;
    private Node tail;

    public ExampleDoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int data){
        //create a new node
        Node temp = new Node();

        //set data to incoming data
        temp.setdata(data);

        //set the head and tail to null
        temp.setNextNode(null);
        temp.setPreviousNode(null);

        //check if the list is empty
        if(head == null){
            // If list is empty, set both head and tail to the new node.
            //set head to the new node
            head = temp;
            //assign the new node a tail
            tail = temp;
        }else{
            // Append to the end and update links.
            tail.setNextNode(temp);
            temp.setPreviousNode(tail);
            tail = temp;
        }

    }
    



}
