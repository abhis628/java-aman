package condinal;

import java.util.Scanner;

public class marks {

    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);

        System.out.printf("enter mark");
        int marks=aman.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("grade A");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("grade B");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("grade C");
        }
        else {
            System.out.println("fail");
        }
    }
}
