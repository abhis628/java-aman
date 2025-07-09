package Inheritence;

import java.util.Scanner;

public class Empolyee {
    String name;
    Empolyee(String name){
        this.name=name;
    }
    void displayinfo(){
        System.out.println("empolyee name:-" + name);
    }
}
class Manager extends Empolyee{
    String department;
    Manager(String name,String department){
        super(name);
        this.department=department;
    }
   void displayinfo(){
        super.displayinfo();
        System.out.println("employee department:-" + department);
   }

public static void main(String[] asdd){
    Scanner a=new Scanner(System.in);
    System.out.printf("enter empolyee name:-");
    String name=a.nextLine();
    System.out.printf("enter department:-");
    String department=a.nextLine();
    Manager s1=new Manager(name,department);
    s1.displayinfo();
}
}
