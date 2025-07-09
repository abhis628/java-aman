package ProblemSolve;

import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] asdf){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter sp:-");
        int sp=a.nextInt();
        System.out.printf("enter ep:-");
        int ep=a.nextInt();
        for(;sp<=ep;sp++){
            if(sp%2==0) {
                System.out.println("prime no:-" + sp);
            }
        }
    }

}
