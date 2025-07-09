package Inheritence;

public class LivingBeing {
    void breath(){
        System.out.println("breathing");
    }
}
class Animales extends LivingBeing{
    void eat(){
        System.out.println("eating");
    }
}
class Doges extends Animales{
    void bark(){
        System.out.println("barking");
    }
  public static void main(String[] asdf){
        Doges s1=new Doges();
        s1.breath();
        s1.eat();
        s1.bark();
  }
}
