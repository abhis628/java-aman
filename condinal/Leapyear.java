package condinal;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);

        System.out.printf("enter year");
        int year=aman.nextInt();

        if(year%4==0 || year%400==0 || year%100!=0){
            System.out.println("year is leap year " + year);
        }
        else{
            System.out.println("year is not leap year " + year);
        }
    }
}
