package Inheritence;

import java.util.Scanner;

public class College {
    String collegename;
    College(String collegename){
        this.collegename=collegename;
    }
}
class Admission extends College{
    String studentname;
    String course;
    Admission(String collegename,String studentname,String course){
        super(collegename);
        this.studentname=studentname;
        this.course=course;
    }
    void display(){
        System.out.println("college name:-" + collegename);
        System.out.println("student name:-" + studentname);
        System.out.println("course:-" + course);
    }
 public static void main(String[] as){
     Scanner a=new Scanner(System.in);
     System.out.printf("enter college name:-");
     String collegename=a.nextLine();
     System.out.printf("enter student name:-");
     String studentname=a.nextLine();
     System.out.printf("enter course:-");
     String course=a.nextLine();
     Admission s1=new Admission(collegename,studentname,course);
     s1.display();
 }
}
