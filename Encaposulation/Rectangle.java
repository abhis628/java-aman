package Encaposulation;

import java.util.Scanner;

public class Rectangle {
    private double leangth;
    private double width;

    public Rectangle(double leangth,double width){
        this.leangth=leangth;
        this.width=width;
    }
    public double getLeanth(){
        return leangth;
    }
   public void setLeangth(double leangth){
        if(leangth>=0){
            this.leangth=leangth;
        }
        else{
            System.out.printf("negative leangth");
        }
   }
   public double getWidth(){
        return width;
   }
   public void setWidth(double width){
        if(width>=0){
            this.width=width;
        }
        else{
            System.out.printf("invailid width");
        }
   }
   public double getArea(){
        double area=leangth*width;
        return area;
   }
   public double getParimeter(){
        double parimeter=2*(leangth+width);
        return parimeter;
   }
   boolean isSquare=false;
   boolean isSquare(){
        if(leangth==width){
           isSquare= true;
        }
       return isSquare;
   }
 public static void main(String[] as){
     Scanner s=new Scanner(System.in);
     System.out.printf("enter leangth:-");
     double leangth=s.nextDouble();
     System.out.printf("enter width:-");
     double width=s.nextDouble();

     Rectangle s1=new Rectangle(leangth,width);
     s1.getLeanth();
     System.out.printf("enter new leangth to update");
     double newleangth=s.nextDouble();
     s1.setLeangth(newleangth);
     s1.getWidth();
     System.out.printf("enter new width to update:-");
     double newwidth=s.nextDouble();
     s1.setWidth(newwidth);

    System.out.println("rectangle of area:- " + s1.getArea());
    System.out.println("rectangle of parimeter:- " + s1.getParimeter());
    System.out.println("square:-" + s1.isSquare());

 }
}
