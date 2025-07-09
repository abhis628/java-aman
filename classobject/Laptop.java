package classobject;

import java.util.Scanner;

public class Laptop {
    String brand;
    String processor;
    int ramsize;
    boolean isOn;
    Laptop(String brand,String processor,int ramsize){
        this.brand=brand;
        this.processor=processor;
        this.ramsize=ramsize;
    }
    void poweron(){
        isOn=true;
        System.out.printf("Laptop is on welcome  world\n");
    }
    void upgradeRam(int extraRam){
        ramsize+=extraRam;
        System.out.printf("\nyou add extra Ram:-" + extraRam + "GB");
        System.out.printf("\ntotal Ram size is:-" + ramsize + "GB");
    }
    void showLaptopinfo(){
        System.out.printf("--show all details of Laptop--");
        System.out.printf("\nLaptop brand:-" + brand);
        System.out.printf("\nLaptop processor:-" + processor);
        System.out.printf("\nLaptop Ram size:-" + ramsize);
    }
    public static void main(String[] agrs){

        Scanner a=new Scanner(System.in);
        System.out.printf("enter laptop brand:-");
        String brand=a.nextLine();
        System.out.printf("enter processor:-");
        String processor=a.nextLine();
        System.out.printf("enter ram size:-");
        int ramsize=a.nextInt();

        Laptop s1=new Laptop(brand,processor,ramsize);
        s1.poweron();
        System.out.printf("enter extra Ram to add:-");
        int extraRam=a.nextInt();
        s1.upgradeRam(extraRam);
        s1.showLaptopinfo();
    }
}
