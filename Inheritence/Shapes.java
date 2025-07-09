package Inheritence;

import java.util.Scanner;

public class Shapes {
    void parimeter(){
        System.out.println("calculating perimeter");
    }
}
class Square extends Shapes{
    int side;
    Square(int side){
        this.side=side;
    }
    void parimeter(){
        super.parimeter();
        int square=4*side;
        System.out.println("parimeter of square:-" + square);
    }
  public static void main(String[] asdf){
      Scanner a=new Scanner(System.in);
      System.out.printf("enter side:-");
      int side=a.nextInt();
      Square s1=new Square(side);
      s1.parimeter();
  }
}
