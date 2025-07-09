package Inheritence;

public class Animal {
    void eat(){
        System.out.println("perent class");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("dog is running");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("bird is fly");
    }
  public static void main(String[] asdf){
        Animal s1=new Animal();
        s1.eat();
        Dog s2=new Dog();
        s2.eat();
        s2.run();
        bird s3=new bird();
        s3.eat();
        s3.fly();
  }
}