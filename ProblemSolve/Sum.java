package ProblemSolve;

import java.util.Scanner;

public class Sum {
    public static void main(String[] agrs){
        Scanner aditya=new Scanner(System.in);
        System.out.printf("enter a no:-");
        int a=aditya.nextInt();
        System.out.printf("enter b no:-"); 
        int b=aditya.nextInt();
        int sum=a+b;
        System.out.printf("sum of a and b " + sum);
    }
}
