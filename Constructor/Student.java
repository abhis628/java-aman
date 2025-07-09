package Constructor;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void showinfo() {
        StudentInfo aman = new StudentInfo();
        aman.printstudentinfo(this);
    }
}
 class StudentInfo{
   void printstudentinfo(Student s) {
      System.out.println("id " + s.id);
      System.out.println("name:-" + s.name);
   }
   public static void main(String[] asdf) {
        Scanner a=new Scanner(System.in);
        System.out.printf("enter id:-");
        int id=a.nextInt();
        a.nextLine();
        System.out.printf("enter name:-");
        String name=a.nextLine();
        Student s1=new Student(id,name);
        s1.showinfo();

    }

}
