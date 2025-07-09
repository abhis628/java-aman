package Inheritence;

import java.util.Scanner;

public class BankAccount {
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    void displaybalance(){
        System.out.println("Account balance:-" + balance);
    }
}
class SavingAccounts extends BankAccount{
    double newbalance;
    SavingAccounts(double balance,double newbalance){
        super(balance);
        this.newbalance=newbalance;
    }
    void deposit(){
        super.displaybalance();
        if(newbalance<=balance){
            balance=balance+newbalance;
            System.out.println("deposite balance:-" + newbalance);
            System.out.println("after deposite balance:-" + balance);
        }
    }
  public static void main(String[] sff){
      Scanner a=new Scanner(System.in);
      System.out.printf("enter balance:-");
      double balance=a.nextDouble();
      System.out.printf("enter new balance for diposite:-");
      double newbalance=a.nextDouble();

      SavingAccounts s1=new SavingAccounts(balance,newbalance);
      s1.deposit();
  }
}