package Interface;


 interface printable{
     public static final int b=13;
     void print();
 }
public class Doucment implements printable{
     public static final int a=12;
    public void print(){
        System.out.println("doucoment printed");
    }
}
class Image implements printable{
    public void print(){
        System.out.println("image print");
    }
   public static void main(String[] as){
     Doucment s=new Doucment();
     s.print();
     Image s2=new Image();
     s2.print();
   }
}
