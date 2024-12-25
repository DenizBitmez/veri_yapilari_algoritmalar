package Linkedlist2;

import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        One_way_list_structure list = new One_way_list_structure();
        list.addFirst(82);
        list.addFirst(83);
        list.addLast(90);
        list.addLast(91);
        list.addbetween(50,3);
        list.addbetween(89,4);
        list.print();

    }
}
