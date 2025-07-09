package ProblemSolve;

public class Single {
    void show(int a){
        System.out.println("instant method");
    }
    public static void display(){
        System.out.println("static method");
    }
 public static void main(String[] asd){
        Single s=new Single();
        int a=5;
        s.show(a);

        Single.display();
 }

}
