package Inheritence;

import java.util.Scanner;

public class Account {
    double balance;
    Account(double balance){
        this.balance=balance;
    }
    void showbalance(){
        System.out.println("show balance:-" + balance);
    }
}
class SavingAccount extends Account{
    double interestRate;
    SavingAccount(double balance,double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    void showBalance(){
        super.showbalance();
        double interest=(balance*interestRate)/100;
        double totalbalance=balance+interest;
        System.out.println("saving Account with interest:-" +totalbalance);
    }
  public static void main(String[] asdf){
      Scanner a=new Scanner(System.in);

      System.out.printf("enter balance:-");
      double balance=a.nextDouble();
      System.out.printf("enter intersetRate:-");
      double interestRate=a.nextDouble();


      SavingAccount s1=new SavingAccount(balance,interestRate);
      s1.showBalance();
  }
}