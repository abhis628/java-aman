package Poliymoephism;

public class Exam {
    void display(int age){
        System.out.println("method 1  " + age);
    }
    void display(){
      System.out.println("name ");
    }
    public static void main(String[] as){
        Exam s=new Exam();
        s.display();
        s.display(2);
    }
}
