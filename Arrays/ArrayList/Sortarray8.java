package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortarray8 {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> sort=new ArrayList<>();

        System.out.print("enter size");
        int s=sc.nextInt();

        int[] arr=new int[s];
        System.out.print("enter element:-");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
            sort.add(arr[i]);
        }
        Collections.sort(sort);
        System.out.print("asending order:- " + sort);

    }
}
