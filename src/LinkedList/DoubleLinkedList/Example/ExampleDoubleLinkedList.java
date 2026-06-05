package LinkedList.DoubleLinkedList.Example;

public class ExampleDoubleLinkedList {
    
    private Node head;
    private Node tail;

    public ExampleDoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int data){
        //create a new node
        Node temp = new Node();

        //set data to incoming data
        temp.setdata(data);

        //set the head and tail to null
        temp.setNextNode(null);
        temp.setPreviousNode(null);

        //check if the list is empty
        if(head == null){
            // If list is empty, set both head and tail to the new node.
            //set head to the new node
            head = temp;
            //assign the new node a tail
            tail = temp;
        }else{
            // Append to the end and update links.
            tail.setNextNode(temp);
            temp.setPreviousNode(tail);
            tail = temp;
        }


    }
    
    public void insertatend(int data){
        Node temp = new Node();
        temp.setdata(data);
        temp.setNextNode(null);
        temp.setPreviousNode(null);

        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.setNextNode(temp);
            temp.setPreviousNode(tail);
            tail = temp;
        }
    }

    public void insertAnywhere(int data, int position){
        Node temp = new Node();
        temp.setdata(data);
        temp.setNextNode(null);
        temp.setPreviousNode(null);

        if (position == 0 || head == null) {
            insert(data);
            return;
        }else{
            Node current = head;
            int count = 0;

            while(current != null && count < position){
                current = current.getNextNode();
                count++;
            }

            if(current == null){
                tail.setNextNode(temp);
                temp.setPreviousNode(tail);
                tail = temp;
            }else{
                Node previous = current.getPreviousNode();

                previous.setNextNode(temp);
                temp.setPreviousNode(previous);
                
                temp.setNextNode(current);
                current.setPreviousNode(temp);
            }
        }
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.getdata() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }





 public void insertinto(int d){
    Node news = new Node();
    news.setdata(d);
    news.setNextNode(null);
    news.setPreviousNode(null);

    if( head == null){
        head = news;
        tail = news;
    }else{
        tail.setNextNode(news);
        news.setPreviousNode(tail);
        tail= news;
    }
 }
 




 
}
