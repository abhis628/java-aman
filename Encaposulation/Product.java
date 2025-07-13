package Encaposulation;

import java.util.Scanner;

public class Product {
    private int productid;
    private String name;
    private double price;
    private int quantity;

    private Product(int productid,String name,double price,int quantity){
        this.productid=productid;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public int getProductid(){
        return productid;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }
        else{
            System.out.println("price must be positive");
        }
    }
    public void AddStock(int amount){
        if(amount>0){
            quantity=quantity+amount;
        }
        else{
            System.out.println("add amount must be positive");
        }
    }
    public void SellProduct(int amount){
        if(amount>0){
            System.out.println("amount to sell must be positive");
        }else if(amount > quantity){
            System.out.println("not enough stock to sell " + amount + "items");
        }else{
            quantity=quantity-amount;
            System.out.println("solled " + amount + "units of " + name);
        }
    }
    public double getTotalvalue(){
        return price*quantity;
    }
    public boolean isinstack(){
        return quantity>0;
    }
 public static void main(){
     Scanner s=new Scanner(System.in);

     System.out.printf("enter product id:-");
     int productid=s.nextInt();
     System.out.printf("enter product name:-");
     String name=s.nextLine();
     System.out.printf("enter price:-");
     double price=s.nextDouble();
     System.out.printf("enter quantity:-");
     int quantity=s.nextInt();

     Product s1=new Product(productid,name,price,quantity);

     System.out.printf("enter amount:-");
     int amount=s.nextInt();
     s1.AddStock(amount);
     System.out.println("\nstack after adding " + s1.getQuantity());
     System.out.printf("enter amount");
     int amount1=s.nextInt();
     s1.SellProduct(amount1);
     System.out.println("total value:-" + s1.getTotalvalue());
     System.out.println("is stock:-" + s1.isinstack());

 }
}
