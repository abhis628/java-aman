package Arrays.ArrayList;

import java.util.*;

public class Compare17 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> compare=new ArrayList<>();
        System.out.print("enter size:-");
        int s=sc.nextInt();
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            compare.add(sc.nextInt());
        }
        ArrayList<Integer> compare1=new ArrayList<>();
        System.out.print("enter size:-");
        int n=sc.nextInt();
        System.out.print("enter element:-");
        for(int i=0;i<n;i++){
            compare1.add(sc.nextInt());
        }
        if(compare.equals(compare1)){
            System.out.print("equals");
        }else{
            System.out.print("Not equals");
        }

    }
}
