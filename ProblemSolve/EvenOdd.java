package ProblemSolve;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] as){
        Scanner a=new Scanner(System.in);

        System.out.printf("entsr no:-");
        int b=a.nextInt();
        if(b%2==0){
            System.out.println("even no:-" + b);
        }else{
            System.out.println("odd no:-" + b);
        }
    }
}
