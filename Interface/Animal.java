package Interface;

public interface Animal {
    void makesound();
}
class Dog implements Animal{

    public void makesound(){
        System.out.println("dog brarking");
    }
}
class Cat implements Animal{

    public void makesound(){
        System.out.println("cat meow");
    }
}
class Cow implements Animal{

    public void makesound(){
        System.out.println("cow bhoo");
    }
  public static void main(String[] as){
        Animal[] s=new Animal[3];
        s[0]=new Dog();
        s[1]=new Cat();
        s[2]=new Cow();
     System.out.println("animal sound");
     for(Animal animal:s){
         animal.makesound();
     }
  }
}
