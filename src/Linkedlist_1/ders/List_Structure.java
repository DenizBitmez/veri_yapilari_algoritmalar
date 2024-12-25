package Linkedlist_1.ders;

public class List_Structure {

    Node head=null;
    Node tail=null;

    void add(int x){
        Node node=new Node(); //eklenecek olan düğüm
        node.data=x;
        node.next=head;

        if (head==null){
            head=node;
            tail=node;
            System.out.println("List's and object is created");
        }else{
            tail.next=node; //aon elemanın devamına next eklendi
            tail=node; //tail güncellendi
            System.out.println("List's last object is full");
        }
    }
    void print(){
        if (head==null){
            System.out.println("First object is null");
        }else {
            Node temp=head;
            System.out.println("first ->");
            while (temp!=null){
                System.out.println(temp.data + "->");
                temp=temp.next;
            }
            System.out.println("last ->");
        }
    }

}
