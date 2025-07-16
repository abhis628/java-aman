package Abstraction;

import java.util.Scanner;

abstract class Employee {
    private String name;
    public Employee(String name){
        this.name=name;
    }
    abstract double calculateSalary();
    public String getName(){
        return name;
    }
}
class FullTime extends Employee {
      public FullTime(String name){
          super(name);
      }

    public double calculateSalary(){
        return 50000;
    }
}
class PartTime extends Employee {
    private double hour;
    public PartTime(String name ,double hour){
        super(name);
        this.hour=hour;
    }
    public double calculateSalary(){
        return 500*hour;
    }
}
 class main{
   public static void main(String[] as){
       Scanner s=new Scanner(System.in);

       System.out.printf("enter name:-");
       String name=s.nextLine();
       System.out.printf("enter name:-");
       String name1 =s.nextLine();

       System.out.printf("enter hour");
       double hour=s.nextDouble();

       FullTime s1=new FullTime(name);
       PartTime s2=new PartTime(name1,hour);

       System.out.println("name " + s1.getName() + " salary " + s1.calculateSalary());
       System.out.println("name " + s2.getName() + " salary " + s2.calculateSalary());


   }
}

