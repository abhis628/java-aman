package classobject;

import java.util.Scanner;

public class Movie {
    String title;
    String gener;
    int duration;
    double rating;

    Movie(String title,String gener,int duration,double rating){
        this.title=title;
        this.gener=gener;
        this.duration=duration;
        this.rating=rating;
    }
    void updateRating(double newRating){
        rating=newRating;
        System.out.println("new rating:-" +rating);
    }
    void watchmovie(){
        System.out.println("you are watching the movie:-" +title);
    }
    void showmovieinfo() {
        System.out.println("movie title:-" + title);
        System.out.println("movie gener:-" + gener);
        System.out.println("movie duration:-" + duration + "min");
        System.out.println("movie rating:-" + rating);
    }
    public static void main(String[] agrs){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter movie title:-");
        String title=a.nextLine();
        System.out.printf("enter movie gener:-");
        String gener=a.nextLine();
        System.out.printf("enter movie duration:-");
        int duration=a.nextInt();
        System.out.printf("enter movie rating:-");
        double rating=a.nextDouble();

        Movie s1=new Movie(title,gener,duration,rating);
        System.out.printf("enter new rating to update:-");
        double newRating=a.nextDouble();
        s1.updateRating(newRating);
        s1.watchmovie();
        s1.showmovieinfo();

    }
}
