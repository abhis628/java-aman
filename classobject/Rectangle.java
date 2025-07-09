package classobject;

import java.util.Scanner;

public class Rectangle {

    double leanth;
    double width;

    Rectangle(double leanth,double width){
        this.leanth=leanth;
        this.width=width;
    }
    double Area(){
         double Area=width*leanth;
         System.out.printf("area of rectangle is:-" + Area);
         return Area;
    }
    double parimeter(){
        double parimeter=2*(width+leanth);
        System.out.printf("\nrectangle of parimeter is:-" +  parimeter);
        return parimeter;
    }
    void displayDimensions(){
        System.out.printf("\nleanth:-" + leanth);
        System.out.printf("\nwidth:-" + width);
    }

    public static void main(String[] agrs){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter leanth:-");
        double leanth=a.nextDouble();
        System.out.printf("enter width:-");
        double width=a.nextDouble();


        Rectangle s1=new Rectangle(leanth,width);
        double result=s1.Area();

        double Parimeter=s1.parimeter();
        s1.displayDimensions();

    }

}
