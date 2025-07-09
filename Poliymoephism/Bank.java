package Poliymoephism;

public class Bank {
    int interstrate(){

        return 0;
    }
}
class Sbi extends Bank{
    int interstrate(){
        int s=5;
        return s;
    }
}
class Hdfc extends Sbi{
    @Override
    int interstrate(){
        int h=6;
        return h;
    }
}
class Icici extends Hdfc{
    int interstrate(){
        int i=7;
        return i;
    }
  public static void main(String[] as){
       Sbi s2=new Sbi();
       Hdfc s3=new Hdfc();
      Icici s4=new Icici();

      int result=s2.interstrate();
      System.out.println("sbi intrest rate " + result + "%");
      int result1=s3.interstrate();
      System.out.println("hdfc intrest rate " + result1 + "%");
      int result2=s4.interstrate();
      System.out.println("icici intrest rate " + result2 + "%");

  }
}
