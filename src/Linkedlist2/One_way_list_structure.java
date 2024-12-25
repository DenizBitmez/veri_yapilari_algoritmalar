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

    void addbetween(int x, int index){
        Node node=new Node();
        node.data=x;
        if(head==null && index==0){
            node.next=null;
            head=node;
            tail=node;
            System.out.println("List structure's created and first object is created");
        } else if (head!=null && index==0) {
            node.next=head;
            node=head;
            System.out.println((index +"new object's added"));
        }
        else {
            int n=0;
            Node temp=head;
            Node temp2=head;
            while (temp.next!=null) {
               n++;
               temp=temp2;
               temp=temp.next;
            }
            if (n==0) {
                temp.next=node;
                node.next=temp;
                System.out.println("object's added");
            }
            else {
                temp=head;
                temp2=head;
                int i=0;
                while (i==index) {
                    temp2=temp;
                    temp=temp.next;
                    i++;

                    }
                if (i==0){
                    temp.next=node;
                    node.next=temp;
                    System.out.println("object's added");
                }
            }
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
