package classobject;

import java.util.Scanner;

public class Book {
  String title;
  String author;
  double price;
  int page;

  void readpage(int count){
      count=count++;
     System.out.printf("you read page:-" + count + "pages\n");
  }
  void updateprice(double newprice){
      price=newprice;
      System.out.printf("\nnew price of book:-" + price + "rs\n");
  }
  void displaybookinfo(){

      System.out.printf("--book details--");
      System.out.printf("\nbook title:-" + title );
      System.out.printf("\nauthor name:-" + author);
      System.out.printf("\nbook price:-" + price + "rs");
      System.out.printf("\nbook page no:-" + page);


  }

    public static void main(String[] agrs){
        Book z=new Book();
        Scanner a=new Scanner(System.in);

        System.out.printf("enter book title:-");
        z.title=a.nextLine();
        System.out.printf("enter author name:-");
        z.author=a.nextLine();
        System.out.printf("enter book price:-");
        z.price=a.nextDouble();
        System.out.printf("enter page no:-");
        z.page=a.nextInt();

        System.out.printf("how many page you read:-");
        int count=a.nextInt();
        z.readpage(count);
        System.out.printf("enter new price:-");
        double newprice=a.nextDouble();
        z.updateprice(newprice);
        z.displaybookinfo();

    }
}
