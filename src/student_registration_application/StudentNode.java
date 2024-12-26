package student_registration_application;

public class StudentNode {
    int student_id;
    String student_name;
    int student_age;
    int exam1;
    int exam2;
    double average;
    String status;
    StudentNode next;

    public StudentNode(int student_id, String student_name, int student_age, int exam1, int exam2) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
        this.exam1 = exam1;
        this.exam2 = exam2;
        average = (exam1*0.4) + (exam2*0.6) / 2;
        if (average>50){
            status = "Passed";
        }else {
            status = "Failed";
        }
        next=null;
    }
}
