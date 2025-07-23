package Arrays;

import java.util.Scanner;

public class Arrayex {
    public static void main(String[] as) {
        Scanner s = new Scanner(System.in);

     System.out.printf("enter size");
        int a = s.nextInt();
        int arr[] = new int[a];
        System.out.printf("enter elements:-");
        for(int i=0;i<a;i++){
             arr[i]=s.nextInt();
        }
        System.out.printf("elements:-");
        for(int i=0;i<a;i++){
            System.out.printf( arr[i] + " ");
        }
    }
}