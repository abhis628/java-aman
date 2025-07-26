package Arrays;

import java.util.Scanner;

public class Maximum {

    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size:-");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<s;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("max element:- " + max);
    }
}
