package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class Search7 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> search=new ArrayList<>();

        System.out.print("enter size");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
            search.add(arr[i]);
        }
        System.out.print("enter element for search:-");
        int searchelement=sc.nextInt();

            if(search.contains(searchelement)){
                int index=search.indexOf(searchelement);
             System.out.print("found at index " + index);
            }
            else {
                System.out.print("element not found");
            }

    }
}
