package Abstraction;

import java.util.Scanner;

abstract class Bank {
        protected double balance;

       public Bank(double balance){
           this.balance=balance;
       }
       public void deposite(double amount){
           if(amount>0){
               balance = balance+amount;
               System.out.println("deposite amount " + amount);
           }else {
               System.out.println("amount must be positive");
           }
       }
       abstract void withdraw(double amount);
       public void showbalance(){
           System.out.println("current balance " + balance);
       }
}
class SavingAccount extends Bank{

    public SavingAccount(double balance){
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("withdraw amount" + amount);
        } else {
            System.out.println("amount must be under balance");
        }

        showbalance();
    }
}
class CurrentAccount extends Bank{

    public static final double over_draft=10000;

    public CurrentAccount(double balance){
        super(balance);
    }
    public void withdraw(double amount){
        if(amount<=balance+over_draft){
            balance=balance-amount;
            System.out.println("withdraw amount " + amount);
        }
        else{
            System.out.println("over dreft limit failed");
        }
        showbalance();
    }
}
class bala{
    public static void main(String[] as) {
        Scanner s = new Scanner(System.in);
        SavingAccount s1=new SavingAccount(0);
        System.out.printf("deposite amounnt for saving account:-");
        double amount=s.nextDouble();
        System.out.printf("withdraw amount for saving account:-");
        double amount1=s.nextDouble();

        CurrentAccount s2=new CurrentAccount(0);
        System.out.printf("deposite amount for current acount:-");
        double amount2=s.nextDouble();
        System.out.printf("withdraw amount for current account:-");
        double amount3=s.nextDouble();
        System.out.println("------ saving account----");
         s1.deposite(amount);
         s1.withdraw(amount1);
         System.out.println("------current account-----");
         s2.deposite(amount2);
         s2.withdraw(amount3);


    }
}