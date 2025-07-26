package Arrays.ArrayList;

import java.util.*;

public class SubList19 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> sub=new ArrayList<>();
       System.out.print("enter size:-");
       int s=sc.nextInt();
       System.out.print("enter element:-");
       for(int i=0;i<s;i++){
           sub.add(sc.nextInt());
       }
       System.out.print("enter statr index:-");
       int start=sc.nextInt();
       System.out.print("enter end index:-");
       int end=sc.nextInt();
       if(start>=0&&end<=sub.size()&&start<end){
           ArrayList<Integer> subList=new ArrayList<>(sub.subList(start,end));
           System.out.print("subList:- " + subList);
       }else{
           System.out.print("invailid ");
       }

    }
}
