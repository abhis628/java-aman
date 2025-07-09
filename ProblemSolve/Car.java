package ProblemSolve;

import java.util.Scanner;

public class Car {
    String name;
    String model;
    int year;
    String color;
    Car(String name,String model,int year,String color){
        this.name=name;
        this.model=model;
        this.year=year;
        this.color=color;
    }
    void display(){
        System.out.println("car name:-" + name);
        System.out.println("car model:-" + model);
        System.out.println("car manufacturing year:-" + year);
        System.out.println("car color:-" + color);
    }

 public static void main(String[] asd){
     Scanner a=new Scanner(System.in);
     System.out.printf("enter car name:-");
     String name=a.nextLine();
     System.out.printf("enter car model:-");
     String model=a.nextLine();
     System.out.printf("enter car manufacturing year:-");
     int year=a.nextInt();
     a.nextLine();
     System.out.printf("enter car color:-");
     String color=a.nextLine();
     Car s1=new Car(name,model,year,color);
     s1.display();
 }
}
