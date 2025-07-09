package operater;

import java.util.Scanner;

public class multiplication {

    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        System.out.printf("enter a no");
        int a=aman.nextInt();
        System.out.printf("enter b no");
        int b=aman.nextInt();
        int multi=a++ * b++ * a+b;
        System.out.printf("multi" + multi);
    }
}
