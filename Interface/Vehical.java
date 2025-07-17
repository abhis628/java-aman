package Interface;

public interface Vehical {

    void start();
    void stop();
    String fueltype();
}
class Car implements Vehical{

    public void start(){
        System.out.println("car is start");
    }

    public String fueltype(){
        return "diesel";
    }
    public void stop(){
        System.out.println("car is stop");
    }

}
class Bike implements Vehical{

    public void start(){
        System.out.println("bike is start");
    }
    public String fueltype(){
        return "petrol";
    }
    public void stop(){
        System.out.println("bike is stop");
    }

   public static void main(String[] as){
        Car s1=new Car();
        s1.start();
        System.out.println("fuel type " + s1.fueltype());
        s1.stop();
        Bike s2=new Bike();
        s2.start();
        System.out.println("fuel type " +s2.fueltype());
        s2.stop();
   }
}
