package LinkedList.SingularLinkedList.Example;

public class Node {
    private int data;
    private Node nextNode;

    public Node(){
        this.data = 0;
        this.nextNode = null;
    }

    public Node(int d){
        this.data = d;
        this.nextNode = null;
    }


    public void setData(int d){
        this.data = d;
    }
    public int getData(){
        return data;
    }


    public Node getNextNode(){
        return nextNode;
    }
    public void setNextNode(Node n){
        this.nextNode = n;
    }
}
