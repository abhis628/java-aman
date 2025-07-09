package Constructor;

import java.util.Scanner;

public class Product {
    int id;
    String name;
    double price;
    Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    void applyDiscount(double discountpercentage){
        double discountamount=(this.price*discountpercentage)/100;
          this.price=this.price-discountamount;
    }
    void displayProductinfo(){
        System.out.println("product id:-" + id);
        System.out.println("product name:-" + name);
        System.out.println("product price:-" + price);
        System.out.println("product discount price:-" + this.price);
    }
    public static void main(String[] asd){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter product id:-");
        int id=a.nextInt();
        a.nextLine();
        System.out.printf("enter product name:-");
        String name=a.nextLine();
        System.out.printf("enter product price:-");
        double price=a.nextDouble();
        Product s1=new Product(id,name,price);

        System.out.printf("enter discount percentage:-");
        double discount=a.nextDouble();
        s1.applyDiscount(discount);

        s1.displayProductinfo();

    }
}
