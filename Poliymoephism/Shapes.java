package Poliymoephism;

public class Shapes {
    void printshape(){
        System.out.println("this is shape");
    }
}
class Square extends Shapes{
    void printshape(){
        System.out.println("this is square");
    }
}
class Tringle extends Square{
    void printshape(){
        System.out.println("this is tringle");
    }
  public static void main(String[] as){
        Shapes s1=new Shapes();
        Square s2=new Square();
        Tringle s3=new Tringle();
        s1.printshape();
        s2.printshape();
        s3.printshape();
  }
}
