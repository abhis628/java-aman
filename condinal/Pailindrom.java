package condinal;

import java.util.Scanner;

public class Pailindrom {

    public static void main(String[] ager ){
        Scanner aman=new Scanner(System.in);

        System.out.printf("enter two digit no");
        int no=aman.nextInt();
        int d1,d2;
        d2=no%10;
        d1=no/10;
        if(d1==d2){
            System.out.println("it is a palindrom " + no);
        }
        else{
            System.out.println("it is not a pailindrom " + no);
        }

    }
}
