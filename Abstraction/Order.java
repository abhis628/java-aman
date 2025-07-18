package Abstraction;

public interface Order {
    void prosessorder();
}
class Onlineorder implements Order{

    int orderid;
    public Onlineorder(int orderid){
        this.orderid=orderid;
    }
    public void prosessorder(){
      System.out.println("online order conform " + orderid);
    }
}
class Offlineorder implements Order{
    int orderid;
    public Offlineorder(int orderid){
        this.orderid=orderid;
    }
    public void prosessorder(){
        System.out.println("offline order conform " + orderid);
    }
 public static void main(String[] as){
        Onlineorder s1=new Onlineorder(1);
        Offlineorder s2=new Offlineorder(2);
        s1.prosessorder();
        s2.prosessorder();
 }
}