package student_registration_application;

import java.util.Scanner;

public class StudentList {
    Scanner sc = new Scanner(System.in);
    StudentNode head = null;
    StudentNode tail = null;
    int student_id;
    String student_name;
    int student_age;
    int exam1;
    int exam2;
    double average;
    String status;
    StudentNode next;
    int number;
    StudentNode temp=null;
    StudentNode temp2=null;

    void add(){
        System.out.println("Registration for computer students:");
        System.out.println("Student ID: "); student_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Student Name: "); student_name = sc.next();
        System.out.println("Student Age: "); student_age = sc.nextInt();
        System.out.println("Exam 1: "); exam1 = sc.nextInt();
        System.out.println("Exam 2: "); exam2 = sc.nextInt();

        StudentNode obj = new StudentNode(student_id, student_name, student_age, exam1, exam2);

        if (head == null) {
            head = obj;
            tail = obj;
            System.out.println("Registration list for computer students is done. First registration is created:");
        }
        else {
            obj.next = head;
            head = obj;
            System.out.println(student_id+ "student's registration is done.");
        }
    }

    void delete(){
        if (head == null) {
            System.out.println("There is nothing to delete");
        }
        else {
            System.out.println("Deleting student ıd number:");
            number = sc.nextInt();
            if (number == student_id&& head.next == null) {
                head = null;
                tail = null;
                System.out.println(student_id+ "student's deletion is done, there's not any students.");
            } else if (number == student_id && head.next != null) {
                head = head.next;
                System.out.println(student_id+ "student's deletion is done.");
            }
            else {
                temp=head;
                temp2=head;
                while (temp.next != null) {
                    if (student_id==temp.student_id) {
                        temp2.next=temp.next;
                        System.out.println(student_id+ "student's deletion is done.");
                    }
                    temp2=temp;
                    temp=temp.next;
                }
                if (number==temp.student_id){
                    temp2.next=null;
                    tail=temp2;
                    System.out.println(student_id+ "student's deletion is done.");
                }
            }
        }
    }

    void print(){
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            temp=head;
            while (temp != null) {
                System.out.println(temp.student_id+ "student's information..");
                System.out.println("************************************************");
                System.out.println("Student ID: "+temp.student_id);
                System.out.println("Student Name: "+temp.student_name);
                System.out.println("Student Age: "+temp.student_age);
                System.out.println("Exam 1: "+ temp.exam1);
                System.out.println("Exam 2: "+temp.exam2);
                System.out.println("Average: "+temp.average);
                System.out.println("Status: "+temp.status);
                System.out.println("**************************************************");
                temp=temp.next;
            }
        }
    }

    void succesful_student (){
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            temp=head;
            double big=temp.average;
            while (temp != null) {
                if (big<temp.average) {
                    big=temp.average;
                    student_id=temp.student_id;
                    student_name=temp.student_name;
                    student_age=temp.student_age;
                    exam1=temp.exam1;
                    exam2=temp.exam2;
                    average=temp.average;
                    status=temp.status;
                }
                temp=temp.next;
            }
            System.out.println("Successful student's information..");
            System.out.println("************************************************");
            System.out.println("Student ID: "+student_id);
            System.out.println("Student Name: "+student_name);
            System.out.println("Student Age: "+student_age);
            System.out.println("Exam 1: "+ exam1);
            System.out.println("Exam 2: "+exam2);
            System.out.println("Average: "+average);
            System.out.println("Status: "+status);
            System.out.println("**************************************************");
        }
    }
}
