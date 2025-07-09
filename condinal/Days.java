package condinal;

import java.util.Scanner;

public class Days {

    public static void main(String[] agrs){

        Scanner a=new Scanner(System.in);
        System.out.printf("enter b:-");
        int b=a.nextInt();
        switch(b){
            case 1:
                 System.out.println("monday");
                 break;

            case 2:
                System.out.println("tuesday");

            case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("surtaday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid no ");

        }



    }
}
