package student_registration_application;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choice=1;
        StudentList studentList=new StudentList();
        while (choice!=0) {
            System.out.println("Computer programming student's registration application");
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Show all students");
            System.out.println("4.Successful students");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            if (choice==1) {
                studentList.add();
            }
            else if (choice==2) {
                studentList.delete();
            }
            else if (choice==3) {
                studentList.print();
            }
            else if (choice==4) {
                studentList.succesful_student();
            }
            else if (choice==5) {
                System.out.println("Program terminated");
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }
}
