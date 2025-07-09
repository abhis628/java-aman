package ProblemSolve;

import java.util.Scanner;

public class Table {
    public static void main(String[] agr){
        Scanner a=new Scanner(System.in);

        System.out.printf("enter no:-");
        int b=a.nextInt();
        int multi=1;
        while(multi<=10){
            int d=multi*b;
            System.out.println(d);
            multi++;
        }
    }
}
