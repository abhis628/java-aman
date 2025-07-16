package Abstraction;

import java.util.Scanner;

interface Payment {

    void pay(double amount);
}
class CrditCard implements Payment{
     public void pay(double amount){
         System.out.println("payment using credit card " + amount);
     }
}
class Upi implements Payment{
     public void pay(double amount){
         System.out.println("payment using upi " + amount);
     }
}
class Cash implements Payment{
     public void pay(double amount){
         System.out.println("payment using cash " + amount);
     }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);

      System.out.printf("enter amount:-");
      double amount=s.nextDouble();
      CrditCard s1=new CrditCard();
      s1.pay(amount);
      System.out.printf("enter amount:-");
      double amount1=s.nextDouble();
      Upi s2=new Upi();
      s2.pay(amount1);
      System.out.printf("enter amount:-");
      double amount2=s.nextDouble();
      Cash s3=new Cash();
      s3.pay(amount2);

  }
}