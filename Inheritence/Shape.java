package Inheritence;

import java.util.Scanner;

public class Shape {
   void area(){
       System.out.println("Calculeting area");
    }
}
class Rectangle extends Shape{
    int leangth;
    int breadth;
    void area(int leangth,int breadth){
        int Area=leangth*breadth;
        System.out.println("Area of rectangle:-" + Area);
    }
   public static void main(String[] asdf){
        Rectangle s1=new Rectangle();
       Scanner a = new Scanner(System.in);
       System.out.printf("enter leangth:-");
       int leangth=a.nextInt();
       System.out.printf("enter breadth:-");
       int breadth=a.nextInt();
       s1.area(leangth,breadth);

   }
}
