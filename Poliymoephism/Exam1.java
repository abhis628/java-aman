package Poliymoephism;

public class Exam1 {
    Exam1(){
        System.out.println("this is const1");
    }
    Exam1(int age){
        System.out.println("this is const2 " + age);
    }
    public static void main(String[] d){
        Exam1 s=new Exam1();
        Exam1 s1=new Exam1(4);
    }
}
