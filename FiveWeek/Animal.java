package FiveWeek;

public class Animal {
    void show(){
        System.out.println("animals");
    }
}
class Dog extends Animal{
    void show(){
        super.show();
        System.out.println("dog barking");
    }
  public static void main(String[] as){
        Dog s1=new Dog();
        s1.show();
  }
}