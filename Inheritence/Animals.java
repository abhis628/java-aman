package Inheritence;

public class Animals {
    void makesound(){
        System.out.println("mea");
    }
}
class Dogs extends Animals{
    void makesound() {
        System.out.println("Dog btraks");
    }
  public static void main(String[] asdf){
        Dogs s2=new Dogs();
        s2.makesound();
  }
}