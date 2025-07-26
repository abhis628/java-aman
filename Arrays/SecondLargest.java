package Arrays;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        int s;
        System.out.println("enter size:-");
        s=sc.nextInt();

        int[] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<s;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest&&arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.print("second largest :- " + secondlargest);
    }
}
