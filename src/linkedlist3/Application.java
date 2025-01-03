package linkedlist3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        LinkedlistClass linkedlist1 = new LinkedlistClass();
        linkedlist1.addFirst(10);
        linkedlist1.addLast(20);

        int choice=1, number;
        while (choice!=0){
            System.out.println("1-add first");
            System.out.println("2-add last");
            System.out.println("3-print");
            System.out.println("4-print last to first");
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

            linkedlist1.print();

        }
    }
}
