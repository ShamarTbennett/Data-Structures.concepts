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

    public void insertAtStart(int d){
        Node temp = new Node();
        temp.setData(d);
        temp.setNextNode(null);
        temp.setNextNode(head);
        head = temp;
    }

    public void insertanywhere(int index, int d){
        Node temp = new Node();
        temp.setData(d);
        temp.setNextNode(null);

        if(index == 0){
            insertAtStart(d);
        }

        Node n = head;
        for(int i=0; i<index-1;i++){
            n = n.getNextNode();
        }

        temp.setNextNode(n.getNextNode());

        n.setNextNode(temp);
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
