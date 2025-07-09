package classobject;


import java.util.Scanner;

public class Car {
  String brand;
  String model;
  int year;
  double fuel;
  double mileage=10;
  double distance;

  void drive(double distance){
      double fuelneed=distance/mileage;
      if(fuelneed<=fuel){
          fuel-=fuelneed;
          System.out.printf("drive " + distance +"km\n");
      }
      else{
          System.out.printf("fuel end " +(fuel*mileage) + "km\n");
      }
      System.out.printf("remaing " + fuel + "liter\n");
  }
  void refule(double liter){
      fuel=fuel+liter;
      System.out.printf("refuling " + liter + "liter\n");
  }
  void displayinfo(){
      System.out.printf("brand name:-" + brand);
      System.out.printf("\nmodel name:_" + model);
      System .out.printf("\nmanufacture year:-" + year);
      System.out.printf("\nfuel:-" + fuel + "liter");
      System.out.printf("\ndrive distance:-" + distance + "km");
  }
    public static void main(String[] agrs) {
        Car s=new Car();
        Scanner z=new Scanner(System.in);
        System.out.printf("enter brand name:-");
        s.brand=z.nextLine();
        System.out.printf("enter model:-");
        s.model=z.nextLine();
        System.out.printf("enter year of manufacturing:-");
        s.year=z.nextInt();
        System.out.printf("enter fuel:-");
        s.fuel=z.nextDouble();

     System.out.printf("enter distance:-");
     int distance=z.nextInt();
     s.drive(distance);
     System.out.printf("ente refuel in liter ");
     double refule=z.nextDouble();
     s.refule(refule);
     s.displayinfo();
    }
}