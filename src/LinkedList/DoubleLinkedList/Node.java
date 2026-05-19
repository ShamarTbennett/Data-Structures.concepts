package LinkedList.DoubleLinkedList;

public class Node {
    private int data;
    private Node nextNode;
    private Node previousNode;

    public Node(){
        this.data = 0;
        this.nextNode = null;
        this.previousNode = null;
    }

    public Node(int d){
        this.data = d;
        this.nextNode = null;
        this.previousNode = null;
    }

}
