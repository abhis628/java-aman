package Poliymoephism;

import java.util.Scanner;

public class Volumecalculator {

    void volume(int side){
        int cube=side*side*side;
        System.out.println("volume of cube:- " + cube);
    }
    void volume(int leangth,int breadth,int height){
        int cuboid=leangth*breadth*height;
        System.out.println("volume of cuboid:-" + cuboid);
    }
    void volume(int redius,int height1){
        double cylinder=22/7*redius*redius*height1;
        System.out.println("volume of cylinder:-" + cylinder);
    }
   public static void main(String[] as){
       Scanner a=new Scanner(System.in);
       Volumecalculator s1=new Volumecalculator();
       System.out.printf("enter side:-");
       int side=a.nextInt();
       System.out.printf("enter leangth:-");
       int leangth=a.nextInt();
       System.out.printf("enter breadth:-");
       int breadth=a.nextInt();
       System.out.printf("enter height:-");
       int height=a.nextInt();
       System.out.printf("enter redius:-");
       int redius=a.nextInt();
       System.out.printf("enter height:-");
       int height1 =a.nextInt();
       s1.volume(side);
       s1.volume(leangth,breadth,height);
       s1.volume(redius, height1);

   }
}
