package linkedList;

public class SinglyLinkedList {

    Node head;
    Node tail;

    int size=0;


    public void createLinkedList(int value){
       Node node=new Node(value);
        if(head==null){
            head=node;
            size++;
        }else{
            tail=node;
            size++;
        }

    }
}
