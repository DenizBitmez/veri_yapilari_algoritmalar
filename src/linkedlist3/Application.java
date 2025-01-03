package linkedlist3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        LinkedlistClass linkedlist1 = new LinkedlistClass();
        linkedlist1.addFirst(10);
        linkedlist1.addLast(20);

        int choice=1, number, index;
        while (choice!=0){
            System.out.println("1-add first");
            System.out.println("2-add last");
            System.out.println("3-print last to first");
            System.out.println("4-add between");
            System.out.println("5-delete first");
            System.out.println("6-delete last");
            System.out.println("7-print");
            System.out.println("Your Choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

           if (choice==1){
               System.out.println("Number:");
               number = sc.nextInt();
               linkedlist1.addFirst(number);
           }
            if (choice==2){
                System.out.println("Number:");
                number = sc.nextInt();
                linkedlist1.addLast(number);
            }
            if (choice==3){
                System.out.println("Number:");
                number = sc.nextInt();
                linkedlist1.printLast();
            }
            if (choice==4){
                System.out.println("İndex:");
                index = sc.nextInt();
                System.out.println("Number:");
                number = sc.nextInt();
                linkedlist1.addBetween(index, number);
            }

            if (choice==5){
                linkedlist1.deleteFirst();
            }

            if (choice==6){
                linkedlist1.deleteLast();
            }

            linkedlist1.print();

        }
    }
}
