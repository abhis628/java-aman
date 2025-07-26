package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Common18 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> common=new ArrayList<>();
        System.out.print("enter size:-");
        int s=sc.nextInt();
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            common.add(sc.nextInt());
        }

        ArrayList<Integer> common1=new ArrayList<>();
        System.out.print("enter size:-");
        int n=sc.nextInt();
        System.out.print("enter element:-");
        for(int i=0;i<n;i++){
            common1.add(sc.nextInt());
        }
        List<Integer> List=new ArrayList<>();
        for(int a:common){
            for(int b:common1){
                if(a==b&&!List.contains(a)){
                    List.add(a);
                    break;
                }else{
                    System.out.print("not common element");
                }
            }
        }
        System.out.print("common element:-" + List);
    }
}
