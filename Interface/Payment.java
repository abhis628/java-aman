package Interface;

public interface Payment {
    void pay(double amount);
}
class Upi implements Payment{

    public void pay(double amount){
        System.out.println("payment successfuly using UPI:-" + amount);
    }
}
class CreditCard implements Payment{
  public static final double persentage=2;
    public void pay(double amount){
        double total=(persentage/100)*amount;
        System.out.println("payment succesfuly using credit card:-" + (total+amount));
    }
  public static void main(String[] as){

        Upi s1=new Upi();
        s1.pay(1000);
        CreditCard s2=new CreditCard();
        s2.pay(100);
  }
}
