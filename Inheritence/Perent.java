package Inheritence;

import java.util.Scanner;

public class Perent {
    void property(int money){
        System.out.println("perent property" + money);
    }
}
class Childs extends Perent{
    void porpertys(){
        System.out.println("child property");
    }
  public static void main(String[] asdf){
      Scanner a=new Scanner(System.in);
        Childs s1=new Childs();
        int money=a.nextInt();
        s1. porpertys();
//        Perent s2=new Perent();
        s1.property(money);

  }

}
