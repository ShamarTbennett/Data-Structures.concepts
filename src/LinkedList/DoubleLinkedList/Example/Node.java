package LinkedList.DoubleLinkedList.Example;

public class Node {
    private int data;
    private Node nextNode;
    private Node previousNode;

    public Node(){
        this.data = 0;
        this.nextNode = null;
        this.previousNode = null;
    }

    private Node(int d){
        this.data = d;
        this.nextNode = null;
        this.previousNode = null;
    }

    public void setdata(int d){
        this.data = d;
    }
    public int getdata(){
        return data;
    }


    public Node getNextNode(){
        return nextNode;
    }
    public void setNextNode(Node n){
        this.nextNode = n;
    }

    public void setPreviousNode(Node n){
        this.previousNode = n;
    }
    public Node getPreviousNode(){
        return previousNode;
    }
}
