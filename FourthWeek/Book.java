package FourthWeek;

import java.util.Scanner;

public class Book {
    String name;
    String author;
    int page;
    Book(String name,String author,int page){
        this.name=name;
        this.author=author;
        this.page=page;
    }
    public String toString(){
        return "book details \n" +
                "name:- " + name + "\n" +
                "author:- " + author + "\n" +
                "page:-" + page + "\n";
    }

    public static void main(String[] as){
        Scanner s=new Scanner(System.in);
        System.out.printf("enter name:-");
        String name=s.nextLine();
        System.out.printf("enter author:-");
        String author=s.nextLine();
        System.out.printf("enter page:-");
        int page=s.nextInt();
        Book s1=new Book(name,author,page);
        System.out.println(s1);

    }
}
