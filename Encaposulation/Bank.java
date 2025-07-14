package Encaposulation;

import java.util.Scanner;

public class Bank {
    private String ACno;
    private String ACholder;
    private double balance;
  public Bank(String ACno,String ACholder){
      this.ACno=ACno;
      this.ACholder=ACholder;
      this.balance=0;
  }
  public String getAcno() {
      return ACno;
  }
  public String getAcholder(){
      return ACholder;
  }
 public void deposite(double amount) {
     if (amount > 0) {
         balance = balance + amount;
         System.out.println("amount deposite $" + amount);
     }
     else {
         System.out.println("negative amount");
     }
 }
 public void withdrow(double amount){
      if(balance>=amount){
          balance=balance-amount;
          System.out.println("amount withdrow $" + amount);
      }
      else{
          System.out.println(" insuffcient balance");
      }
 }
 public double getBalance(){
      return balance;
 }
 public void transfer(Bank otheraccount,double amount){
      if(amount>0&&amount<balance){
          this.balance=balance-amount;
          otheraccount.deposite(amount);
          System.out.println("transfer $" + amount + " other account:-" + otheraccount);
      }
      else{
          System.out.println("transfer faild");
      }
 }
 public String getAccountinfo(){
      return "ac no:- " + ACno +
              "\nac holder name:- " + ACholder;
  }
public static void main(String[] as){
    Scanner s=new Scanner(System.in);
    System.out.println("--first account--");
    System.out.printf("enter account no:-");
    String ACno=s.nextLine();
    System.out.printf("enter account holder name:-");
    String ACholder=s.nextLine();
    Bank s1=new Bank(ACno,ACholder);

    System.out.println("--secound account--");
    System.out.printf("enter account no:-");
    String ACno2=s.nextLine();
    System.out.printf("enter account holder name:-");
    String Acholder=s.nextLine();
    Bank s2=new Bank(ACno2,Acholder);

    int choice;
    do{
        System.out.println("--bank--");
        System.out.println("1.deposite");
        System.out.println("2.withdraw");
        System.out.println("3.transfer");
        System.out.println("4.view account info");
        System.out.println("enter choice:-");
        choice=s.nextInt();
        switch(choice){
            case 1:
                System.out.printf("enter deposite amount:-");
                double amount=s.nextDouble();
                s1.deposite(amount);
                break;
            case 2:
                System.out.printf("enter withdrow amount:-");
                double amount1=s.nextDouble();
                s1.withdrow(amount1);
                break;
            case 3:
                System.out.printf("enter transfer amount:-");
                double amount2=s.nextDouble();
                s1.transfer(s2,amount2);
                break;
            case 4:
                System.out.println(s1.getAccountinfo());
                System.out.println(s2.getAccountinfo());
                break;
            default:
                System.out.printf("invailid choice");
        }
    }while(choice!=4);
}


}
