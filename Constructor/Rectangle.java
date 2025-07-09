package Constructor;

import java.util.Scanner;

public class Rectangle {
    float leanth;
    float breadth;

    Rectangle(float leanth,float breadth){
        this.leanth=leanth;
        this.breadth=breadth;
    }

    boolean compare(Rectangle r){
        float area1=this.leanth*this.breadth;
        float area2=r.leanth*r.breadth;

        return area1==area2;
    }
    public static void main(String[] asdf){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter leanth:-");
        float leanth=a.nextFloat();
        System.out.printf("enter bradth:-");
        float breadth=a.nextFloat();
        Rectangle s1=new Rectangle(leanth,breadth);

        System.out.printf("enter leanth1:-");
        float leanth1=a.nextFloat();
        System.out.printf("enter breadth1:-");
        float breadth1=a.nextFloat();
        Rectangle s2=new Rectangle(leanth1,breadth1);

        boolean result=s1.compare(s2);
        System.out.println(result);

    }
}
