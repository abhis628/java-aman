package Arrays;

import java.util.Scanner;

public class Odd {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size");
        int s=sc.nextInt();
        int arr[]= new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
