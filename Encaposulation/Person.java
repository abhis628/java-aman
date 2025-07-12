package Encaposulation;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String mail;

     Person(String name,int age,String mail){
        this.name=name;
        this.age=age;
        this.mail=mail;
    }
    public void setName(String newname){
        name=newname;
    }
    public int getAge(){
         return age;
    }
    public void setAge(int age){
        if(age>0&&age<120) {
            this.age = age;
        }
        else{
            System.out.printf("invailid age");
        }
    }

    public String getName(){
        return name;
    }
    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
         if(mail.contains("@")){
             this.mail=mail;
         }
         else{
             System.out.printf("invailid mail");
         }
    }
    public String toString(){
         return "\n person detail\n name= " + name + " \n age= " + age + " \n mail= " + mail;
    }
    public static void main(String[] as){
        Scanner s=new Scanner(System.in);
        System.out.printf("name:-");
        String name=s.nextLine();
        System.out.printf("age");
        int age=s.nextInt();
        s.nextLine();
        System.out.printf("mail");
        String mail=s.nextLine();
        Person s1=new Person(name,age,mail);
        System.out.println(s1);
        System.out.printf("enter new age:-");
        int newage=s.nextInt();
        s1.setAge(newage);
        System.out.printf("current age " + s1.getAge());
         s.nextLine();
        System.out.printf("\nenter mail for update");
        String newmail=s.nextLine();
        s1.setMail(newmail);

        System.out.printf("\n");
        System.out.println(s1);
    }
}
