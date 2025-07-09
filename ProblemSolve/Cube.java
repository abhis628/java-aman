package ProblemSolve;

import java.util.Scanner;

public class Cube {

    int cube(int no){
     int cube=no*no*no;
        return cube;
    }
 public static void main(String[] as){
     Scanner s=new Scanner(System.in);
     System.out.printf("enter a number:-");
     int no=s.nextInt();
     Cube s1=new Cube();
     int result=s1.cube(no);
     System.out.println("cube of no:-" + result);
 }
}
