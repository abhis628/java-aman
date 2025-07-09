package Inheritence;

public class Person {
    void showdetails(){
        System.out.println("person details");
    }
}
class Student extends Person{
    void showdetails(){
        System.out.println("student details");
    }
  public static void main(String[] asdf){
        Student s1=new Student();
        s1.showdetails();
  }
}

