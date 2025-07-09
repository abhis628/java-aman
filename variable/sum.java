package variable;

import java.util.Scanner;

public class sum {

    public static void main(String[] agrs){
        Scanner bipin=new Scanner(System.in);

        System.out.printf("enter first no");
        int a=bipin.nextInt();

        System.out.printf("enter second no");
        int b=bipin.nextInt();

        int sum=a+b;
        System.out.println("sum of a and b:" + sum);
    }
}
