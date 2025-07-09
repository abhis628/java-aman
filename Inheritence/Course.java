package Inheritence;

import java.util.Scanner;

public class Course {
    String coursename;
    Course(String coursename){
        this.coursename=coursename;
    }
    void showCourse(){
        System.out.println("course name:-" + coursename);
    }
}
class Enorollment extends Course{
    int rollno;
    String name;
    Enorollment(String coursename,int rollno,String name){
        super(coursename);
        this.rollno=rollno;
        this.name=name;
    }
    void showcourse(){
        super.showCourse();
        System.out.println("student roll no:-" + rollno);
        System.out.println("student name:-" + name);
    }
  public static void main(String[] asdf){
      Scanner a=new Scanner(System.in);
      System.out.printf("enter course name:-");
      String coursename=a.nextLine();
      System.out.printf("enter student roll no:-");
      int rollno=a.nextInt();
      a.nextLine();
      System.out.printf("enter student name:-");
      String name=a.nextLine();
      Enorollment s1=new Enorollment(coursename,rollno,name);
      s1.showcourse();

  }
}
