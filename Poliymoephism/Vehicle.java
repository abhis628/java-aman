package Poliymoephism;

public class Vehicle {
    void displayinfo(){
        System.out.println("generic vehicle");
    }
}
class Car extends Vehicle{
    void displayinfo(){
        System.out.println("car:- 4 wheels");
    }
}
class Bike extends Car{
    void displayinfo(){
        System.out.println("bike:- 2 wheels");
    }
  public static void main(String[] as){
       Vehicle s1=new Vehicle();
       Car s2=new Car();
       Bike s3=new Bike();

       s1.displayinfo();
       s2.displayinfo();
       s3.displayinfo();
  }
}
