package ProblemSolve;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] asdf){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter no:-");
        int b=a.nextInt();
        int multi=1;
        int fact=1;
        for(int i=1;i<=b;i++){
            multi*=i;
        }
        System.out.println("factorial" + multi);

    }
}
