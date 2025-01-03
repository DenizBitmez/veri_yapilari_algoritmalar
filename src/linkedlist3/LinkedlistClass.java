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

    void addBetween(int index, int data){
        Node newNode2=new Node(data);
        if (head==null) {
            head=newNode2;
            tail=newNode2;
        }
        else if(head!=null &&index==0){
            newNode2.next=head;
            head.prev=newNode2;
            head=newNode2;
        }
        else{
            int n=0;
            Node temp=head;
            while (temp!=null){
                temp=temp.next;
                n++;
            }
            temp=head;
            if (index>n){
                tail.next=newNode2;
                newNode2.prev=tail;
                tail=newNode2;
            }
            else{
                int i=0;
                while (i!=index){
                    temp=temp.next;
                    i++;
                }
                newNode2.prev=temp.prev;
                temp.prev.next=newNode2;
                newNode2.next=temp;
                temp.prev=newNode2;
            }
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
