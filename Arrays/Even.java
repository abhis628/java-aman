package Arrays;

import java.util.Scanner;

public class Even {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter size");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.printf("enter element:-");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
