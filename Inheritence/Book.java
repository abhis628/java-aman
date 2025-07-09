package Inheritence;

import java.util.Scanner;

public class Book {
    String tital;
    String author;
    Book(String tital,String author){
        this.tital=tital;
        this.author=author;
    }
    void showinfo(){
        System.out.println("Book tital:-" + tital);
        System.out.println("Book author:-" + author);
    }
}
class LibraryBook extends Book{
    int selnumber;
    LibraryBook(String tital,String author,int selnumber){
        super(tital,author);
        this.selnumber=selnumber;
    }
    void showinfo(){
        super.showinfo();
        System.out.println("selnumber:-" + selnumber);
    }
 public static void main(String[] asdf){
     Scanner a=new Scanner(System.in);
     System.out.printf("enter book tital:-");
     String tital=a.nextLine();
     System.out.printf("enter author:-");
     String author=a.nextLine();
     System.out.printf("enter selnumber:-");
     int selnumber=a.nextInt();
     LibraryBook s1=new LibraryBook(tital,author,selnumber);
     s1.showinfo();
 }
}