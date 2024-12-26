package Linkedlist2;

import java.util.LinkedList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        One_way_list_structure list = new One_way_list_structure();
        int choice=1;
        int number,index;
        Scanner sc = new Scanner(System.in);
        while (choice!=0){
            System.out.println("1- add first");
            System.out.println("2- add last");
            System.out.println("3- add between");
            System.out.println("4- delete first");
            System.out.println("5- delete last");
            System.out.println("6- delete between");
            System.out.println("0- exit");
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            if (choice==1){
                System.out.println("Number:");
                number = sc.nextInt();
                list.addFirst(number);
            }
            else if (choice==2){
                System.out.println("Number:");
                number = sc.nextInt();
                list.addLast(number);
            }
            else if (choice==3){
                System.out.println("Number:");
                number = sc.nextInt();
                System.out.println("İndex");
                index = sc.nextInt();
                list.addbetween(number, index);
            }
            else if (choice==4){
                System.out.println("Number:");
                number = sc.nextInt();
                list.deleteFirst();
            }
            else if (choice==5){
                System.out.println("Number:");
                number = sc.nextInt();
                list.deletelast();
            }
            else if (choice==6){
                System.out.println("İndex:");
                index = sc.nextInt();
                list.deleteBetween(index);
            } else if (choice==0) {
                System.out.println("Exit's done.");
            }
            else {
                System.out.println("Wrong choice.");
            }
        }

    }
}
