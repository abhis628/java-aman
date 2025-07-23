package Abstraction;

abstract class MenuItem {
    String name;
    double price;
    public MenuItem(String name, double price){
        this.name=name;
        this.price=price;
    }
    abstract void prepare();
    void display(){
        System.out.println("name " + name + "price " + price);
    }
}
class VegBurger extends MenuItem{
   public VegBurger(){
       super("veg",34);
   }
    public void prepare(){
       display();
        System.out.println("Grilling veggie patty__");
        System.out.println("Adding tomato__");
        System.out.println("wrepping veg burger__");
    }
}
class ChickenBueger extends MenuItem{

    public ChickenBueger(){
        super("cheken",58);
    }
    public void prepare(){
        display();
        System.out.println("Grilling veggie patty__");
        System.out.println("Grilling veggie patty__");


    }
  public static void main(String[] as){
        VegBurger s=new VegBurger();
        ChickenBueger s1=new ChickenBueger();
        s.prepare();
        s1.prepare();
  }
}
