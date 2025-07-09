package Constructor;

import java.util.Scanner;

public class Empolyee {
    int id;
    String name;
    String department;
    Empolyee(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
    Empolyee(int id,String name){
        this(id,name,"general");
    }
    void display(){
        System.out.println("id:-" + id);
        System.out.println("name:-" + name);
        System.out.println("department:-" + department);
    }
    public static void main(String[] asdf){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter id:-");
        int id=a.nextInt();
        a.nextLine();
        System.out.printf("enter name:-");
        String name=a.nextLine();
        System.out.printf("enter departmentent:-");
        String department=a.nextLine();
        Empolyee s1=new Empolyee(id,name,department);


        System.out.printf("enter id:-");
        int id1=a.nextInt();
        a.nextLine();
        System.out.printf("enter name:-");
        String name1=a.nextLine();
        Empolyee s2=new Empolyee(id1,name1);
        System.out.println(s2);
        s2.display();

    }
}