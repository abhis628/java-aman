package Constructor;
import java.util.Scanner;
public class Book {
    String titel;
    String author;
    double price;
    Book(String titel,String author,double price){
        this.titel=titel;
        this.author=author;
        this.price=250;
    }
    Book(String titel,String author){
        this.titel=titel;
       this.author=author;

    }
    void display(){
        System.out.println("titel:- " + titel);
        System.out.println("author:- " + author);
        System.out.println("price:-" + price);
    }
    public static void main(String[] asdf){

        Scanner s=new Scanner(System.in);
        System.out.printf("enter book titel:-");
        String titel=s.nextLine();
        System.out.printf("enter book author:-");
        String author=s.nextLine();
        System.out.printf("enter price:-");
        double price=s.nextDouble();
        Book s1=new Book(titel,author,price);
        s1.display();
        System.out.printf("entre title:-");
        String titel1=s.nextLine();
        System.out.printf("enter author:-");
        String author1=s.nextLine();
        Book s2=new Book(titel,author);
        System.out.println(s2);
        s2.display();

    }
}
