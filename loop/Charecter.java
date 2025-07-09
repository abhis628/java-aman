package loop;

import java.util.Scanner;

public class Charecter {
    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);

        System.out.printf("enter charcter:-");
        char ch=aman.nextLine().charAt(0);
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.printf("\n");
        }
    }
}
