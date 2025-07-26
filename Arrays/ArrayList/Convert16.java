package Arrays.ArrayList;

import java.util.*;

public class Convert16 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size");
        int s=sc.nextInt();
        sc.nextLine();
        String[] str=new String[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            str[i]=sc.nextLine();
        }
        List<String> arrayList=new ArrayList<>(Arrays.asList(str));
        System.out.println("Array List:-" + arrayList);
    }
}
