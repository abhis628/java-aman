package Inheritence;

public class vehicle {
    int notyer=4;
    void color(){
        System.out.println("car color is black" + " car has:-" +notyer);
    }
}
class Car extends vehicle{
    void makesound(){
        System.out.println("car sound is vurum vurum");
    }
 public static void main(String[] asdf){
        Car s1=new Car();
        s1.color();
        s1.makesound();
 }
}