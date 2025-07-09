package Poliymoephism;

import java.util.Scanner;

public class Greeter {
     void greet(){
         System.out.println("hello!");
     }
     void greet(String name){
         System.out.println("hello " + name);
     }
     void greet(String time,String name){
         System.out.println("good " + time +" "+ name);
     }
  public static void main(String[] as){
      Scanner a=new Scanner(System.in);
      System.out.printf("name:-");
      String name=a.nextLine();
      System.out.printf("time:-");
      String time=a.nextLine();
      Greeter s1=new Greeter();
      s1.greet();
      s1.greet(name);
      s1.greet(time,name);
  }
}
