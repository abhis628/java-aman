package Arrays.ArrayList;

import java.util.Scanner;

public class ALLpairs15 {

    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:-");
        int s=sc.nextInt();

        int[] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("enter target");
        int target=sc.nextInt();
        System.out.print("pair of sum:- ");
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
