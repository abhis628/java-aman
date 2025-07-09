package Inheritence;

import java.util.Scanner;

public class Food {
    String foodname;
    Food(String foodname){
        this.foodname=foodname;
    }
    void display(){
        System.out.println("food name:-" + foodname);
    }
}
class Desert extends Food{
    String sweetnesslevel;
    Desert(String foodname,String sweetnesslevel){
        super(foodname);
        this.sweetnesslevel=sweetnesslevel;
    }
    void display(){
        super.display();
        System.out.println("food sweetnesslevel:-" + sweetnesslevel);
    }
 public static void main(String[] as){
     Scanner a=new Scanner(System.in);
     System.out.printf("enter food name:-");
     String foodname=a.nextLine();
     System.out.printf("enter sweetnesslevel:-");
     String sweetnesslevel=a.nextLine();
     Desert s1=new Desert(foodname,sweetnesslevel);
     s1.display();
 }
}
