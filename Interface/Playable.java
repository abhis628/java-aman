package Interface;

public interface Playable {
    void play();
}
class MusicPlayer implements Playable{

    public void play(){
        System.out.println("music player is playing");
    }
}
class VideoPlayer implements Playable{

    public void play(){
        System.out.println("video player is playing");
    }

    public static void main(String[] as){
         Playable[] s=new Playable[2];
         s[0]=new MusicPlayer();
         s[1]=new VideoPlayer();
         for(Playable p:s){
             p.play();
         }
    }
}
