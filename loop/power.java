package loop;

import java.util.Scanner;

public class power {
    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        System.out.printf("enter base");
        int base=aman.nextInt();
        System.out.printf("enter power");
        int power=aman.nextInt();
        int result=1;

        while(power!=0){
            result=result*base;
            power--;
        }
        System.out.println(" result  " + result);

    }
}
