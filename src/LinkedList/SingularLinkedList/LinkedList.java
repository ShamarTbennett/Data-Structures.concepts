package LinkedList.SingularLinkedList;
import LinkedList.SingularLinkedList.Node;

public class LinkedList {
    
    private Node Head;

    public LinkedList(){
        Head = null;
    }

    public void InserAtFront(int d){

        Node temp = new Node();
        temp.setData(d);
        temp.setNextNode(null);

        if(Head == null){
            Head = temp;
        }
        else{
            temp.setNextNode(Head);
            Head = temp;
        }
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
