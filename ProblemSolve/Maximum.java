package ProblemSolve;

import java.util.Scanner;

public class Maximum {

    public static void main(String[] asdf){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter first no:-");
        int b=a.nextInt();
        System.out.printf("enter second no:-");
        int c=a.nextInt();
        System.out.printf("enter third no:-");
        int d=a.nextInt();
        if(b>c&&b>d){
            System.out.println("b is max" + b);
        }else if(c>d){
            System.out.println("c is max" + c);
        }else{
            System.out.println("d is max" + d);
        }


    }
}
