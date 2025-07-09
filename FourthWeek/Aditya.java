package FourthWeek;

public class Aditya {
    int match;
    int run;
    int ave;
    Aditya(int match,int run,int ave){
        this.match=match;
        this.run=run;
        this.ave=ave;
    }
    public int hashCode(){
        return match + run + ave;
    }

    public static void main(String[] as){

    }
}
