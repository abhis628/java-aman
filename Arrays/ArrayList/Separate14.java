package Arrays.ArrayList;

import java.util.Scanner;

public class Separate14 {

    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:-");
        int s=sc.nextInt();
        int[] arr=new int[s];

        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=new int[s];
        int index=0;

        for(int i=0;i<s;i++){
            if(arr[i]<0){
                result[index++]=arr[i];
            }
        }
        for(int i=0;i<s;i++){
            if(arr[i]>0){
                result[index++]=arr[i];
            }
        }
        System.out.print("saperet array:-");
        for(int num:result){
            System.out.print(num + " ");
        }
    }
}
