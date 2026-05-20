package LinkedList.DoubleLinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

    public void insertDoubleLinkedList(int data){
        Node temp = new Node();
        temp.setData(data);
        temp.setNextNode(null);
        temp.setPreviousNode(null);
      
    }
}

