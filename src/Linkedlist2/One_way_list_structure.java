package Linkedlist2;

public class One_way_list_structure {
    Node head=null;
    Node tail=null;

    void addFirst(int x){
        Node node=new Node();
        node.data=x;

        if(head==null){
            node.next=null;
            head=node;
            tail=node;
            System.out.println("List structure's created and first object is created");
        }else {
            node.next=head;
            head=node;
            System.out.println("Front row is full. ");
        }
    }

    void addLast(int x){
        Node node=new Node();
        node.data=x;
        if(head==null){
            node.next=null;
            tail=node;
            System.out.println("List structure's created and last object is created");
        }
    }

    void print(){
        if(head==null){
            System.out.println("List structure is empty");
        }else {
            Node temp=head;
            System.out.println("first ->");
            while(temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("last ->");
        }
    }

}
