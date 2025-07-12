package Encaposulation;

import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private double fuellevel;
    private final double maxfuelcapacity=15;
    private final double milespergallon=25;
   public Car(String make,String model,int year){
       this.make=make;
       this.model=model;
       this.year=year;
       this.mileage=0;
       this.fuellevel=0;
   }
   public String getMake(){
      return make;
   }
   public String getModel(){
       return model;
   }
   public int getYear(){
       return year;
   }
   public double getFuellevel(){
       return fuellevel;
   }
   public int getMileage(){
       return mileage;
   }
   public void addfuel(double gallon){
       if(gallon<=0){
           System.out.println("fuel must be positive");
           return;
       }
      if(fuellevel+gallon<=maxfuelcapacity){
          fuellevel=fuellevel+gallon;
          System.out.println("fuel level " + fuellevel+ "gallon");
      }
      else{
       double added=maxfuelcapacity-fuellevel;
       fuellevel=maxfuelcapacity;
       System.out.println("only " + added + "maximum 15 gallon");
      }
   }
   public void drive(int miles){
     if(miles<=0){
         System.out.println("miles must be positive");
     }
     double requiredfuel=miles/milespergallon;
     if(fuellevel>=requiredfuel){
         mileage+=miles;
         fuellevel-=requiredfuel;
         System.out.println("drive " + miles + "miles");
     }
     else{
         System.out.println("not enough fuel to drive " + miles + "miles");
     }
   }
   public boolean canDrive(int miles){
       double requriedfuel=miles/milespergallon;
       return fuellevel>=requriedfuel;
   }
public static void main(String[] as){
    Scanner s=new Scanner(System.in);

    System.out.println("enter car details");
    System.out.printf("make:-");
    String make=s.nextLine();
    System.out.printf("model:-");
    String model=s.nextLine();
    System.out.printf("year:-");
    int year=s.nextInt();
    Car s1=new Car(make,model,year);
    int choice;
    do{
        System.out.println("===menu===");
        System.out.println("1.add fuel");
        System.out.println("2.drive");
        System.out.println("3.check fuel level");
        System.out.println("4.check mileage");

        System.out.printf("enter choice:-");
        choice=s.nextInt();
      switch(choice){
          case 1:
              System.out.printf("enter gallon to add:-");
              double gallon=s.nextDouble();
              s1.addfuel(gallon);
              break;
          case 2:
              System.out.printf("enter miles to drive:-");
              int miles=s.nextInt();
              if(s1.canDrive(miles)){
                  s1.drive(miles);
              }
              else{
                  System.out.println("not enough fuel to drive:-" + miles);
              }
              break;
          case 3:
              System.out.printf("fuel level: %.2f gallon\n",s1.getFuellevel());
              break;
          case 4:
              System.out.println("mileage:- " + s1.getMileage());
              break;
          default:
              System.out.printf("invalid choice");
      }
    }while(choice!=4);
}

}
