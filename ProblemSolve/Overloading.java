package ProblemSolve;

import java.util.Scanner;

public class Overloading {

    public int add(int a,int b){
        int add=a+b;
        return add;
    }

    public double add(double x,double y){
        double add=x+y;
        return add;
    }
   public static void main(String[] asd){
       Scanner c=new Scanner(System.in);
       Overloading s1=new Overloading();
       System.out.printf("enter two no;-");
       int a=c.nextInt();
       int b=c.nextInt();

       int sum=s1.add(a,b);
       System.out.println("sum of two no:-" + sum);

       System.out.printf("enter two decimal no:-");
       double x=c.nextDouble();
       double y=c.nextDouble();
       double Sum=s1.add(x,y);
       System.out.println("Sum of two decimal no:-" + Sum);

   }
}
