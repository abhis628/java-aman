package Encaposulation;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
public void setName(String newname){
    this.name=newname;
}
public void setAge(int newage){
    age=newage;
}
 public String getName(){
    return name;
 }
 public int getAge(){
   return age;
 }
    public static void main(String[] as){
     Student s1=new Student();
        Scanner a=new Scanner(System.in);
        String name=a.nextLine();
        int age=a.nextInt();
        s1.setName(name);
        s1.setAge(age);
        String  result=s1.getName();
        System.out.println("name " + result);
        int age1=s1.getAge();
        System.out.println("age " + age1);

    }
}
