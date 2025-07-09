package Poliymoephism;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    void printditail(String name,int age){
        System.out.println("student name:-" + name);
        System.out.println("student age:-" + age);
    }
    void  printditail(String name,int age,String course){
        System.out.println("student name:-" + name);
        System.out.println("student age:-" + age);
        System.out.println("student course:-" + course);
    }
    public static void main(String[] as){
        Scanner a=new Scanner(System.in);
        Student s1=new Student();
        System.out.printf("student name:-");
        String name=a.nextLine();
        System.out.printf("student age:-");
        int age=a.nextInt();
        s1.printditail(name,age);
         a.nextLine();
        System.out.printf("student name:-");
        String name1=a.nextLine();
        System.out.printf("student age:-");
        int age1=a.nextInt();
        a.nextLine();
        System.out.printf("student course:-");
        String course=a.nextLine();
        s1.printditail(name1,age1,course);
    }
}
