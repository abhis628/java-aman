package Arrays.ArrayList;

import java.util.*;

public class Replace20 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> replace=new ArrayList<>();
        System.out.print("enter size:-");
        int s=sc.nextInt();
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            replace.add(sc.nextInt());
        }
        System.out.print("enter value to replace:-");
        int value=sc.nextInt();
        for(int i=0;i<replace.size();i++){
            Collections.fill(replace,value);
        }
        System.out.print("after replace:-" + replace);
    }
}
