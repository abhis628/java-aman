package FiveWeek;

public class Person {
    void show(){
        System.out.println("person name is as");
    }
}
class Empolyee extends Person{
    void details(){
        System.out.println("empolyee name is ag");
    }
}
class Manager extends Empolyee {
    void showinfo(){
        System.out.println("manager name is ae");
    }
  public static void main(String[] as){
        Manager s1=new Manager();
        s1.show();
        s1.details();
        s1.showinfo();
  }
}
