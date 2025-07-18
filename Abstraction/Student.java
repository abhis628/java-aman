package Abstraction;

abstract class Student {
    protected int roll;
    protected String name;
    protected int mark;

    abstract void generetreport();
    public int getMark(){
        return mark;
    }
    public void setMark(int mark){
        if(mark>=0&&mark<=100){
            this.mark=mark;
        }
        else{
            System.out.println("mark must be 0 to 100");
        }
    }
}
class Engineer extends Student{

    public Engineer(int roll,String name,int mark){
        this.roll=roll;
        this.name=name;
        this.mark=mark;
    }
    public void generetreport(){
        System.out.println("roll no " + roll);
        System.out.println("name " + name);
        if(mark>40){
            System.out.println("pass " + mark);
        }
        else{
            System.out.println("fail " + mark);
        }
    }
}
class Medical extends Student{
    public Medical(int roll,String name,int mark){
        this.roll=roll;
        this.name=name;
        this.mark=mark;
    }
    public void generetreport(){
        System.out.println("roll no " + roll);
        System.out.println("name " + name);
        if(mark>40){
            System.out.println("pass " + mark);
        }
        else{
            System.out.println("fail " + mark);
        }
    }

 public static void main(String[] as){
        Engineer s1=new Engineer(1,"aman",60);
        Medical s2=new Medical(2,"aditya",34);
        s1.generetreport();
        s2.generetreport();
 }

}
