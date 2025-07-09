package StaticContext;

import java.util.Scanner;

public class Example {
   int count=0;
   void incriment(){
       count++;
       System.out.println("instance method called count " + count);
   }
    public static void main(String[] asdf){
        Scanner a=new Scanner(System.in);
        Example s1=new Example();
        s1.incriment();
    }
}
