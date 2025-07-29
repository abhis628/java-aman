package Arrays.ArrayList;

import java.util.*;

public class Aman {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> number=new ArrayList<>();
     System.out.print("enter no");
      String s=sc.nextLine();
        number.add(s);
       String a=sc.nextLine();
       number.add(a);
        System.out.print("array list no " + number);
        number.remove(a);
        System.out.print("after removeing " + number);

    }
}
