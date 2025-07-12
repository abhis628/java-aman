package Encaposulation;

import java.util.Scanner;

public class Calculator {
    private double result;


    public Calculator() {
        this.result = 0.0;
    }
    public void add(double no) {
        result = result + no;
    }
    public void sub(double b) {
        result = result - b;
    }
    public void multi(double c) {
        result = result * c;
    }
    public void div(double d) {
        if (d!= 0) {
            result = result / d;
        } else {
            System.out.printf("invailid no");
        }
     }
   public double getresult() {
        return result;
   }
   public void Clear(){
        result=0;
   }
public static void main(String[] as){
    Scanner s=new Scanner(System.in);
    Calculator s1=new Calculator();
char choice;
  do {
      System.out.printf("--simple calcultor--\n");
      System.out.printf("1.add\n");
      System.out.printf("2.sub\n");
      System.out.printf("3.multi\n");
      System.out.printf("4.div\n");
      System.out.printf("5.c\n");
      System.out.printf("enter choice:-");
       choice =s.next().charAt(0);

      switch (choice) {
          case '+':
              System.out.printf("enter no for add:-");
              double no = s.nextDouble();
              s1.add(no);
              break;
          case '-':
              System.out.printf("enter no for sub:-");
              double b = s.nextDouble();
              s1.sub(b);
              break;
          case '*':
              System.out.printf("enter no for multiply:-");
              double c = s.nextDouble();
              s1.multi(c);
              break;
          case '/':
              System.out.printf("enter no for division");
              double d = s.nextDouble();
              s1.div(d);
              break;
          case 'c':
              s1.Clear();
              System.out.println("clear");
          case 'q':

          default:
              System.out.printf("invailid choice");
      }
  }while(choice!='q');
     System.out.println("result= " + s1.getresult());

  }
}
