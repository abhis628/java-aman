package Inheritence;

public class Parent {
    Parent(){
        System.out.println("Parent constructor called");
    }
}
class Child extends Parent{
    void child(){
        System.out.println("child constructor called");

    }
    public static void main(String[] asdf){
        Child s1=new Child();
        s1.child();
    }

}
