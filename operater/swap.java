package operater;

import java.util.Scanner;

public class swap {

    public static void main(String[] ager){
        Scanner bipin=new Scanner(System.in);

        System.out.printf("enter first no");
        int a=bipin.nextInt();
        System.out.printf("enter second no");
        int b=bipin.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.printf("swap " + a + " \nswap"+ b);
    }
}
