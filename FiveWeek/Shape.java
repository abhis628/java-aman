package FiveWeek;

import java.util.Scanner;

public class Shape {
    void drow(){
        System.out.println("Drowing shape");
    }
}
class Circle extends Shape {
    @Override
    void drow(){
        System.out.println("drowing circle");
    }

    void drow(int redius){

        System.out.println("drawing circle of redius:-" + redius);
    }
}
class Rectangle extends Circle {
    void drow(){
        System.out.println("drawing rectangle");
    }
    public static void main(String[] as){
        Scanner a=new Scanner(System.in);
        Shape s1=new Shape();
        Circle s2=new Circle();
        Rectangle s3=new Rectangle();
        System.out.printf("enter redius:-");
        int redius=a.nextInt();
        s1.drow();
        s2.drow();
        s2.drow(redius);
        s3.drow();

    }
}

