package loop;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        System.out.printf("enter no:-");
        int n=aman.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf("  ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.printf("  ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }


    }
}
