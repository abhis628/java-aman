package Arrays;

import java.util.Scanner;

public class Sum {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size");
        int s=sc.nextInt();

        int arr[]=new int[s];
        System.out.print("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print("sum of element:-" + sum);
    }
}
