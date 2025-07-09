package ProblemSolve;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        System.out.printf("enter celsius:-");
        int celsius=aman.nextInt();
        int fahrenheit=(celsius*9/5)+32;
        System.out.printf("fahrenheit:- " + fahrenheit);
    }
}
