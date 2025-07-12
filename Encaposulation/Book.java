package Encaposulation;

import java.util.Scanner;

public class Book {
   private String title;
   private String author;
   private final String isbn;
   private int pages;
   private boolean isavailable;

   public Book(String title,String author,String isbn,int pages){
       this.title=title;
       this.author=author;
       this.isbn=isbn;
       this.pages=pages;
       this.isavailable=true;
  }
   public String getTitle(){
       return title;
   }
   public String getAuthor(){
       return author;
   }
   public String getIsbn(){
       return isbn;
   }
   public int getPages(){
       return pages;
   }
   public boolean isAvailable(){
       return isavailable;
   }
   public void borrobook() {
       if (isavailable) {
           isavailable = false;
           System.out.println("book borro successfully");
       } else {
           System.out.println("book is already borrow");
       }
   }
   public void getreturnBook(){
           if(!isavailable){
               isavailable=true;
               System.out.println("book return successfully");
           }
           else{
               System.out.println("book not returned");
           }
       }
    public String getBookinfo(){
           return "title:- " + title +
                   "\nauthor:-" + author +
                   "\nisbn:-" + isbn +
                   "\npages:- " + pages +
                   "\nAvailable:-" + (isavailable?"yes": "no");
       }
public static void main(String[] as){
    Scanner s=new Scanner(System.in);
    System.out.printf("enter book title:-");
    String title=s.nextLine();
    System.out.printf("enter book author:-");
    String author=s.nextLine();
    System.out.printf("enter isbn:-");
    String isbn=s.nextLine();
    System.out.printf("enter page:-");
    int pages=s.nextInt();
    Book s1=new Book(title,author,isbn,pages);
    int choice;

    do{
       System.out.println("1.book info");
       System.out.println("2.borro book");
       System.out.println("3.return book");
       System.out.println("4.exit");

       System.out.printf("enter choice:-");
       choice =s.nextInt();
     switch(choice){
         case 1:
             System.out.println("--book info--");
             System.out.println(s1.getBookinfo());
             break;
         case 2:
             s1.borrobook();
             break;
         case 3:
             s1.getreturnBook();
             break;
         case 4:
             System.out.println("exit");
             break;
         default:
             System.out.println("invailid choice");
     }
    }while(choice!=4);
   }
}
