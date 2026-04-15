package LinkedList.SingularLinkedList.Example;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(int d){

        Node temp = new Node();
        temp.setData(d);
        temp.setNextNode(null);

        if(head == null){
            head = temp;
        }else{
            temp.setNextNode(head);
            head = temp;
        }
    }

    public void display(){
        Node current = head;

        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNextNode();
        }
        System.out.println("null");
    }
}
