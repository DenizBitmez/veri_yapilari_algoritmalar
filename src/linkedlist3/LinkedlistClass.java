package linkedlist3;

public class LinkedlistClass {
    Node head=null;
    Node tail=null;

    void addFirst(int data) {
        Node newNode =new Node(data);
        if(head==null){
            System.out.println("Empty List");
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    void addLast(int data) {
        Node newNode1=new Node(data);
        if (head==null) {
            System.out.println("Empty List");
            head=newNode1;
            tail=newNode1;
        }
        else {
            tail.next=newNode1;
            newNode1.prev=tail;
            tail=newNode1;
        }
    }

    void print(){
        Node temp=tail;
        System.out.println("last ->");
        while (temp!=null) {
            System.out.println(temp.data+ " ->");
            temp=temp.prev;
        }
        System.out.println("first ->");
    }

    void printLast(){
        Node temp=head;
        System.out.println("bas ->");
        while (temp!=null) {
            System.out.println(temp.data+ " ->");
            temp=temp.prev;
        }
        System.out.println("son ->");
    }
}
