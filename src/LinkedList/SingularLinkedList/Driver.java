package LinkedList.SingularLinkedList;

public class Driver {
    public static void main(String args[])
{
    LinkedList List = new LinkedList();
    
    List.InserAtFront(0);
    List.InserAtFront(18);
    List.InserAtFront(17);
    List.InserAtFront(10);

    List.display();

    List.deleteFromFront();
    List.display();

    List.deleteFromEnd();
    List.display();

    }
}
