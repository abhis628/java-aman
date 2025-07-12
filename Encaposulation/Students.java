package Encaposulation;

import java.util.Scanner;

public class Students {
    private String name;
    private int roll;
    private double mathgrade;
    private double sciencegrade;
    private double englishgrade;

  public Students(String name,int roll){
      this.name=name;
      this.roll=roll;
  }
    public void setName(String newname){
      name=newname;
    }
    public void setRoll(int newroll){
      roll=newroll;
    }
    public void setMathgrade(double mathgrade) {
        if(mathgrade>=0&&mathgrade<=100){
            this.mathgrade=mathgrade;
        }
        else{
            System.out.println("invailid mathgrade");
        }
    }
    public void setSciencegrade(double sciencegrade){
      if(sciencegrade>=0&&sciencegrade<=100){
          this.sciencegrade=sciencegrade;
      }
      else{
          System.out.println("invailid sciencegrade");
      }
    }
    public void setEnglishgrade(double englishgrade){
      if(englishgrade>=0&&englishgrade<=100){
          this.englishgrade=englishgrade;
      }
      else{
          System.out.println("invailid englishgrade");
      }
    }
    public String getName(){
      return name;
    }
    public int getRoll(){
      return roll;
    }
    public double getMathgrade(){
      return mathgrade;
    }
    public double getSciencegrade(){
      return sciencegrade;
    }
    public double getEnglishgrade(){
      return englishgrade;
    }
  public double getAverage(){
      double average=(mathgrade+sciencegrade+englishgrade)/3;
      return average;
  }
  public char getLetterGrade(){
      double average=getAverage();
      if(average>=90&&average<=100){
          return 'A';
      }else if(average>=80&&average<=89){
          return 'B';
      }else if(average>=70&&average<=79){
          return 'C';
      }else if(average>=60&&average<=69){
          return 'D';
      }else{
          return 'F';
      }
  }
 public static void main(String[] as){
     Scanner s=new Scanner(System.in);
      System.out.printf(" student name:-");
      String name=s.nextLine();
      System.out.printf("student roll:-");
      int roll=s.nextInt();
     Students  s1=new Students(name,roll);

     System.out.print("enter math no:-");
     double mathgrade=s.nextDouble();
     System.out.printf("enter science no:-");
     double sciencegrade=s.nextDouble();
     System.out.printf("enter english no:-");
     double englishgrade=s.nextDouble();
     s1.setMathgrade(mathgrade);
     s1.setSciencegrade(sciencegrade);
     s1.setEnglishgrade(englishgrade);
     System.out.println("name:- " + s1.getName());
     System.out.println("roll no:- " + s1.getRoll());
     System.out.println("math grade:- " + s1.getMathgrade());
     System.out.println("science grade:- " + s1.getSciencegrade());
     System.out.println("english grade:- " + s1.getEnglishgrade());
     System.out.println("average:- " + s1.getAverage());
     System.out.println("grade:- " + s1.getLetterGrade());
 }
}
