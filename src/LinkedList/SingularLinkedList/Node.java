package LinkedList.SingularLinkedList;

public class Node {
    
    private int Data;
    private Node NextNode;

    public Node(){
        Data = 0;
        NextNode = null;
    }

    public void setData(int data){
        Data = data;
    }
    public int getData(){
        return Data;
    }

    public void setNextNode(Node n){
        NextNode = n;
    }
    public Node getNextNode(){
        return NextNode;
    }
}
