package classobject;

import java.util.Scanner;

public class BankAccount {
    String AccountHolderName;
    String accountnumber;
    double balance;

    void deposite(double amount){
        balance=balance+amount;
        System.out.printf("amount deposite:-" + amount + "rs\n");
        System.out.printf("total balance:-" + balance + "rs\n");
    }
   void withdrow(double Amount){
        if(Amount<=balance){
            balance=balance-Amount;
            System.out.printf("withdrow amount:-" + Amount + "rs\n");
            System.out.printf("total balance:-" + balance + "rs\n");
        }else{
            System.out.printf("balance error");
        }
   }
    public static void main(String[] agrs){
        BankAccount a=new BankAccount();
        Scanner z=new Scanner(System.in);

        System.out.printf("enter account holder name:-");
        a.AccountHolderName=z.nextLine();
        System.out.printf("enter account number:-");
        a.accountnumber=z.nextLine();
        System.out.printf("enter balance:-");
        a.balance=z.nextDouble();

        System.out.printf("enter amount:-");
        double amount=z.nextDouble();
        a.deposite(amount);
        System.out.printf("enter amount to withdrow:-");
        double Amount=z.nextDouble();
        a.withdrow(Amount);

    }
}
