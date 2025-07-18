package Abstraction;

abstract class MediaPlayer {
    protected String filename;
    abstract void play();
}
class Audioplayer extends MediaPlayer{
    public Audioplayer(String filename){
        this.filename=filename;
    }
    void play(){
        System.out.println("playing audio " + filename);
    }
}
class Videoplayer extends MediaPlayer{
    public Videoplayer(String filename){
        this.filename=filename;
    }
    void play(){
        System.out.println("vedip playing " + filename);
    }
  public static void main(String[] as){
        String filename="song.mp3";
        Audioplayer s1=new Audioplayer(filename);
        String filename1="movie.mp4";
        Videoplayer s2=new Videoplayer(filename1);
        s1.play();
        s2.play();
  }
}