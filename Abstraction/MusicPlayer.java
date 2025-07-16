package Abstraction;

import java.util.Scanner;

interface MusicPlayer {
    void playSong(String name);
}
class SpotifyPlayer implements MusicPlayer{

    public void playSong(String name){
        System.out.println("playing " + name + " on spotify player");
    }
    public void Pause(){
        System.out.println("song puase");
    }
}
class LocalPlayer implements MusicPlayer{

     public void playSong(String name){
         System.out.println("playing " + name + " on local player");
     }
     public void puase(){
         System.out.println("song puase on local player");
     }
  public static void main(String[] as){
      Scanner s=new Scanner(System.in);
      System.out.printf("enter song name:-");
      String name=s.nextLine();

      SpotifyPlayer s1=new SpotifyPlayer();

      System.out.println("enter song name:-");
      String name1=s.nextLine();

      LocalPlayer s2=new LocalPlayer();

      s1.playSong(name);
      s1.Pause();
      s2.playSong(name1);
      s2.puase();
  }
}

