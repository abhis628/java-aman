package Encaposulation;

import java.util.Scanner;

public class Movie {
    private String titel;
    private String director;
    private int year;
    private double rating;
    private boolean isrented;
    public Movie(String titel,String director,int year,double rating){
        this.titel=titel;
        this.director=director;
        this.year=year;
        this.rating=rating;
    }
    public String getTitel(){
        return titel;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public void getRentmovie(){
        if(isrented){
            isrented=false;
            System.out.println("movie is rented");
        }
        else{
            System.out.println("movie is not rented");
        }
    }
    public void getReturnmovie(){
        if(!isrented){
            isrented=true;
            System.out.println("movie is return");
        }
        else{
            System.out.println("movie is not return");
        }
    }
    public void setRating(double rating){
        if(rating>=0&&rating<=10){
            this.rating=rating;
        }
        else{
            System.out.println("rating must be between 0 to 10");
        }
    }
    public String getMoviestatus(){
        return "available " + (isrented? "available":"rented");
    }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);
      System.out.printf("entre movie name:-");
      String titel=s.nextLine();
      System.out.printf("enter director name:-");
      String director=s.nextLine();
      System.out.printf("enter year:-");
      int year=s.nextInt();
      System.out.printf("enter rating:-");
      double rating=s.nextDouble();
      Movie s1=new Movie(titel,director,year,rating);
      s1.setRating(rating);
      System.out.println("titel= " + s1.getTitel());
      System.out.println("director= " + s1.getDirector());
      System.out.println("year= " + s1.getYear());
      s1.getRentmovie();
      s1.getReturnmovie();
      System.out.println("available- " + s1.getMoviestatus());
  }
}
