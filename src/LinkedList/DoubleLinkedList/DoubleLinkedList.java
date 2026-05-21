package LinkedList.DoubleLinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

<<<<<<< HEAD
    // Insert at end
    public void insert(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {

            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);

            tail = newNode;
        }
    }


=======
    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }


    public void  insertsInDoubleLinkedList (int data){
        Node temp = new Node();
        temp.setData(data);
        temp.setNextNode(null);
        temp.setPreviousNode(null);
      
      if(head == null){
        head == temp;
      }else{
        
      }

    }
>>>>>>> 0557cd21da9c3657ee29708484c5f7e49ba969f5
}

