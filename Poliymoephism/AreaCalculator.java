package Poliymoephism;

import java.util.Scanner;

public class AreaCalculator {
   int redius;
   int area(int redius){
       int area=22/7*redius*redius;
       return area;
   }
   int area(int leangth,int breadth){
       int area=leangth*breadth;
       return area;
   }
   double area(double base,double height){
       double area=(0.5)*base*height;
       return area;
   }
    public static void main(String[] as){
        Scanner a=new Scanner(System.in);
        AreaCalculator s1=new AreaCalculator();
        System.out.printf("enter redius:-");
        int redius=a.nextInt();
        int result=s1.area(redius);
        System.out.println("area of circle:-" + result);
        System.out.printf("\n");
        System.out.printf("enter laength:-");
        int leangth=a.nextInt();
        System.out.printf("enter breadth:-");
        int breadth=a.nextInt();
        int result1=s1.area(leangth,breadth);
        System.out.println("area of rectangle:-" + result1);
        System.out.printf("\n");
        System.out.printf("enter base:-");
        double base=a.nextDouble();
        System.out.printf("enter height:-");
        double height=a.nextDouble();
        double result2=s1.area(base,height);
        System.out.println("area of tringle:-" + result2);

    }
}
