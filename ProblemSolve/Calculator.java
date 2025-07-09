package ProblemSolve;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        int add=a+b;
        System.out.println("sum of a and b:-" + add);
    }
    void sub(){
        int sub=a-b;
        System.out.println("sub of a and b:-" + sub);
    }
    void multi(){
        int multi=a*b;
        System.out.println("multi of a and b:-" + multi);
    }
    void div(){
        int div=a/b;
        System.out.println("div of a and b:-" + div);
    }
 public static void main(String[] as){
     Scanner s=new Scanner(System.in);
     System.out.printf("enter choice:-");
     int choice=s.nextInt();
     System.out.printf("enter two no:-");
     int a=s.nextInt();
     int b=s.nextInt();
     Calculator s1=new Calculator(a,b);

     switch(choice){
         case 1:
            s1.add();
            break;

         case 2:
             s1.sub();
             break;
         case 3:
             s1.multi();
             break;
         case 4:
             s1.div();
             break;

             default:
             System.out.printf("invalid");
     }
 }
}
