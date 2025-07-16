package Abstraction;

import java.util.Scanner;

abstract class Vehicals {
    private String brand;
    protected int speed;

    public Vehicals(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    abstract void drive();
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed<=300) {
            System.out.println("speed must be under 300");
        }else {
                this.speed=speed;
            }
    }
    public String getBrand(){
        return brand;
    }
    public String toString(){
        return "brand " + brand + " speed " + speed + "km/h";
    }
}
class Cars extends Vehicals{
    public Cars(String brand , int speed){
        super(brand,speed);
    }

    public void drive(){
        System.out.println("drive car " + speed + "km/h");
    }
}
class Bike extends Vehicals{

    public Bike(String brand,int speed){
        super(brand,speed);
    }
    public void drive(){
        System.out.println("bike drive at " + speed + "km/h");
    }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);

      System.out.printf("enter brand");
      String brand=s.nextLine();
      System.out.printf("enter speed");
      int speed=s.nextInt();

      Vehicals s1=new Cars(brand,speed);
      s1.setSpeed(speed);
      s1.drive();
      System.out.println(s1);
      s.nextLine();
      System.out.printf("enter brand");
      String brand1=s.nextLine();
      System.out.printf("enter speed");
      int speed1=s.nextInt();
      Vehicals s2=new Bike(brand1,speed1);
      s2.setSpeed(speed1);
      s2.drive();

      System.out.println(s2);
    }
}