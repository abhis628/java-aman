package Wrapper.java;

public class WrapperExample {

    public static void main(String[] agrs){
     int num=Integer.parseInt("123");
     System.out.println("preaed Integer " +num);

     String str=Integer.toString(456);
     System.out.println("string " + str);

     Integer a=10;
     Integer b=10;
     System.out.println("compair result " + a.compareTo(b));

     Integer c=20;
     Integer d=24;
     System.out.println("c and d are equal" + c.equals(d));



    }
}
