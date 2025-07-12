package Encaposulation;

import java.util.Scanner;

public class Circle {
    private double redius;

    public Circle(double redius){
        this.redius=redius;
    }
    public double getRedius(){
        return redius;
    }
    public void setRedius(double redius) {
        if (redius >= 0) {
            this.redius = redius;
        } else {
            System.out.printf("invailid redius");
        }
    }
    public double getArea(){
        double area=(22/7)*redius*redius;
        return area;
    }
    public double getCircumference(){
        double circumference=2*(22/7)*redius;
        return circumference;
    }
    public double getDiameter(){
        double diameter=2*redius;
        return diameter;
    }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);
      System.out.printf("enter redius:-");
      double redius=s.nextDouble();
      Circle s1=new Circle(redius);
     double result=s1.getArea();
     System.out.println("Area= " + result);
     double result1=s1.getCircumference();
     System.out.println("circumference= " + result1);
      double result2=s1.getDiameter();
      System.out.println("diameter " + result2);

      System.out.printf("enter redius for update:-");
      double newredius=s.nextDouble();
      s1.setRedius(newredius);
      System.out.println("current redius:-" + s1.getRedius());

  }
}
