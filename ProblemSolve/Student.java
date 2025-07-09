package ProblemSolve;

import java.util.Scanner;

public class Student {
    int id;
    String name;

    void display(){
//        System.out.printf("student id:-" + id);
        System.out.printf("student name:-" + name);
        System.out.printf("\nstudent id:-" + id);
    }

    public static void main(String[] agrs){
        Scanner Student=new Scanner(System.in);
        Student s1=new Student();
//        System.out.printf("enter student id");
//        s1.id=Student.nextInt();

        System.out.printf("enter student name:-");
        s1.name=Student.nextLine();
        System.out.printf("enter student id:=");
        s1.id=Student.nextInt();
        s1.display();
    }
}
