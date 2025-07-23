package Arrays.twoDarray;

import java.util.Scanner;

public class twoex {
        public static void main(String[] nas){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter row size");
            int r=sc.nextInt();
            System.out.print("rnter column size");
            int c=sc.nextInt();

            int[][] arr=new int[r][c];

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print("enter elementd at [" + i + "][" + j + "]");
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("element are:-");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }

}
