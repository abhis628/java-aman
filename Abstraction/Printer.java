package Abstraction;

import java.util.Scanner;

public interface Printer {
    void print(String document);
}
class Inkjet implements Printer{

    public void print(String document){
        System.out.println(" printing " + document + "using inkjet printer");
    }
}
class Laser implements Printer {

    public void print(String document){
        System.out.println("printing " + document + "using laser printer");
    }
}
class sert{
    public static void main(String[] as) {
        Scanner s = new Scanner(System.in);
        System.out.printf("enter document");
        String document=s.nextLine();
        Inkjet s1=new Inkjet();
        s1.print(document);
        System.out.printf("enter document");
        String document1=s.nextLine();
        Laser s2=new Laser();
        s2.print(document1);
    }
}
