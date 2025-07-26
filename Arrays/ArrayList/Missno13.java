package Arrays.ArrayList;

import java.util.Scanner;

public class Missno13 {

    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:-");
        int s=sc.nextInt();

        int[] arr=new int[s-1];
        System.out.print("enter element:-");
        for(int i=0;i<s-1;i++){
            arr[i]=sc.nextInt();
        }

        int totalsum=s*(s+1)/2;
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        int missing=totalsum-sum;
        System.out.print("missing no:-" + missing);
    }
}
