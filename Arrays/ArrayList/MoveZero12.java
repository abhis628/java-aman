package Arrays.ArrayList;

import java.util.Scanner;

public class MoveZero12 {
    static void Movezero(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:-");
        int s=sc.nextInt();

        int[] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        Movezero(arr);
        System.out.print("move zero array:-");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
