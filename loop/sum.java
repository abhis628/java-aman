package loop;

import java.util.Scanner;

public class sum {
    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        int no;
        int sum = 0;
        do {
            System.out.printf("enter no");
             no = aman.nextInt();

            if(no>0){
                sum=sum+no;
            }
        }while(no>0);
        System.out.printf("sum " + sum);
    }
}
