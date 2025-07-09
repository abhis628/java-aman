package Inheritence;

public class AnimalExample {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Cat extends AnimalExample{
    void sound(){
        System.out.println("meows");
    }
 public static void main(String[] asd){
        Cat s1=new Cat();
        s1.eat();
        s1.sound();
 }
}