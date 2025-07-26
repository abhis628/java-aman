package Arrays.ArrayList;

import java.util.*;

public class Duplicate9 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> remove=new ArrayList<>();
        ArrayList<Integer> uniqueList=new ArrayList<>();
        System.out.print("enter size:-");
        int s=sc.nextInt();

        int[] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
            remove.add(arr[i]);
        }
        for(int num:remove){
            if(!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }
        System.out.print("unique list " + uniqueList);
    }
}
