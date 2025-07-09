package ProblemSolve;

import java.util.Scanner;

public class Employee {
    public static void main(String[] agrs){
        Scanner aman=new Scanner(System.in);
        System.out.printf("enter employee:-");
        String name=aman.nextLine();
        System.out.printf("enter id:-");
        int id=aman.nextInt();
        System.out.printf("enter salary:-");
         int salary=aman.nextInt();

        System.out.printf("employee name:- " + name + "\nemployee id:- " + id + "\nemployee salary:-" + salary);
    }
}
