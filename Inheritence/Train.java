package Inheritence;

public class Train {
    void run(){
        System.out.println("train is running");
    }
}
class Metro extends Train{
    void run(){
        System.out.println("metro is running on electric track");
    }
  public static void main(String[] asd){
        Metro s1=new Metro();
        s1.run();
  }
}