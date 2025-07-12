package Encaposulation;

import java.util.Scanner;

public class Empolyee {
    private String name;
    private int id;
    private double salary;
    private double bonus;
   public Empolyee(String name,int id,double salary){
       this.name=name;
       this.id=id;
       this.salary=salary;
       this.bonus=0.0;
   }
   public String getName(){
       return name;
   }
   public int getId(){
       return id;
   }
   public double getSalary(){
       return salary;
   }
    public double getBonus(){
        return bonus;
    }
   public void setBonus(double bonus){
       if(bonus<0){
           System.out.println("bonus can not be negative");
       }
       else{
           this.bonus=bonus;
       }
   }

   public void giveRaise(double percentage){
       if(percentage>0){
           salary+=salary*(percentage/100);

       }else {
           System.out.println("percentage must be positive");
       }

   }
    public double getTotalpay(){
        return salary+bonus;
    }
    public String getEmpolyeedetails(){
       return "name " + name +
               "\nid " + id +
               "\nsalary " + getSalary() +
               "\nbonus " + getBonus() +
               "\ntotalpay " + getTotalpay() ;
    }
 public static void main(String[] as){
    Scanner s=new Scanner(System.in);

    System.out.printf("Empolyee name:-");
    String name=s.nextLine();
    System.out.printf("Empolyee id:-");
    int id=s.nextInt();
    System.out.printf("salary:-");
    double salary=s.nextDouble();
    Empolyee s1=new Empolyee(name,id,salary);

    System.out.printf("enter bonus:-");
    double bonus=s.nextDouble();
    s1.setBonus(bonus);
    System.out.printf("enter raise percentage:-");
    double percentage=s.nextDouble();
    s1.giveRaise(percentage);

    System.out.println(s1.getEmpolyeedetails());


 }
}
