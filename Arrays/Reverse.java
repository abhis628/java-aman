package Arrays;

import java.util.Scanner;

public class Reverse {

   public static void revers(int[] arr,int arrSize){
        int sp=0,ep=arrSize-1;
        while(sp<=ep){
            int tem=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=tem;
            sp++;
            ep--;
        }
        System.out.print(arr);
    }
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:-");
        int s=sc.nextInt();
        int [] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        revers(arr,s);
       System.out.print("reverse array");
       for(int i=0;i<s;i++){
           System.out.print(arr[i] + " ");
       }
    }
}
