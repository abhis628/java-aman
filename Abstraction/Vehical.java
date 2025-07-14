package Abstraction;

abstract class Vehical {

    void display(){
        System.out.println("concreate method");
    }
    static void show(){
        System.out.println("this is static method");
    }
    abstract void run();
}
class Car extends Vehical{
    public void run(){
        System.out.println("running");
    }
 public static void main(String[] as){
        Car s1=new Car();
        s1.show();
        s1.display();
        s1.run();
    }
}
