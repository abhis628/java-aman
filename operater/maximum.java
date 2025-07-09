package operater;

import java.util.Scanner;

public class maximum {

    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        System.out.printf("enter a no");
        int a=aman.nextInt();
        System.out.printf("enter b no");
        int b=aman.nextInt();
        System.out.printf("enter c no");
        int c=aman.nextInt();
        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
       System.out.printf("max " + max);

    }

}
