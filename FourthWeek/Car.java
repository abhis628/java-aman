package FourthWeek;

import java.util.Scanner;

public class Car {
    String name;
    int year;
    Car(String name,int year){
        this.name=name;
        this.year=year;
    }
    void display(){
        System.out.println("car name:- " + name);
        System.out.println("car year:- " + year);
    }
    public static void main(String[] as){
        Scanner s=new Scanner(System.in);
        System.out.printf("enter name:-");
        String name=s.nextLine();
        System.out.printf("enter year:-");
        int year=s.nextInt();

        Car s1=new Car(name,year);
        Car s2=new Car(name,year);

        Car s3=s1;
        System.out.printf("car1==\n");
        s1.display();
        System.out.printf("car2==\n");
        s2.display();


    }
}
