package Poliymoephism.methodoverride;

public class Vihicle {
    void display(int age){
        System.out.println("parent class method " + age);
    }
}
class Car extends Vihicle{
    @Override
    void display(int age){
        System.out.println("child class method " + age);
    }
  public static void main(String[] as){

      Car s=new Car();
        s.display(2);
//        s.display();
  }
}
