package Interface;

import java.util.Scanner;

public interface Taxable {
    double calculateTax(double income);
}
class Empolyee implements Taxable{

    private static final double percentage=10;

     public double calculateTax(double income){
         return income*0.10;
     }
}
class Business implements Taxable{

    private static final double percentage=15;

    public double calculateTax(double income){
        return income*0.15;
    }
}
class Tax{
    public static void main(String[] vs){
        double income=50000;

        Empolyee s1=new Empolyee();
        Business s2=new Business();

        System.out.println("empolyee tax " + s1.calculateTax(income));
        System.out.println("business tax " + s2.calculateTax(income));
    }
}