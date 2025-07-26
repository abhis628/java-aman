package Arrays.ArrayList;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] as){
        ArrayList<Integer> no=new ArrayList<>();
        no.add(0,12);
        no.add(1,23);
        no.add(2,13);
        no.add(3,14);
        no.add(4,15);

        System.out.println(no);
        System.out.print(no.size());
        no.add(5,16);
        System.out.print(no);
        no.remove(5);
        System.out.print("\n" + no);
        System.out.print("\n" + no.get(4));
        Collections.sort(no);
        System.out.print("\n" + no);
    }
}
