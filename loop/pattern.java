package loop;

import java.util.Scanner;

public class pattern {

    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        System.out.printf("enter first no");
        int n=aman.nextInt();
        System.out.printf("enter second no");
        int k=aman.nextInt();
        for(int i=0;i<n;i++) {
            for (int j = 0; j < k; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.printf(" *");
                } else {
                    System.out.printf(" #");
                }
            }
            System.out.printf("\n");
        }
    }
}
