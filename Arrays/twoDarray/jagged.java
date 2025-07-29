package Arrays.twoDarray;

import java.sql.SQLOutput;
import java.util.Scanner;
public class jagged {
  public static void main(String[] as) {
      Scanner sc = new Scanner(System.in);
      int r=3;
      int c;
      int[][] arr = new int[3][];
      System.out.print("enter no for element:-");
       int s=sc.nextInt();
      System.out.print("enter no for element:-");
       int a=sc.nextInt();
      System.out.print("enter no for element:-");
       int b=sc.nextInt();
      arr[0] = new int[s];
      arr[1] = new int[a];
      arr[2] = new int[b];
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              System.out.print("element for jagged [" + i + "][" + j + "]");
              arr[i][j] = sc.nextInt();
          }
      }
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++){
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
       }
      }
}
