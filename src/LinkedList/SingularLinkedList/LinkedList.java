package LinkedList.SingularLinkedList;
import LinkedList.SingularLinkedList.Node;

public class LinkedList {
    
    private Node Head;

    public LinkedList(){
        Head = null;
    }

    public void InserAtFront(int d){

        Node temp = new Node();
        if(temp != null){
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
        else{
            System.out.println("Memory full; Can't insert.");
        }
    }

}
