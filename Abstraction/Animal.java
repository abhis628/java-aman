package Abstraction;

abstract  class Animal {
    abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog barking");
    }
    void describe(){
        System.out.println("this is dog");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("cat mewow");
    }
    void discribe(){
        System.out.println("this is cat");
    }
}
class Cow extends Animal{
    public void sound(){
        System.out.println("cow moo");
    }
    void describe(){
        System.out.println("this is cow");
    }

  public static void main(String[] as){
        Dog s1=new Dog();
        Cat s2=new Cat();
        Cow s3=new Cow();
        s1.describe();
        s1.sound();
        s2.discribe();
        s2.sound();
        s3.describe();
        s3.sound();
  }
}
