package Interface;

import java.util.Scanner;

public interface Shape {

     double area();
     double parimeter();
}
class Circle implements Shape{

    private double redius;
    public Circle(double redius){
        this.redius=redius;
    }
    public double area(){
        double area=(22/7)*redius*redius;
        return area;
    }
    public double parimeter(){
        double parimeter=2*(22/7)*redius;
        return parimeter;
    }
}
class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double area(){
        double area=width*height;
        return area;
    }
    public double parimeter() {
        double parimeter = 2*(width + height);
        return parimeter;
    }
}
class Triangle implements Shape{
    private double A,B,C;

    public Triangle(double A,double B,double C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    public double area(){
        double s=parimeter()/2;
        double area=s*(s-A)*(s-B)*(s-C);
        return area;
    }
    public double parimeter(){
        double parimeter=A+B+C;
        return parimeter;
    }
   public static void main(String[] as){
       Scanner s=new Scanner(System.in);

       System.out.printf("enter redius:-");
       double redius=s.nextDouble();
       System.out.printf("enter width:-");
       double width=s.nextDouble();
       System.out.printf("enter height:-");
       double height=s.nextDouble();
       System.out.printf("enter A:-");
       double A=s.nextDouble();
       System.out.printf("enter B:-");
       double B=s.nextDouble();
       System.out.printf("enter C:-");
       double C=s.nextDouble();

       Circle s1=new Circle(redius);
       Rectangle s2=new Rectangle(width,height);
       Triangle s3=new Triangle(A,B,C);
       System.out.printf("area of circle= " +s1.area());
       System.out.printf("\nparimeter of circle= " + s1.parimeter());
       System.out.printf("\narea of rectangel= " + s2.area());
       System.out.printf("\nparimeter of rectangle= " + s2.parimeter());
       System.out.printf("\narea of triangle=" + s3.area());
       System.out.printf("\nparimeter of triangle=" + s3.parimeter());




   }
}