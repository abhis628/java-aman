package Poliymoephism;

public class Animal {
    void makesound() {
        System.out.println("Animal make sound");
    }
}
class Dog  extends Animal {
    @Override
    void makesound() {
        System.out.println("dog bark");
    }
}
class Cat extends Dog{
    @Override
    void makesound(){
        System.out.println("cat meow");
    }
    public static void main(String[] as){
        Animal s1=new Animal();
        Dog s2=new Dog();
        Cat s3 =new Cat();
        s1.makesound();
        s2.makesound();
        s3.makesound();
    }
}
