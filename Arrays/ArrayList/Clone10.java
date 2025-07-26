package Arrays.ArrayList;

import java.util.*;

public class Clone10 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> cloneA=new ArrayList<>();

        System.out.print("enter size:-");
        int s=sc.nextInt();
        int[] arr=new int[s];

        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
            cloneA.add(arr[i]);
        }
         ArrayList<Integer> cloneB=new ArrayList<>(cloneA);
        System.out.println(" original array:-" + cloneA);
        System.out.println("copied array:-" + cloneB);
    }
}
