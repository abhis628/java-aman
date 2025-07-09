package classobject;

import java.util.Scanner;

public class MethodExample {
   static int add(int a,int b){
        int sum=a + b;

     return sum;

    }
    public static void main(String[] agrs){
        MethodExample s=new MethodExample();
        Scanner f=new Scanner(System.in);
        System.out.printf("enter A no:");
        int a=f.nextInt();
        System.out.printf("enter B no:");
        int b=f.nextInt();

        int result=MethodExample.add(a,b);
        System.out.printf("sum of a and b " + result);

    }
}
