package Inheritence;

import java.util.Scanner;

public class Device {
    String devicename;
    Device(String devicename){
        this.devicename=devicename;
    }
    void showinfo(){
        System.out.println("device name:-" + devicename);
    }
}
class Mobile extends Device{
    String os;
    Mobile(String devicename,String os){
        super(devicename);
        this.os=os;
    }
    void showinfo(){
        super.showinfo();
        System.out.println("device os:-" + os);
    }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);
      System.out.printf("enter device name:-");
      String devicename=s.nextLine();
      System.out.printf("enter device os:-");
      String os=s.nextLine();
      Mobile s1=new Mobile(devicename,os);
      s1.showinfo();
  }
}
