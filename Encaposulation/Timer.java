package Encaposulation;

public class Timer {
    private long startTime;
    private long endTime;
    private boolean isRunning;

    public Timer(){
        this.startTime=0;
        this.endTime=0;
        this.isRunning=false;
    }
    public void Start(){
        startTime=System.currentTimeMillis();
        isRunning=true;
        System.out.println("timer is started");
    }
    public void endtime(){
        if(isRunning){
            endTime=System.currentTimeMillis();
            isRunning=false;
            System.out.println("timeer is end");
        }
        else{
            System.out.println("timer is not running");
        }
    }
    public double getElapsedsecond(){
        if(isRunning){
            return (System.currentTimeMillis()-startTime)/1000.0;
        }
        else{
            return (endTime-startTime)/1000.0;
        }
    }
    public void reset(){
        startTime=0;
        endTime=0;
        isRunning=false;
        System.out.println("time is reset");
    }
    public boolean isRunning(){
        return isRunning;
    }
    public static void main(String[] as){
     Timer s1=new Timer();
     s1.Start();
     s1.endtime();
     System.out.println(" elapse time:- " + s1.getElapsedsecond());
//     s1.reset();
    }
}
