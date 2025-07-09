package classobject;

import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    int batterylevel;
    boolean ison;

    void turnon(){
        if(batterylevel>0) {
            ison = true;
            System.out.printf("mobile is on");
        }else{
            System.out.printf("phone is discharge");
        }
    }
    void usephone(int minutes){
        int batterydrain=minutes/1;
        if(batterylevel>=batterydrain){
            batterylevel=batterylevel-batterydrain;
            System.out.printf("phone use " + minutes + "minutes\n");
        }else{
             System.out.printf("not battery enough to use phone " + minutes + "minutes\n");
        }
    }
    void chargephone(int amount){
        batterylevel=amount+1;
        System.out.printf("\nbatrrey level " + batterylevel);
    }
    public static void main(String[] agrs){
        MobilePhone z=new MobilePhone();
        Scanner a=new Scanner(System.in);

            System.out.printf("enter brand name:-");
            z.brand=a.nextLine();
            System.out.printf("enter model:-");
            z.model=a.nextLine();
            System.out.printf("enter battery level:-");
            z.batterylevel=a.nextInt();

            z.turnon();
            System.out.printf("\nenter minutes:-");
            int minutes=a.nextInt();
            z.usephone(minutes);
            System.out.printf("plug phone on charging:-");
            int amount=a.nextInt();
            z.chargephone(amount);

    }
}
