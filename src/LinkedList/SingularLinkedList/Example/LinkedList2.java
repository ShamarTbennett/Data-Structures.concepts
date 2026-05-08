package LinkedList.SingularLinkedList.Example;

public class LinkedList2 {
    
    private Node head;

    public LinkedList2(){
        this.head = null;
    }

    public void infront(int d){
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



}
