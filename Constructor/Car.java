package Constructor;

import java.util.Scanner;

public class Car {
    String model;
    double mileage;

    Car(String model, double mileage) {
        this.model = model;
        this.mileage = mileage;
    }
    void sendforservice(Carservice service){
        service.serviceCar(this);
    }
}
class Carservice{
   void serviceCar(Car car){
      System.out.println("serviceing car:-" + car.model);
    }

       public static void main(String[] asdf) {
           Scanner a=new Scanner(System.in);
           System.out.printf("enter car model:-");
           String model=a.nextLine();
           System.out.printf("enter car mileage:-");
           double mileage=a.nextDouble();
           Car s1=new Car(model,mileage);

           Carservice s2=new Carservice();
           System.out.printf("enter car model for service:-");
           String servicecenter=a.nextLine();
           s1.sendforservice(s2);
       }
   }
