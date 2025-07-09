package variable;

import java.util.Scanner;

public class sub {

    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);

        System.out.printf("enter first no");
        int a=aman.nextInt();

        System.out.printf("enter second no");
        int b=aman.nextInt();

        int sub=a-b;

        System.out.println("sub of a and b " + sub);
    }
}
