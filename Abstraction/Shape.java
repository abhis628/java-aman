package Abstraction;

import java.util.Scanner;

abstract class Shape {
    protected String name;

    public Shape(String name){
        this.name=name;
    }
    public abstract double area();
    @Override
   public String toString(){
       return "shape " + name + "area " + area();
   }
}
class Circle extends Shape{
    private  double redius;

    public Circle (double redius){
        super("Circle");
        this.redius=redius;
    }
    public double area(){
        double area=(22/7)*redius;
        return area;
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        super("Rectangle");
        this.width=width;
        this.height=height;
    }
    public double area(){
        double area=width*height;
        return area;
    }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);
      System.out.printf("redius: ");
      double redius=s.nextDouble();
      System.out.printf("width: ");
      double width=s.nextDouble();
      System.out.printf("height: ");
      double height=s.nextDouble();

      Circle s1=new Circle(redius);
      Rectangle s2=new Rectangle(width,height);
      System.out.println("area of circle:-" + s1);
      System.out.println("area of circle:-" + s2);
  }
}
