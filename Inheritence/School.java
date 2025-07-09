package Inheritence;

import java.util.Scanner;

public class School {
    String schoolname;
    School(String schoolname){
        this.schoolname=schoolname;
    }
    void showSchool(){
        System.out.println("school name:-" + schoolname);
    }
}
class Teacher extends School{
    String teachername;
    Teacher(String schoolname,String teachername){
        super(schoolname);
        this.teachername=teachername;
    }
    void showteacherifo(){
        super.showSchool();
        System.out.println("teacher name:-" + teachername);
    }
 public static void main(String[] asd){
     Scanner a=new Scanner(System.in);
     System.out.printf("enter school name:-");
     String schoolname=a.nextLine();
     System.out.printf("enter teacher name:-");
     String teachername=a.nextLine();
     Teacher s1=new Teacher(schoolname,teachername);
     s1.showteacherifo();
 }
}
