package Interface;

public interface RemoteControl {
    void pressButton(int code);
}
class TVremote implements RemoteControl{

    public void pressButton(int code){
        switch (code){
            case 1:
                System.out.println("tv is on");
                break;
            case 2:
                System.out.println("tv is off");
                break;
            default:
                System.out.println("code invailid");
        }
    }
}
class ACremote implements RemoteControl{

    public void pressButton(int code){
      switch (code){
          case 1:
              System.out.println("ac is on");
              break;
          case 2:
              System.out.println("ac is off");
              break;
          default:
              System.out.println("code invalid");
      }
    }
  public static void main(String[] as){

     TVremote s1=new TVremote();
     ACremote s2=new ACremote();
     s1.pressButton(1);
     s1.pressButton(2);
     s2.pressButton(1);
     s2.pressButton(2);
  }
}
