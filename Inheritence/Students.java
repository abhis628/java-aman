package Inheritence;

import java.util.Scanner;

public class Students {
    String name;
    Students(String name){
        this.name=name;
    }
    void display(){
        System.out.println("student name:-" + name);
    }
}
class Marksheet extends Students{
    int math;
    int physics;
    int chemistry;
    Marksheet(String name,int math,int physics,int chemistry){
        super(name);
        this.math=math;
        this.physics=physics;
        this.chemistry=chemistry;
    }
    void display(int math,int physics,int chemistry){
        super.display();
        int mark=math+physics+chemistry;
        System.out.println("total mark:-" + mark);
    }
  public static void main(String[] asdf){

      Scanner a=new Scanner(System.in);
      System.out.printf("enter student name:-");
      String name=a.nextLine();
      System.out.printf("enter math mark:-");
      int math=a.nextInt();
      System.out.printf("enter physics mark:-");
      int physics=a.nextInt();
      System.out.printf("enter chemistry mark:-");
      int chemistry=a.nextInt();
      Marksheet s1=new Marksheet(name,math,physics,chemistry);
      s1.display(math,physics,chemistry);

  }
}
