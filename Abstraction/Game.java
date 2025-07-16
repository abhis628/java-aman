package Abstraction;

abstract class Game {

    abstract void play();

    public void start(){
        System.out.println("game start");
    }
}
class Cricket extends Game{

    public void play(){
        super.start();
        System.out.print("playing cricket\n");
    }
}
class Chess extends Game{

    public void play(){
        super.start();
        System.out.printf("playing chess");
    }
}
class Main{

    public static void main(String[] as){
        Cricket s1=new Cricket();
        Chess s2=new Chess();
         s1.play();
        s2.play();

    }
}

