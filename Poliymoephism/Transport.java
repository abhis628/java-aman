package Poliymoephism;

public class Transport {

    void travelmode(){
        System.out.println("traveling");
    }
}
class Bus extends Transport{
    void travelmode(){
        System.out.println("traveling by bus");
    }
}
class Train extends Bus{
    void travelmode(){
        System.out.println("traveling by train");
    }
}
class Flight extends Train{
    void travelmode(){
        System.out.println("traveling by flight");
    }
  public static void main(String[] as){
        Transport t;
        t= new Bus();
        t.travelmode();
        t=new Train();
        t.travelmode();
        t= new Flight();
        t.travelmode();
  }
}
