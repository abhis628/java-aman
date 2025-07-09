package classobject;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee {
  String name;
  int employeeid;
  double salary;
//  String department;
    public Employee(String name,int employeeid,double salary){
        this.name=name;
        this.employeeid=employeeid;
        this.salary=salary;
//        this.department=department;
    }
  public void work(int hour) {
      System.out.printf("Employee working hour is" + hour);
  }
      public void show_details()
      {
          System.out.println("employee details are\n");
          System.out.println("emp name-->" +  name);
          System.out.println("emp id-->" + employeeid);
          System.out.println("emp salary-->"+ salary);
      }
    public static void main(String[] agrs){

        Scanner a=new Scanner(System.in);

        System.out.printf("enter employee name:-");
        String name=a.nextLine();
        System.out.printf("enter employee id:-");
        int employeeid=a.nextInt();
        System.out.printf("enter employee salary:-");
        double salary=a.nextDouble();
        System.out.println("\n");
//        System.out.printf("enter empolyee department:-");
//        String department=a.nextLine();
//        System.out.printf("enter working hour:-");
//        int hour=a.nextInt();
//        z.work(hour);
        Employee z=new Employee (name,employeeid,salary);
        z.show_details();
    }
}
