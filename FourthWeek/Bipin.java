package FourthWeek;

import java.util.Scanner;

public class Bipin {
    String name;
    String color;
    int year;
    double price;

    Bipin(){
        this.name=name;
        this.color=color;
    }
    Bipin(String name,int year,double price){
        this.name=name;
        this.year=year;
        this.price=price;
    }
    void display(){
        System.out.println("name:-" + name);
        System.out.println("color:-" + color);
        System.out.println("year:-" + year);
        System.out.println("price:-" + price);
    }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);
        Bipin s1=new Bipin();
        s1.display();
        Bipin s2=new Bipin("aman",2,134);
        s2.display();
  }
}
