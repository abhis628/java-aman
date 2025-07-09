package Poliymoephism;

import java.util.Scanner;


public class
Calculator {
    int a;int b;
    int c;int d;int e;
//    Calculator(int a,int b,int c,int d,int e){
//        this.a=a;
//        this.b=b;
//        this.c=c;
//        this.d=d;
//        this.e=e;
//  }
    int add(int a,int b) {
        int add = a + b;
        return add;
    }
    int add(int c,int d,int e){
     int add=c+d+e;
     return add;
    }
 public static void main(String[] as){
     Scanner s=new Scanner(System.in);
     Calculator s1=new Calculator();
     System.out.printf("enter a:-");
     int a=s.nextInt();
     System.out.printf("enter b:-");
     int b=s.nextInt();
     int result=s1.add(a,b);
     System.out.printf("sum of two no:-" + result);

     System.out.printf("enter c:-");
     int c=s.nextInt();
     System.out.printf("enter d:-");
     int d=s.nextInt();
     System.out.printf("enter e:-");
     int e=s.nextInt();

     int sum=s1.add(c,d,e);
     System.out.printf("\nsum of three no:-" + sum);
 }
}
