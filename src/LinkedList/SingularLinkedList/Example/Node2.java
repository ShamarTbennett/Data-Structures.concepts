package LinkedList.SingularLinkedList.Example;

public class Node2 {
    private int  data;
    private Node nextNode;

    public Node2(){
        this.data=0;
        this.nextNode= null;
    }

    public Node2(int d){
        this.data=d;
        this.nextNode=null;
    }

    public void setData(int d){
        this.data=d;
    }
    public int getData(){
        return data;
    }

    public void setNextNode(Node n){
        this.nextNode=n;
    }
    public Node getNextNode(){
        return nextNode;
    }

}
