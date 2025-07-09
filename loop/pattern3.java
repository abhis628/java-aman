package loop;

import java.util.Scanner;

public class pattern3 {

    public static void main(String[] agrs){
        Scanner aide=new Scanner(System.in);

        System.out.printf("enter no");
         int n=aide.nextInt();
         for(int i=1;i<=n;i++){
             for(int j=2;j>=i;j--){
                 System.out.printf("  ");
             }
             for(int k=1;k<=i;k++){
                 System.out.printf("* ");
             }
             System.out.printf("\n");
         }
         for(int i=n-1;i>=1;i--){
             for(int j=2;j>=i;j--){
                 System.out.printf("  ");
             }
             for(int k=1;k<=i;k++){
                 System.out.printf("* ");
             }
             System.out.printf("\n");
         }
    }
}
